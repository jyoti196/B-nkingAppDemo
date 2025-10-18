package com.bankingsystem.payment;

public class PayUGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via PayU");
    }
}