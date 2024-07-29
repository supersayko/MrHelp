package com.example.ngoapplication;

public class MoneyData {

    String amount, name, message;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MoneyData() {
    }

    public MoneyData(String amount, String name, String message) {
        this.amount = amount;
        this.name = name;
        this.message = message;
    }
}
