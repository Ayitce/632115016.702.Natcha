package week11;

public class StudentData {
    public static void main(String[] args) {
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        System.out.println("------Name------");
        System.out.println("std01 and std02 : " + std01.equals(std02));
        System.out.println("std01 and std03 : " + std01.equals(std03));
        System.out.println("std02 and std04 : " + std02.equals(std04));
        System.out.println("std01 and std04 : " + std01.equals(std04));

        System.out.println("------Age------");
        System.out.println("std01 and std02 : " + std01.equals(std02));
        System.out.println("std03 and std04 : " + std03.equals(std04));
        System.out.println("std01 and std03 : " + std01.equals(std03));

        System.out.println("------gpa------");
        System.out.println("std01 and std03 " + std01.equals(std03));
        System.out.println("std02 and std04 " + std02.equals(std04));
        System.out.println("std02 and std03 " + std02.equals(std03));
    }
}
