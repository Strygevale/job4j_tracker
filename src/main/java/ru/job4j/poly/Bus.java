package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {

    private final int priceLiter = 100;

    @Override
    public void drive() {
        System.out.println("Следуюущая останока 'Конечная' ");
    }

    @Override
    public void people() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей ");
        String pas = scanner.nextLine();
        System.out.println(pas + " пассажиров");
    }

    @Override
    public int refill(int liter) {
        return liter * priceLiter;
    }
}
