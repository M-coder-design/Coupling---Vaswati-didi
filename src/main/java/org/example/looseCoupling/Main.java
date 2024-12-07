package org.example.looseCoupling;

import org.example.looseCoupling.Order.OrderService;
import org.example.looseCoupling.Payment.CreditCardPaymentProcessor;
import org.example.looseCoupling.Payment.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        // Loose coupling achieved through dependency injection
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor(); // or PayPalPaymentProcessor
        OrderService orderService = new OrderService(paymentProcessor);
        orderService.placeOrder("12345");
    }
}
