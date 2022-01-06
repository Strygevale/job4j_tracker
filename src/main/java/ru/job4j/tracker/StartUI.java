package ru.job4j.tracker;

import java.time.LocalDateTime;

public class StartUI {
    public static void main(String[] args) {
        Item item1 = new Item();
        LocalDateTime currentDateTimeFormat = item1.getCreated();
        System.out.println("Текущие дата и время: " + currentDateTimeFormat);
    }
}
