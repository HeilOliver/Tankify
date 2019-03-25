package at.fhv.tankify.business.core.request;

public abstract class BaseRequest<T> {

    private final T model;

    protected BaseRequest(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }
}
