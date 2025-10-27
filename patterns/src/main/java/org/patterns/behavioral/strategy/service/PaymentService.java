package org.patterns.behavioral.strategy.service;

import lombok.Setter;
import org.patterns.behavioral.strategy.strategy.PaymentStrategy;

@Setter
public class PaymentService {
    private int cost;
    private boolean isIncludedDelivery = true;

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(int cost){
        this.cost = cost;
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return isIncludedDelivery ? cost + 10 : cost;
    }
}
