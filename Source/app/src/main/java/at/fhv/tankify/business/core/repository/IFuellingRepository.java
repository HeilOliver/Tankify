package at.fhv.tankify.business.core.repository;

import java.util.List;

import at.fhv.tankify.models.FuellingModel;
import at.fhv.tankify.models.VehicleModel;

public interface IFuellingRepository extends IBindableRepository<FuellingModel>, ICrudRepository<FuellingModel> {

    List<FuellingModel> getForVehicle(VehicleModel vehicleModel);
}
