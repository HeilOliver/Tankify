package at.fhv.tankify.business.infrastructure.repository;

import android.annotation.TargetApi;
import android.os.Build;

import com.rits.cloning.Cloner;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import at.fhv.tankify.business.core.repository.BindableRepository;
import at.fhv.tankify.business.core.repository.ICrudRepository;
import at.fhv.tankify.models.EntityModel;

public abstract class RepositoryMock<T extends EntityModel> extends BindableRepository<T> implements ICrudRepository<T> {

    private final HashSet<T> mockRepo = new HashSet<>();
    private AtomicInteger idGenerator;

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public List<T> getAll() {
        return mockRepo
                .stream()
                .map(this::copy)
                .collect(Collectors.toList());
    }

    @Override
    public T get(int id) {
        T obj = getById(id);
        return copy(obj);
    }

    @Override
    public void add(T entity) {
        int newId = idGenerator.incrementAndGet();
        try {
            FieldUtils.writeField(entity, "id", newId, true);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return;
        }
        T copy = copy(entity);
        mockRepo.add(copy);
    }

    @Override
    public void delete(T entity) {
        int id = entity.getId();

        T obj = getById(id);
        mockRepo.remove(obj);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void update(T entity) {
        int id = entity.getId();

        T obj = getById(id);
        mockRepo.remove(obj);
        mockRepo.add(copy(entity));
    }

    private T getById(int id) {
        for (T t : mockRepo) {
            if (t.getId() != id)
                continue;
            return t;
        }

        throw new NoSuchElementException();
    }

    private T copy(T toCopy) {
        Cloner cloner=new Cloner();
        return cloner.deepClone(toCopy);
    }
}
