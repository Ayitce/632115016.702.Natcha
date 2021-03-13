package week13;

import java.lang.Math;

public class Circle extends Shape {
    double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
