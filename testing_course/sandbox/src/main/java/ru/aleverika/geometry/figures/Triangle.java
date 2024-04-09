package ru.aleverika.geometry.figures;

import java.lang.reflect.Type;
import java.util.Objects;

import static javax.management.Query.and;

public record Triangle(
        double a,
        double b,
        double c) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;

        return ((Double.compare(a, triangle.a) == 0 && (Double.compare(b, triangle.b) == 0) && (Double.compare(c, triangle.c) == 0)))
                || ((Double.compare(a, triangle.b) == 0) && (Double.compare(b, triangle.a) == 0) && (Double.compare(c, triangle.c) == 0))
                || ((Double.compare(a, triangle.c) == 0) && (Double.compare(c, triangle.b) == 0) && (Double.compare(b, triangle.a) == 0))
                || ((Double.compare(a, triangle.a) == 0 && (Double.compare(b, triangle.c) == 0) && (Double.compare(c, triangle.b) == 0)))
                || ((Double.compare(a, triangle.b) == 0 && (Double.compare(b, triangle.c) == 0) && (Double.compare(c, triangle.a) == 0)))
                || ((Double.compare(a, triangle.c) == 0 && (Double.compare(b, triangle.b) == 0) && (Double.compare(c, triangle.a) == 0)));
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Triangle {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalArgumentException("Triangle side is negative");
        }
        if (!((a + b >= c) & (a + c >= b) & (c + b >= a))
        ) {
            throw new IllegalArgumentException("This triangle is not exist");
        }
    }

    public double get_triangle_aria() {
        double p;
        p = get_triangle_circumference() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double get_triangle_circumference() {
        return this.a + this.b + this.c;
    }
}
