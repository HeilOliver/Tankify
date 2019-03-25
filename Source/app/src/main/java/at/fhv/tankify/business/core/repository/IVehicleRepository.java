package at.fhv.tankify.business.core.repository;

import at.fhv.tankify.models.VehicleModel;

public interface IVehicleRepository extends ICrudRepository<VehicleModel>, IBindableRepository<VehicleModel> {

    VehicleModel getDefault();
}
