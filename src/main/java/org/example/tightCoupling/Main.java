package org.example.tightCoupling;


import org.example.tightCoupling.order.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("12345");
    }
}