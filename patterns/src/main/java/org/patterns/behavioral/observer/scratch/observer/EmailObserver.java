package org.patterns.behavioral.observer.scratch.observer;
import org.patterns.behavioral.observer.scratch.Event;

public record EmailObserver(String email) implements Observer {
    @Override
    public void update(Event event) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + event);
    }
}
