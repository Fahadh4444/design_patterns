package org.patterns.creational.factory;

import org.patterns.creational.factory.creatorsFactory.CreatorAbstractFacotry;
import org.patterns.creational.factory.creatorsFactory.EmailCreatorConcreteFactory;
import org.patterns.creational.factory.creatorsFactory.SMSCreatorConcreteFactory;
import org.patterns.creational.factory.creatorsFactory.SlackCreatorConcreteFactory;
import org.patterns.creational.factory.products.Notification;

public class FactoryClient {
    public static void runClient(){
        CreatorAbstractFacotry  creator;

        creator = new EmailCreatorConcreteFactory();
        creator.send("You got Email!!!");

        creator = new SMSCreatorConcreteFactory();
        creator.send("You got SMS!!!");

        creator = new SlackCreatorConcreteFactory();
        creator.send("You got Slack Message!!!");


    }
}

//It’s particularly useful in situations where:
//The exact type of object to be created isn't known until runtime.
//Object creation logic is complex, repetitive, or needs encapsulation.
//You want to follow the Open/Closed Principle, open for extension, closed for modification.