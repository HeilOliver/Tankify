package at.fhv.tankify.business.infrastructure.response;

import at.fhv.tankify.business.core.response.BaseEntityResponse;
import at.fhv.tankify.models.VehicleModel;

public class UpdateVehicleResponse extends BaseEntityResponse<VehicleModel> {
    public UpdateVehicleResponse(boolean success, VehicleModel model) {
        super(success, model);
    }
}
