//**632115016 Natcha Petchsrikul */

package week5;

public class MainCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle(0.0,0.0,2.0);
        Circle circle2 = new Circle(1.0,2.0,3.0);
        Circle circle3 = new Circle(3.0,5.0);
        Circle circle4 = new Circle(-1.0,-10.0,-1.0);

        System.out.println("Area of cir1 = " + circle1.getArea());
        System.out.println("Circumference of cir1 = " + circle1.getCircumference());
        System.out.println("Area of cir2 = " + circle2.getArea());
        System.out.println("Circumference of cir2 = " + circle2.getCircumference());
        System.out.println("Area of cir3 = " + circle3.getArea());
        System.out.println("Circumference of cir3 = " + circle3.getCircumference());
        System.out.println("Area of cir4 = " + circle4.getArea());
        System.out.println("Circumference of cir4 = " + circle4.getCircumference());

        System.out.println("Is circle 1 intersec circle 2 : " + circle1.checkIntersect(circle2));
        System.out.println("Is circle 1 intersec circle 3 : " + circle1.checkIntersect(circle3));

    }
}
