package at.fhv.tankify.business.core.repository;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

public class BindableRepository<T> implements IBindableRepository<T> {

    private ObservableList<T> modelList;

    public BindableRepository() {
        modelList = new ObservableArrayList<>();
    }

    @Override
    public ObservableList<T> getModelList() {
        return modelList;
    }
}
