package at.fhv.tankify.business.infrastructure.request;

import at.fhv.tankify.business.core.request.BaseRequest;
import at.fhv.tankify.models.FuellingModel;
import at.fhv.tankify.models.VehicleModel;

public class AddFuellingRequest extends BaseRequest<FuellingModel> {

    private final VehicleModel vehicle;

    public AddFuellingRequest(FuellingModel model, VehicleModel vehicle) {
        super(model);
        this.vehicle = vehicle;
    }

    public VehicleModel getVehicle() {
        return vehicle;
    }
}
