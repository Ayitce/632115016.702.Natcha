package week6;

public class Journalist extends Person{
    String news;
    public Journalist(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void newsAnnouce(){
        System.out.println(name+" is announcing news about "+news+".");
    }
}
