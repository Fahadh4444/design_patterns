package org.patterns.creational.prototype;

public class PrototypeClient {
    public static void runClient(){
        ShapePrototype original = new ShapePrototype("Circle");
        ShapePrototype copy = original.clone();

        original.draw();
        copy.draw();
    }
}
