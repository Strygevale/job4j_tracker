package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                itemsWithoutNull[count] = name;
                count++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, count);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsFind = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (key.equals(name.getName())) {
                itemsFind[count] = name;
                count++;
            }
        }
        itemsFind = Arrays.copyOf(itemsFind, count);
        return itemsFind;
    }

}