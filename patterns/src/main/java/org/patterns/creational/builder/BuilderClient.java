package org.patterns.creational.builder;

import org.patterns.creational.builder.builder.BikeBuilder;
import org.patterns.creational.builder.builder.CarBuilder;

public class BuilderClient {
    public static void main() {
        Director director = new Director();  // Optional without use of Director also we can proceed
        CarBuilder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        carBuilder.brand("Fahadh");
        System.out.println(CarBuilder.build());

        BikeBuilder bikeBuilder = new BikeBuilder();
        director.buildTriumph(bikeBuilder);
        bikeBuilder.engine("900CC");
        System.out.println(BikeBuilder.build());
    }
}
