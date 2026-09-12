package builder;

import model.Car;

public class SportsCarBuilder implements CarBuilder {
    private String brand;
    private String model;
    private int seatingCapacity;
    private String engine;
    private boolean gpsEnabled;

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setSeatingCapacity(int seatingCapacity) {
        if (seatingCapacity < 1 || seatingCapacity > 2) {
            throw new IllegalArgumentException("Sports cars must have 1 or 2 seats.");
        }
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setGpsEnabled(boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
        return this;
    }

    @Override
    public Car build() {
        if (brand == null || model == null || engine == null) {
            throw new IllegalStateException("Cannot build SportsCar: essential fiels are missing.");
        }
        return new Car(brand, model, seatingCapacity, engine, gpsEnabled);
    }
}