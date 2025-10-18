package com.bankingsystem.transaction;

import com.bankingsystem.model.Transaction;

public class NEFTProcessor implements TransactionProcessor {
    public void processTransaction(Transaction txn) {
        System.out.println("NEFT Transaction processed: ₹" + txn.getAmount());
    }
}
