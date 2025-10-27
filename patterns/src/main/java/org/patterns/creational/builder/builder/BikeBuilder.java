package org.patterns.creational.builder.builder;

import org.patterns.creational.builder.products.Bike;

public class BikeBuilder implements Builder{
    private static int id;
    private static int height;
    private static String brand;
    private static String model;
    private static String color;
    private static String engine;
    private static int nbrOfDoors;

    @Override
    public BikeBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public BikeBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public BikeBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public BikeBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public BikeBuilder height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public BikeBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public BikeBuilder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public static Bike build() {
        return new Bike(id, brand, model, color, height, engine, nbrOfDoors);
    }
}
