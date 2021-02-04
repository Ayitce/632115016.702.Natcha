package week9;

public class MainShape {
    public static void main(String[] args){
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        
        Shape s2 = new Rectangle(5, 5);
        System.out.println(s2.toString());
        
        Shape s3 = new Cube(5, 5, 5);
        System.out.println(s3.toString());
        
    }
    
}
