package ru.aleverika.geometry.figures;

import static javax.management.Query.and;

public class Triangle {
    double a;
    double b;
    double c;
    public Triangle(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double get_triangle_aria () {
        double p;
        p = get_triangle_circumference()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    public double get_triangle_circumference() {
        return this.a + this.b + this.c;
    }
}
