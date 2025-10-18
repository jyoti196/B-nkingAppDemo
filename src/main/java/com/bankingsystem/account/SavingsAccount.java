package com.bankingsystem.account;

public class SavingsAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("Savings Account: Interest at 4%");
    }
}
