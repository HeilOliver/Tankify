package at.fhv.tankify.modules;

import javax.inject.Singleton;

import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import at.fhv.tankify.business.core.usecase.IAddFuellingUseCase;
import at.fhv.tankify.business.core.usecase.IAddVehicleUseCase;
import at.fhv.tankify.business.core.usecase.ICalculateStatisticUseCase;
import at.fhv.tankify.business.core.usecase.IDeleteVehicleUseCase;
import at.fhv.tankify.business.core.usecase.IUpdateVehicleUseCase;
import at.fhv.tankify.business.infrastructure.usecase.AddFuellingUseCase;
import at.fhv.tankify.business.infrastructure.usecase.AddVehicleUseCase;
import at.fhv.tankify.business.infrastructure.usecase.CalculateStatisticUseCase;
import at.fhv.tankify.business.infrastructure.usecase.DeleteVehicleUseCase;
import at.fhv.tankify.business.infrastructure.usecase.UpdateVehicleUseCase;
import dagger.Module;
import dagger.Provides;

@Module
public class UseCaseModule {

    @Provides
    public IAddFuellingUseCase providesAddFuelingUC(IVehicleRepository vehicleRepository, IFuellingRepository fuellingRepository) {
        return new AddFuellingUseCase(fuellingRepository, vehicleRepository);
    }

    @Provides
    public IAddVehicleUseCase providesAddVehicleUC(IVehicleRepository vehicleRepository){
        return new AddVehicleUseCase(vehicleRepository);
    }

    @Provides
    public ICalculateStatisticUseCase providesCalcStatisticUC(IVehicleRepository vehicleRepository, IFuellingRepository fuellingRepository){
        return new CalculateStatisticUseCase(fuellingRepository, vehicleRepository);
    }

    @Provides
    public IDeleteVehicleUseCase providesDeleteVehicleUC(IVehicleRepository vehicleRepository, IFuellingRepository fuellingRepository){
        return new DeleteVehicleUseCase(fuellingRepository, vehicleRepository);
    }

    @Provides
    public IUpdateVehicleUseCase providesUpdateVehicleUC(IVehicleRepository vehicleRepository){
        return new UpdateVehicleUseCase(vehicleRepository);
    }
}
