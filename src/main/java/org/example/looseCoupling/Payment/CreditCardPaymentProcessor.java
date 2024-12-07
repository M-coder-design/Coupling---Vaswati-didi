package org.example.looseCoupling.Payment;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String orderId) {
        System.out.println("Processing credit card payment for order: " + orderId);
    }
}
