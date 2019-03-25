package at.fhv.tankify.business.infrastructure.repository;

import java.util.List;

import at.fhv.tankify.business.core.repository.BindableRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.models.VehicleModel;

public class VehicleRepository extends BindableRepository<VehicleModel> implements IVehicleRepository {

    @Override
    public List<VehicleModel> getAll() {

        return null;
    }

    @Override
    public VehicleModel get(int id) {

        return null;
    }

    @Override
    public void add(VehicleModel entity) {

    }

    @Override
    public void delete(VehicleModel entity) {

    }

    @Override
    public void update(VehicleModel entity) {

    }

    @Override
    public VehicleModel getDefault() {
        return null;
    }
}
