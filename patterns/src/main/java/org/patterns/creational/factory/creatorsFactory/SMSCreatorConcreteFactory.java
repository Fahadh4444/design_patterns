package org.patterns.creational.factory.creatorsFactory;

import org.patterns.creational.factory.products.Notification;
import org.patterns.creational.factory.products.SMSNotification;

public class SMSCreatorConcreteFactory extends CreatorAbstractFacotry{
    @Override
    public Notification creatorNotificationFactory(){
        return new SMSNotification();
    }
}
