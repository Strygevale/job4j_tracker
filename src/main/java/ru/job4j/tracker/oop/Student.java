package ru.job4j.tracker.oop;

public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 1; i <= 3; i++) {
            petya.music();
        }
        for (int j = 1; j <= 3; j++) {
            petya.song();
        }
    }
}
