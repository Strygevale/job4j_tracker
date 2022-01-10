package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Следуюущая останока 'Конечная' ");
    }

    @Override
    public int people() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей ");
        String pas = scanner.nextLine();
        System.out.println(pas + " пассажиров");
        return 0;
    }

    @Override
    public int refill(int price) {
        String res = price >= 500 ? "Будет заправлен полный бак " : price >= 250 && price < 500
                ? "Будет заправлено половина бака " : "Будет заправлено меньше половины ";
        System.out.println(res);
        return 0;
    }
}
