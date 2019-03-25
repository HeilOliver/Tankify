package at.fhv.tankify.business.infrastructure.request;

import at.fhv.tankify.business.core.request.BaseRequest;
import at.fhv.tankify.models.VehicleModel;

public class UpdateVehicleRequest extends BaseRequest<VehicleModel> {
    protected UpdateVehicleRequest(VehicleModel model) {
        super(model);
    }
}
