package at.fhv.tankify.models;

import android.location.Location;

import java.time.LocalDateTime;

public class FuellingModel extends EntityModel{
    private Location location;
    private LocalDateTime dateTime;
    private double amount;
    private double price;
    private double mileage;

    public Location getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getMileage() {
        return mileage;
    }
}
