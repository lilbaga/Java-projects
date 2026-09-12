package builder;

import model.Car;

public interface CarBuilder {
    CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setSeatingCapacity(int seatingCapacity);
    CarBuilder setEngine(String engine);
    CarBuilder setGpsEnabled(boolean gpsEnabled);
    Car build();
}
