package at.fhv.tankify.business.infrastructure.usecase;

import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.usecase.IAddVehicleUseCase;
import at.fhv.tankify.business.infrastructure.request.AddVehicleRequest;
import at.fhv.tankify.business.infrastructure.response.AddVehicleResponse;

public class AddVehicleUseCase implements IAddVehicleUseCase {


    private final IVehicleRepository repository;

    public AddVehicleUseCase(IVehicleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AddVehicleResponse Handle(AddVehicleRequest value) {


        return new AddVehicleResponse(false, value.getModel());
    }
}
