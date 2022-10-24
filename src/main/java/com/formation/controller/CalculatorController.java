package com.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formation.service.Calculator;

public class CalculatorController {
    
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
        return String.valueOf(calculator.sum(a, b));
    }
}