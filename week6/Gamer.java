package week6;

public class Gamer extends Person{
    String game;
    public Gamer(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void playGame(){
        System.out.println(name+" is playing "+game+".");
    }
}
