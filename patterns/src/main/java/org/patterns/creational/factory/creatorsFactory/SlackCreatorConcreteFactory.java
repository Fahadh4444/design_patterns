package org.patterns.creational.factory.creatorsFactory;

import org.patterns.creational.factory.products.Notification;
import org.patterns.creational.factory.products.SlackNotification;

public class SlackCreatorConcreteFactory extends CreatorAbstractFacotry{
    @Override
    public Notification creatorNotificationFactory(){
        return new SlackNotification();
    }
}
