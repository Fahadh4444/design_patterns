package org.patterns.creational.factory.creatorsFactory;

import org.patterns.creational.factory.products.Notification;

public abstract class CreatorAbstractFacotry {

    // Factory Method
    public abstract Notification creatorNotificationFactory();

    public void send(String message){
        Notification notification = creatorNotificationFactory();
        notification.send(message);
    }
}
