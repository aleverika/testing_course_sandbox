package ru.aleverika.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateCirc() {
        var t = new Triangle(3,4,5);
        Assertions.assertEquals(12.0, t.get_triangle_circumference());
        t = new Triangle(5, 3, 6);
        Assertions.assertEquals(14.0, t.get_triangle_circumference());
        t = new Triangle(5,5,5);
        Assertions.assertEquals(15.0, t.get_triangle_circumference());
    }

    @Test
    void canCalculaiteAria() {
        var t = new Triangle(3, 4, 5);
        var epsilon = 0.001;
        Assertions.assertEquals(6.0, t.get_triangle_aria(), epsilon);
        t = new Triangle(5, 3, 6);
        Assertions.assertEquals(7.483, t.get_triangle_aria(), epsilon);
        t = new Triangle(5, 5, 5);
        Assertions.assertEquals(10.825, t.get_triangle_aria(), epsilon);
    }
}
