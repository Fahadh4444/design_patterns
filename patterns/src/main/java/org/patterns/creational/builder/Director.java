package org.patterns.creational.builder;

import org.patterns.creational.builder.builder.Builder;

public class Director {
    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildTriumph(Builder builder){
        builder.brand("Triumph")
                .color("Red")
                .engine("400CC")
                .height(190);
    }
}
