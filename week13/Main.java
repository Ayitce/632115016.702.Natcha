package week13;

public class Main {
    public static void main(String[] args){
        Circle cc = new Circle(7);
        Rectangle rg = new Rectangle(8,4);
        Triangle tg = new Triangle(5,6);

        System.out.println(cc.getArea());
        System.out.println(rg.getArea());
        System.out.println(tg.getArea());
    }
}
