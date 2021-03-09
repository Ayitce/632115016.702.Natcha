package week11;

public class Student {
    String name;
    int age;
    double gpa;

    Student() {
    }

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //name
    public boolean equals(Object ob) {
        if (ob instanceof Student) {
            return this.name == ((Student)ob).name;
        }
        else {
        return false;
        }
    }
    //age
    /*public boolean equals(Object ob) {
        if (ob instanceof Student) {
            return this.age == ((Student)ob).age;
        }
        else {
        return false;
        }
    }*/
    //gpa
    /*public boolean equals(Object ob) {
        if (ob instanceof Student) {
            return this.gpa == ((Student)ob).gpa;
        }
        else {
        return false;
        }
    }*/

}