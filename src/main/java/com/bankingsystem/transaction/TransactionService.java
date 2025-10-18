package com.bankingsystem.transaction;

import com.bankingsystem.model.Transaction;

public class TransactionService {
    public void execute(TransactionProcessor processor, Transaction txn) {
        processor.processTransaction(txn);
    }
}
