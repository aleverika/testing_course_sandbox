package ru.aleverika.geometry.figures;

import static javax.management.Query.and;

public record Triangle(
    double a,
    double b,
    double c){
    public Triangle{
        if ((a <= 0) || (b <= 0) || (c <= 0)){
            throw new IllegalArgumentException("Triangle side is negative");
        }
        if (!((a+b>=c) & (a+c>=b) & (c+b>=a))
            ){
            throw new IllegalArgumentException("This triangle is not exist");
        }
    }
    public double get_triangle_aria () {
        double p;
        p = get_triangle_circumference()/2;
        return Math.sqrt(p*(p- this.a)*(p-this.b)*(p-this.c));
    }

    public double get_triangle_circumference() {
        return this.a + this.b + this.c;
    }
}
