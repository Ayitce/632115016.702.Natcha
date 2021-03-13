package week13;

public class Triangle extends Shape {
    double lenght;
    double height;

    public Triangle() {
    }

    public Triangle(double lenght, double height) {
        this.height = height;
        this.lenght = lenght;
    }

    public double getArea() {
        return 0.5 * height * lenght;
    }
}
