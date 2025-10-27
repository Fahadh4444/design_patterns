package org.patterns.creational.builder.builder;

import org.patterns.creational.builder.products.Car;

public class CarBuilder implements Builder {
    private static int id;
    private static int height;
    private static String brand;
    private static String model;
    private static String color;
    private static String engine;
    private static int nbrOfDoors;

    @Override
    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public static Car build() {
        return new Car(id, brand, model, color, height, engine, nbrOfDoors);
    }

}
