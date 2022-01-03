package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2parametres() {
        int left = 1;
        int right = 20;
        int expected = 20;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void max3parametres() {
        int left = 1;
        int right = 10;
        int up = 5;
        int expected = 10;
        int rsl = Max.max(left, right, up);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void max4parametres() {
        int left = 2;
        int right = 4;
        int up = 5;
        int down = 11;
        int expected = 11;
        int rsl = Max.max(left, right, up, down);
        Assert.assertEquals(expected, rsl);
    }
}