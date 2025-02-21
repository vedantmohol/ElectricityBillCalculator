package com.example.billcalculator.service;

import org.springframework.stereotype.Service;

import com.example.billcalculator.model.Bill;

@Service
public class BillService {

    public Bill calculateBill(int units) {
        double amount = 0;

        if (units <= 50) {
            amount = units * 3.50;
        } else if (units <= 150) {
            amount = (50 * 3.50) + ((units - 50) * 4.00);
        } else if (units <= 250) {
            amount = (50 * 3.50) + (100 * 4.00) + ((units - 150) * 5.20);
        } else {
            amount = (50 * 3.50) + (100 * 4.00) + (100 * 5.20) + ((units - 250) * 6.50);
        }

        return new Bill(units, amount);
    }
}
