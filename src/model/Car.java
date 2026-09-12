package model;

public class Car {
    private final String brand;
    private final String model;
    private final int seatingCapacity;
    private final String engine;
    private final boolean gpsEnabled;

    public Car(String brand, String model, int seatingCapacity, String engine, boolean gpsEnabled) {
        this.brand = brand;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.engine = engine;
        this.gpsEnabled = gpsEnabled;
    }

    public String getBrand() {
        return model;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isGpsEnabled() {
        return gpsEnabled;
    }

    @Override
    public String toString() {
        return String.format("Car [Brand=%s, Model=%s, Seats=%d, Engine=%s, GPS=%b]", brand, model, seatingCapacity, engine, gpsEnabled);
    }
}