package com.example.vvce.calculator;

/**
 * Simple calculator application.
 */
public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Addition: " + app.add(20, 5));
        System.out.println("Subtraction: " + app.sub(20, 5));
    }
}

