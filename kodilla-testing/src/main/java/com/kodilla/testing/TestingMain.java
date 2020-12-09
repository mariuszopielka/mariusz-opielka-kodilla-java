package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum = myCalculator.add(3, 3);
        int sub = myCalculator.subtract(4, 3);

        if(sum >=0 && sub >=0) {
            System.out.println("Adding a+b is: " + sum);
            System.out.println("Subtracting a-b is: " + sub);
        } else {
            System.out.println("Error : value below zero !!!");
        }
    }
}
