package week6;

public class CEO extends Person{
    String company;
    public CEO(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void ofCompany(){
        System.out.println(name+" is a CEO of "+company+" company.");
    }
    
}
