package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiply(int k) {
        return k * x;
    }

    public int sumAllOperation(int y, int z, int a, int k) {
        return sum(y) + multiply(z) + minus(a) + divide(k);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(4);
        int multiply = calculator.multiply(5);
        int minus = minus(5);
        int divide = calculator.divide(5);
        int rsl = calculator.sumAllOperation(sum, multiply, minus, divide);
        System.out.println(rsl);
    }
}
