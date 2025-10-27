package org.patterns.behavioral.observer.scratch.observer;
import org.patterns.behavioral.observer.scratch.Event;

public record MobileObserver(String username) implements Observer {
    @Override
    public void update(Event event){
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + event);
    }
}
