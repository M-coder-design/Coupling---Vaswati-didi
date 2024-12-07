package org.example.looseCoupling.Payment;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String orderId) {
        System.out.println("Processing PayPal payment for order: " + orderId);
    }
}
