package org.example.tightCoupling.order;

import org.example.tightCoupling.payment.UpiPaymentService;

public class OrderService {
    private UpiPaymentService paymentService;

    public OrderService() {
        // Directly creating an instance of PaymentService. This creates tight coupling.
        this.paymentService = new UpiPaymentService();
    }

    public void placeOrder(String orderId) {
        System.out.println("Placing order: " + orderId);
        paymentService.processPayment(orderId);
    }
}
