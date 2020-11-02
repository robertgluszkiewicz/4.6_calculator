package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Calculator {

    public double subtractAFromB(double a, double b) {
        return a - b;
    }

    public double addAtoB(double a, double b) {
        return a + b ;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double subtractAFromBResult = calculator.subtractAFromB(6.66, 1.11);
        double addAtoBResult = calculator.addAtoB(10, 1.11);

        System.out.println(subtractAFromBResult);
        System.out.println(addAtoBResult);
    }

}
