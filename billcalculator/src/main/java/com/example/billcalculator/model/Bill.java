package com.example.billcalculator.model;

public class Bill {
    private int units;
    private double totalAmount;

    public Bill(int units, double totalAmount) {
        this.units = units;
        this.totalAmount = totalAmount;
    }

    public int getUnits() {
        return units;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
