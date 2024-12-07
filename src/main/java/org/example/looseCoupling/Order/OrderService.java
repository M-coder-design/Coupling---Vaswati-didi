package org.example.looseCoupling.Order;

import org.example.looseCoupling.Payment.PaymentProcessor;

public class OrderService {
    private PaymentProcessor paymentProcessor;

    // Constructor injection: inject the payment processor dependency
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(String orderId) {
        System.out.println("Placing order: " + orderId);
        paymentProcessor.processPayment(orderId);
    }
}
