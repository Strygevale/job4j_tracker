package ru.job4j.tracker.oop;

public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song :" + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
