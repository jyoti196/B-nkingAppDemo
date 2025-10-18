package com.bankingsystem.account;

import com.bankingsystem.model.Customer;
import com.bankingsystem.notification.NotificationService;

public class AccountService {
    private final AccountValidator validator;
    private final NotificationService notifier;

    public AccountService(AccountValidator validator, NotificationService notifier) {
        this.validator = validator;
        this.notifier = notifier;
    }

    public void createAccount(Customer customer) {
        if (validator.isValid(customer)) {
            System.out.println("Account created for: " + customer.getName());
            notifier.notifyCustomer(customer);
        } else {
            System.out.println("KYC not verified for " + customer.getName());
        }
    }
}
