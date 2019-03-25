package at.fhv.tankify.business.core.repository;

import androidx.databinding.ObservableList;

public interface IBindableRepository<T> {
    ObservableList<T> getModelList();
}
