package at.fhv.tankify.business.infrastructure.usecase;

import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.response.BaseResponse;
import at.fhv.tankify.business.core.usecase.IDeleteVehicleUseCase;
import at.fhv.tankify.business.infrastructure.request.UpdateVehicleRequest;

public class DeleteVehicleUseCase implements IDeleteVehicleUseCase {

    private final IFuellingRepository fuellingRepository;
    private final IVehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(IFuellingRepository fuellingRepository, IVehicleRepository vehicleRepository) {
        this.fuellingRepository = fuellingRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public BaseResponse Handle(UpdateVehicleRequest value) {
        return null;
    }
}
