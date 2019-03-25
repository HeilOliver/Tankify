package at.fhv.tankify.business.core.repository;

import java.util.List;

import at.fhv.tankify.models.EntityModel;

public interface ICrudRepository<T extends EntityModel> {

    List<T> getAll();

    T get(int id);

    void add(T entity);

    void delete(T entity);

    void update(T entity);
}
