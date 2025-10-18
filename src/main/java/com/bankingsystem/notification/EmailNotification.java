package com.bankingsystem.notification;

import com.bankingsystem.model.Customer;

public class EmailNotification implements NotificationService {
    public void notifyCustomer(Customer customer) {
        System.out.println("Email sent to: " + customer.getEmail());
    }
}