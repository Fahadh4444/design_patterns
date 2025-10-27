package org.patterns.behavioral.observer.scratch;
import org.patterns.behavioral.observer.scratch.observable.NotificationObservable;

import static org.patterns.behavioral.observer.scratch.Event.NEW_ITEM;
import static org.patterns.behavioral.observer.scratch.Event.SALE;

public class Store {

    private final NotificationObservable notificationObservable;

    public Store() {
        this.notificationObservable = new NotificationObservable();
    }

    public void newItemPromotion() {
        notificationObservable.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationObservable.notifyCustomers(SALE);
    }

    public NotificationObservable getService() {
        return notificationObservable;
    }

}
