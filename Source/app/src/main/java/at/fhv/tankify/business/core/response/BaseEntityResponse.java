package at.fhv.tankify.business.core.response;

public class BaseEntityResponse<T> extends BaseResponse {

    private final T model;

    public BaseEntityResponse(boolean success, T model) {
        super(success);
        this.model = model;
    }

    public T getModel() {
        return model;
    }
}
