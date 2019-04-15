package at.fhv.tankify.business.infrastructure.response;

import at.fhv.tankify.business.core.response.BaseEntityResponse;
import at.fhv.tankify.models.FuellingModel;

public class AddFuellingResponse extends BaseEntityResponse<FuellingModel> {
    public AddFuellingResponse(boolean success, FuellingModel model) {
        super(success, model);
    }

    public AddFuellingResponse(boolean success) {
        super(success, null);
    }
}
