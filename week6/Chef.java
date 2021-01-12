package week6;

public class Chef extends Person{
    String menu;
    public Chef(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void cookFood(){
        System.out.println(name+" is cooking "+menu);
    }
    
}
