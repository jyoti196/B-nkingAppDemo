package com.bankingsystem.main;

import com.bankingsystem.account.*;
import com.bankingsystem.model.Customer;
import com.bankingsystem.model.Transaction;
import com.bankingsystem.notification.EmailNotification;
import com.bankingsystem.notification.NotificationService;
import com.bankingsystem.payment.PayUGateway;
import com.bankingsystem.payment.PaymentService;
import com.bankingsystem.payment.RazorpayGateway;
import com.bankingsystem.transaction.NEFTProcessor;
import com.bankingsystem.transaction.TransactionService;
import com.bankingsystem.transaction.UPIProcessor;

public class BankingAppDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Jyoti", "jyoti@bank.com", "VERIFIED");

        // SRP - clean account creation
        AccountValidator validator = new AccountValidator();
        NotificationService notifier = new EmailNotification();
        AccountService accountService = new AccountService(validator, notifier);
        accountService.createAccount(customer);

        // LSP - both account types behave correctly
        Account savings = new SavingsAccount();
        Account loan = new LoanAccount();
        savings.calculateInterest();
        loan.calculateInterest();

        // OCP - new transaction types easily added
        TransactionService txnService = new TransactionService();
        txnService.execute(new NEFTProcessor(), new Transaction(5000));
        txnService.execute(new UPIProcessor(), new Transaction(1200));

        // DIP - easily switch payment gateways
        PaymentService razorpayService = new PaymentService(new RazorpayGateway());
        razorpayService.makePayment(2500);

        PaymentService payuService = new PaymentService(new PayUGateway());
        payuService.makePayment(4000);
    }
}
