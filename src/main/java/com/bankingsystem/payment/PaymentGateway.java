package com.bankingsystem.payment;

public interface PaymentGateway {
    void processPayment(double amount);
}
