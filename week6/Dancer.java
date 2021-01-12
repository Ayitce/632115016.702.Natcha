package week6;

public class Dancer extends Person{
    String song;
    public Dancer(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void dancing(){
        System.out.println(name+" is dancing to "+song+" music.");
    }
}
