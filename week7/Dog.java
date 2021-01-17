package week7;

public class Dog extends Pet {
    String size;
    String hair;
    String place;
    String bark;

    Dog(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Run() {
        System.out.println("My dog is run to the " + place);
    }

    public void Size() {
        System.out.println("Its size : " + size);
    }

    public void Bark(){
        System.out.println("bark " + bark);
    }

    public void IsShortHair(){
        if(hair.equals("short")){
            System.out.println("Short hair : " + true);
        }
        else if(hair.equals("long")){
            System.out.println("Short hair : " + false);
        }
    }

}
