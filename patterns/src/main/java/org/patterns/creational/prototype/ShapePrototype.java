package org.patterns.creational.prototype;

public class ShapePrototype implements Prototype{
    private String type;

    public ShapePrototype(String type) {
        this.type = type;
    }

    @Override
    public ShapePrototype clone(){
        return new ShapePrototype(this.type);
    }

    public void draw(){
        System.out.println("Drawing shape: " + type);
    }
}
