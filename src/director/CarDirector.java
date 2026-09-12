package director;

import builder.CarBuilder;
import model.Car;

public class CarDirector {

    public Car constructStandardSportsCar(CarBuilder builder) {
        return builder.setBrand("Ferrari")
                .setModel("F8")
                .setSeatingCapacity(2)
                .setEngine("V8")
                .setGpsEnabled(true)
                .build();
    }

    public Car constructStandardSUV(CarBuilder builder) {
        return builder.setBrand("Toyota")
                .setModel("Land")
                .setSeatingCapacity(7)
                .setEngine("V6")
                .setGpsEnabled(true)
                .build();
    }
}
