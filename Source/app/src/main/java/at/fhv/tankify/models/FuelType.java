package at.fhv.tankify.models;

public enum FuelType {
    Petrol(10),
    Diesel(5),
    Gas(4);

    private final double coOutput;

    FuelType(double coOutput) {
        this.coOutput = coOutput;
    }

    public double getCoOutput() {
        return coOutput;
    }
}
