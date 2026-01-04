package org.patterns;

import org.patterns.behavioral.observer.scratch.ObserverClient;
import org.patterns.behavioral.strategy.StrategyClient;
import org.patterns.creational.builder.BuilderClient;
import org.patterns.creational.factory.FactoryClient;
import org.patterns.creational.prototype.Prototype;
import org.patterns.creational.prototype.PrototypeClient;
import org.patterns.creational.singleton.SingletonClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Alphabet");
        System.out.println("C -> Creational");
        System.out.println("S -> Structural");
        System.out.println("B -> Behavioral");

        String alpha = scanner.nextLine().trim();

        if(alpha.equalsIgnoreCase("C")){
            System.out.println("1 - Singleton Pattern");
            System.out.println("2 - Builder Pattern");
            System.out.println("3 - Prototype Pattern");
            System.out.println("4 - Factory Pattern");
            System.out.println("Enter the number of the pattern");
            int num = scanner.nextInt();
            if(num == 1){
                SingletonClient singletonClient = new SingletonClient();
                singletonClient.main();
            }else if(num == 2){
                BuilderClient builderClient = new BuilderClient();
                builderClient.main();
            }else if(num == 3){
                PrototypeClient prototypeClient = new PrototypeClient();
                prototypeClient.runClient();
            }else if(num == 4){
                FactoryClient factoryClient = new FactoryClient();
                FactoryClient.runClient();
            }
        }else if(alpha.equalsIgnoreCase("S")){

        }else if(alpha.equalsIgnoreCase("B")){
            System.out.println("1 - Strategy Pattern");
            System.out.println("2 - Observer Pattern");
            System.out.println("Enter the number of the pattern");
            int num = scanner.nextInt();
            if(num == 1){
                StrategyClient strategyClient = new StrategyClient();
                strategyClient.runClient();
            }else if(num == 2){
                ObserverClient observerClient = new ObserverClient();
                observerClient.runClient();
            }
        }else{
            System.out.println("Enter wrong Alphabet");
        }

        scanner.close();


    }
}