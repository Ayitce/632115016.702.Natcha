package week13;

public class Rectangle extends Shape {
    double lenght;
    double height;

    public Rectangle() {

    }

    public Rectangle(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }

    public double getArea() {
        return lenght * height;
    }

}
