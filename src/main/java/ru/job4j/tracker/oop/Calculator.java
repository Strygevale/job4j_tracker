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

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(4));
        System.out.println(minus(7));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.sumAllOperation(1));
    }
}
