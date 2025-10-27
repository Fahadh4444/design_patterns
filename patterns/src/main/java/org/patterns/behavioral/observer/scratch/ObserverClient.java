package org.patterns.behavioral.observer.scratch;
import org.patterns.behavioral.observer.scratch.observer.EmailObserver;
import org.patterns.behavioral.observer.scratch.observer.MobileObserver;

import static org.patterns.behavioral.observer.scratch.Event.NEW_ITEM;
import static org.patterns.behavioral.observer.scratch.Event.SALE;

public class ObserverClient {

    public void runClient() {
        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailObserver("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailObserver("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailObserver("geekific@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileObserver("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailObserver("geekific@like.com"));
        store.salePromotion();
    }
}
