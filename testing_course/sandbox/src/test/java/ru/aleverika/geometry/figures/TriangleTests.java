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
    @Test
    void IsTriangleExist() {
        try {
            var t = new Triangle(34, 5, 3);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //  ok
        }
    }

    @Test
    void NotNegativeSide(){
            try {
                var t = new Triangle(-5, 6, 7);
                Assertions.fail();
            } catch (IllegalArgumentException exception) {
                // ok
            }
        }
    @Test
    void EqualTriangle(){
        var t1 = new Triangle(3, 6, 8);
        var t2 = new Triangle(6, 8, 3);
        Assertions.assertEquals(t1, t2);
    }
    @Test
    void notEqualTriangle(){
        var t1 = new Triangle(3, 6, 8);
        var t2 = new Triangle(3, 4, 5);
        Assertions.assertNotEquals(t1, t2);
    }

    }

