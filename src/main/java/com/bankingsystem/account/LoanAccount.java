package com.bankingsystem.account;

public class LoanAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("Loan Account: Interest at 9%");
    }
}
