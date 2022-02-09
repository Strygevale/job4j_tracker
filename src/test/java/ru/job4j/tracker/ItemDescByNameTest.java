package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {
    @Test
    public void whenDescSort() {
        List<Item> items = new ArrayList<>(Arrays.asList(
                new Item("Bob"),
                new Item("George"),
                new Item("Andrey")

        ));
        List<Item> expected = new ArrayList<>(Arrays.asList(
                new Item("George"),
                new Item("Bob"),
                new Item("Andrey")
        ));
        Collections.sort(items, new ItemDescByName());
        assertThat(expected, is(items));
    }
}