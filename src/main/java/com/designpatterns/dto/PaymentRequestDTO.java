package com.designpatterns.dto;

public class PaymentRequestDTO {

    private String method; // e.g., CreditCard or PayPal
    private int amount;

    // Getters and Setters
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

