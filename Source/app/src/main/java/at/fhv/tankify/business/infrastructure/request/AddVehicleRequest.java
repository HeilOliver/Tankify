package at.fhv.tankify.business.infrastructure.request;

import at.fhv.tankify.business.core.request.BaseRequest;
import at.fhv.tankify.models.VehicleModel;

public class AddVehicleRequest extends BaseRequest<VehicleModel> {


    protected AddVehicleRequest(VehicleModel model) {
        super(model);
    }
}
