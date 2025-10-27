package org.patterns.behavioral.strategy;


import org.patterns.behavioral.strategy.service.PaymentService;
import org.patterns.behavioral.strategy.strategy.PaymentByCreditCard;
import org.patterns.behavioral.strategy.strategy.PaymentByPayPal;

public class StrategyClient {
    PaymentService paymentService = new PaymentService();

    public void runClient(){
        // Credit Card
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("===============================");
        // Paypal
        paymentService.setPaymentStrategy(new PaymentByPayPal());
        paymentService.processOrder(150);
    }
}
