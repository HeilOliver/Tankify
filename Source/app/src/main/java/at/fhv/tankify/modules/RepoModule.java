package at.fhv.tankify.modules;

import javax.inject.Singleton;

import at.fhv.tankify.business.core.repository.IFuellingRepository;
import at.fhv.tankify.business.core.repository.IVehicleRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class RepoModule {

    @Provides
    @Singleton
    public IFuellingRepository provideFuellingRepo() {
        return null;
    }

    @Provides
    @Singleton
    public IVehicleRepository provideVehicleRepo(){
        return null;
    }
}
