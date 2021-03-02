package week11;

class A {

}
class B extends A {

}
class C extends B {

}
public class InstanceOfDemo {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        Object c = new C();
        //Test the instance of object and class
        System.out.println("No. \t"  + "Object name \t" + "Class name \t" + "result");
        System.out.print("1 \t " + " a \t \t " + " A \t \t");
        System.out.println(a instanceof A);
        System.out.print("2 \t " + " b \t \t " + " B \t \t");
        System.out.println(b instanceof B);
        System.out.print("3 \t " + " b \t \t " + " A \t \t");
        System.out.println(b instanceof A);
        System.out.print("4 \t " + " a \t \t " + " B \t \t");
        System.out.println(a instanceof B);
        System.out.print("5 \t " + " c \t \t " + " C \t \t");
        System.out.println(c instanceof C);
        System.out.print("6 \t " + " c \t \t " + " A \t \t");
        System.out.println(c instanceof A);
        System.out.print("7 \t " + " c \t \t " + " B \t \t");
        System.out.println(c instanceof B);
    }
}
