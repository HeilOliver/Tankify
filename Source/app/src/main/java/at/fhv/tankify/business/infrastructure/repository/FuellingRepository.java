package at.fhv.tankify.business.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import at.fhv.tankify.business.core.repository.BindableRepository;
import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.models.FuellingModel;
import at.fhv.tankify.models.VehicleModel;

public class FuellingRepository extends BindableRepository<FuellingModel> implements IFuellingRepository {

    @Override
    public List<FuellingModel> getAll() {
        return null;
    }

    @Override
    public FuellingModel get(int id) {
        return null;
    }

    @Override
    public void add(FuellingModel entity) {

    }

    @Override
    public void delete(FuellingModel entity) {

    }

    @Override
    public void update(FuellingModel entity) {

    }

    @Override
    public List<FuellingModel> getForVehicle(VehicleModel vehicleModel) {
        return new ArrayList<>();
    }
}
