package ru.job4j.tracker.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(up, max(left, right));
    }

    public static int max(int left, int right, int up, int down) {
        return max(max(left, right, up), down);
    }
}
