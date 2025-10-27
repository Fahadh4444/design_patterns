package org.patterns.creational.singleton;

public class SingletonClient {
    public static void main() {
        System.out.println(SingletonPattern.getInstance("Geekific"));
        SingletonPattern singleton = SingletonPattern.getInstance("Geekific");
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}
