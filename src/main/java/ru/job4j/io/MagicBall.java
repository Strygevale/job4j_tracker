package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String res = answer == 0 ? "Да" : answer == 1 ? "Нет" : "Может быть";
        System.out.println(res);

    }
}
