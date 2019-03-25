package at.fhv.tankify.business.infrastructure.usecase;

import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.usecase.IAddFuellingUseCase;
import at.fhv.tankify.business.infrastructure.request.AddFuellingRequest;
import at.fhv.tankify.business.infrastructure.response.AddFuellingResponse;

public class AddFuellingUseCase implements IAddFuellingUseCase {

    private final IFuellingRepository fuellingRepository;
    private final IVehicleRepository vehicleRepository;

    public AddFuellingUseCase(IFuellingRepository fuellingRepository, IVehicleRepository vehicleRepository) {
        this.fuellingRepository = fuellingRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public AddFuellingResponse Handle(AddFuellingRequest value) {
        return null;
    }

}
