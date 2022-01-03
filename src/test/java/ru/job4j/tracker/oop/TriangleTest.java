package ru.job4j.tracker.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area2() {
        Point a  = new Point(0, 3);
        Point b = new Point(4, 0);
        Point c = new Point(0, 0);
        Triangle triangl = new Triangle(a, b, c);
        double rsl = triangl.area();
        assertThat(rsl, closeTo(6, 0.001));
    }

    @Test
    public void area3() {
        Point a  = new Point(0, 0);
        Point b = new Point(0, 16);
        Point c = new Point(0, 17);
        Triangle triangl = new Triangle(a, b, c);
        double rsl = triangl.area();
        assertThat(rsl, closeTo(-1, 0.001));
    }
}