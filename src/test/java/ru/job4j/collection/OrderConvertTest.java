package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDuplicate() {
        List<Order> list = new ArrayList<>(Arrays.asList(
                new Order("1", "box"),
                new Order("1", "box"),
                new Order("2", "table")
        ));
        Map<String, Order> expected = new HashMap<>();
        expected.put("1", new Order("1", "box"));
        expected.put("2", new Order("2", "table"));
        assertThat(new OrderConvert().process(list), is(expected));
    }

}