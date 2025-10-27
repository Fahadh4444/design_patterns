package org.patterns.creational.singleton;

public class SingletonPattern {
    private final String data;
    private static volatile SingletonPattern instance;

    private SingletonPattern(String data) {
        this.data = data;
    }

    public static SingletonPattern getInstance(String data) {
        SingletonPattern result = instance;
        if (result == null) {
            synchronized (SingletonPattern.class) {
                result = instance;
                if (result == null) {
                    instance = result = new SingletonPattern(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
