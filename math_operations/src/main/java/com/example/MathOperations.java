package main.java.com.example;

public class MathOperations {

    public static void main(String[] args) {
        System.out.println("ADD :" +add(10,20));
        subtract(30,20);
        multiply(10,2);
        divide(10,2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}