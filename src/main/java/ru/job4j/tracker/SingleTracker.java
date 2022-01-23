package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {

    private Tracker tracker = new Tracker();

    public SingleTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
      return tracker.replace(id, item);
    }

    public boolean delete(int id) {
       return tracker.delete(id);
    }
}
