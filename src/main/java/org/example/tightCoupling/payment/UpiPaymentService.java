package org.example.tightCoupling.payment;

public class UpiPaymentService {
    public void processPayment(String orderId) {
        System.out.println("Upi processing payment for order: " + orderId);
    }
}
