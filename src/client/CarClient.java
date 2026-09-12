package client;

import builder.CarBuilder;
import builder.SportsCarBuilder;
import builder.SUVCarBuilder;
import director.CarDirector;
import model.Car;

public class CarClient {
    public void runDemo() {
        CarDirector director = new CarDirector();

        CarBuilder sportsBuilder = new SportsCarBuilder();
        Car standardSports = director.constructStandardSportsCar(sportsBuilder);
        System.out.println("Director built: " + standardSports);

        Car customSuv = new SUVCarBuilder()
                .setBrand("BMV")
                .setModel("X7")
                .setSeatingCapacity(6)
                .setEngine("123")
                .setGpsEnabled(true)
                .build();
        System.out.println("Custom built: " + customSuv);
    }
}
