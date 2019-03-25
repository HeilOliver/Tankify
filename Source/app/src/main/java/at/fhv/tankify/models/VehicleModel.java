package at.fhv.tankify.models;

public class VehicleModel extends EntityModel {
    private String name;
    private String licencePlate;
    private double mileage;
    private boolean isDefault;
    private FuelType fuelType;

    public String getName() {
        return name;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
