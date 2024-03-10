package org.example.Calculator;

public class Service extends Calculator {
    private Logger logger;
    private Calculator calculator;

    public Service(Logger log, Calculator calculator) {
        this.logger = logger;
        this.calculator = calculator;
    }

    public double summ(double a, double b) {
        double result = calculator.summ(a, b);
        logger.log("Сумма " + a + "и " + b + "= " + result);
        return result;
    }

    public double separation(double a, double b) {
        double result = calculator.separation(a, b);
        logger.log("Деление " + a + "и " + b + "= " + result);
        return result;
    }

    public double multiplication(double a, double b) {
        double result = calculator.multiplication(a, b);
        logger.log("Умножение " + a + "и " + b + "= " + result);
        return result;
    }
}
