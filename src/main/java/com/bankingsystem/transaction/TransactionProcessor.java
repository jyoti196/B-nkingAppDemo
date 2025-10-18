package com.bankingsystem.transaction;

import com.bankingsystem.model.Transaction;

public interface TransactionProcessor {
    void processTransaction(Transaction txn);
}
