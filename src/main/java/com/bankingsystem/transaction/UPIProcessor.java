package com.bankingsystem.transaction;

import com.bankingsystem.model.Transaction;

public class UPIProcessor implements TransactionProcessor {
    public void processTransaction(Transaction txn) {
        System.out.println("UPI Transaction processed: ₹" + txn.getAmount());
    }
}
