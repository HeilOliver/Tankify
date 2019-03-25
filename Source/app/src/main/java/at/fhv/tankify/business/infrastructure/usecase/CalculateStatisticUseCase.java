package at.fhv.tankify.business.infrastructure.usecase;

import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.usecase.ICalculateStatisticUseCase;
import at.fhv.tankify.business.infrastructure.request.CalculateStatisticRequest;
import at.fhv.tankify.business.infrastructure.response.CalculateStatisticResponse;

public class CalculateStatisticUseCase implements ICalculateStatisticUseCase {

    private final IFuellingRepository fuellingRepository;
    private final IVehicleRepository vehicleRepository;

    public CalculateStatisticUseCase(IFuellingRepository fuellingRepository, IVehicleRepository vehicleRepository) {
        this.fuellingRepository = fuellingRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public CalculateStatisticResponse Handle(CalculateStatisticRequest value) {
        return null;
    }
}
