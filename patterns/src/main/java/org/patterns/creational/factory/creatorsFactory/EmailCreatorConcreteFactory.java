package org.patterns.creational.factory.creatorsFactory;

import org.patterns.creational.factory.products.EmailNotification;
import org.patterns.creational.factory.products.Notification;

public class EmailCreatorConcreteFactory extends CreatorAbstractFacotry{
    @Override
    public Notification creatorNotificationFactory(){
        return new EmailNotification();
    }
}
