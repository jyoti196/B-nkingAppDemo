package com.bankingsystem.account;

import com.bankingsystem.model.Customer;

public class AccountValidator {
    public boolean isValid(Customer customer) {
        return "VERIFIED".equalsIgnoreCase(customer.getKycStatus());
    }
}