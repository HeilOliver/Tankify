package at.fhv.tankify.business.core.response;

public class BaseResponse {
    private final boolean success;

    public BaseResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
