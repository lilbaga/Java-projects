package builder;

import model.Car;

public class SUVCarBuilder implements CarBuilder {
    private String brand;
    private String model;
    private int seatingCapacity;
    private String engine;
    private boolean gpsEnabled;

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand; // Исправлено (было this.model = model)
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setSeatingCapacity(int seatingCapacity) {
        if (seatingCapacity < 4 || seatingCapacity > 9) {
            throw new IllegalArgumentException("SUVs must accomodate between 4 and 9 seats.");
        }
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine; // Добавлен недостающий метод
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
            throw new IllegalStateException("Cannot build SUV: essential fields are missing.");
        }
        return new Car(brand, model, seatingCapacity, engine, gpsEnabled);
    }
}
