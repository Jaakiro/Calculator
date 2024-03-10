package org.example.Calculator;

public class Console implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
