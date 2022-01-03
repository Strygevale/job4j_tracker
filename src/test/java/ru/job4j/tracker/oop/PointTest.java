package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when12To46Then5() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11To05Then4dot12() {
        Point a = new Point(1, 1);
        Point b = new Point(0, 5);
        double expected = 4.12;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when23To46Then3dot6() {
        Point a = new Point(2, 3);
        Point b = new Point(4, 6);
        double expected = 3.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

}