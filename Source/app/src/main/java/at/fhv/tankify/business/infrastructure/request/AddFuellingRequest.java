package at.fhv.tankify.business.infrastructure.request;

import at.fhv.tankify.business.core.request.BaseRequest;
import at.fhv.tankify.models.FuellingModel;

public class AddFuellingRequest extends BaseRequest<FuellingModel> {
    protected AddFuellingRequest(FuellingModel model) {
        super(model);
    }
}
