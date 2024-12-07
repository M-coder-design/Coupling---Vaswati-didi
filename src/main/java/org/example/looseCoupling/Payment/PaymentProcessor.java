package org.example.looseCoupling.Payment;

public interface PaymentProcessor {
    void processPayment(String orderId);
}