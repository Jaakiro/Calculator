package org.example.Calculator;

public class Calculator {
    public double summ(double a, double b) {
        return a + b;
    }

    public double separation(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }
}
