package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String el) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        try {
            System.out.println(FindEl.indexOf(array, "2"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println(FindEl.indexOf(array, "5"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}