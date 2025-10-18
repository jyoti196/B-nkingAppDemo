package com.bankingsystem.model;

public class Customer {
    private String name;
    private String email;
    private String kycStatus;

    public Customer(String name, String email, String kycStatus) {
        this.name = name;
        this.email = email;
        this.kycStatus = kycStatus;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getKycStatus() { return kycStatus; }
}
