package at.fhv.tankify.business.infrastructure.usecase;

import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.usecase.IUpdateVehicleUseCase;
import at.fhv.tankify.business.infrastructure.request.UpdateVehicleRequest;
import at.fhv.tankify.business.infrastructure.response.UpdateVehicleResponse;


public class UpdateVehicleUseCase implements IUpdateVehicleUseCase {

    private final IVehicleRepository vehicleRepository;

    public UpdateVehicleUseCase(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public UpdateVehicleResponse Handle(UpdateVehicleRequest value) {
        return null;
    }
}
