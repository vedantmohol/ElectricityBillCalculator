package com.example.billcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.billcalculator.model.Bill;
import com.example.billcalculator.service.BillService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/calculate")
    public Bill calculateBill(@RequestParam int units) {
        return billService.calculateBill(units);
    }
}
