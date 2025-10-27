package org.patterns.behavioral.observer.scratch.observable;

import org.patterns.behavioral.observer.scratch.Event;
import org.patterns.behavioral.observer.scratch.observer.Observer;

import java.util.*;

public class NotificationObservable {
    private final Map<Event, List<Observer>> customers;

    public NotificationObservable() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public NotificationObservable(Map<Event, List<Observer>> customers) {
        this.customers = customers;
    }

    public void subscribe(Event eventType, Observer observer) {
        customers.get(eventType).add(observer);
    }

    public void unsubscribe(Event eventType, Observer observer) {
        customers.get(eventType).remove(observer);
    }

    public void notifyCustomers(Event eventType) {
        customers.get(eventType).forEach(observer -> observer.update(eventType));
    }
}