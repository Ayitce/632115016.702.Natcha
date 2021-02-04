package week9;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    // overiding toString()
    public String toString() {
        return "My first name " + firstname + " last name " + lastname;
    }

    public Student() {

    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Student p = new Student();
        System.out.println(p.toString());

        Student p2 = new Student("Yit","Narak");
        System.out.println(p2.toString());
    }
}
