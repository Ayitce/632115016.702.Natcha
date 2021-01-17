package week7;

public class Fish extends Pet {
    String size;
    String water;
    String speed;

    Fish(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Size() {
        System.out.println("Its size : " + size);
    }

    public void SwimSpeed() {
        System.out.println(name + " swim so " + speed);
    }

    public void IsSwimToTheSea(){
        if(water.equals("salt"))
        {
            System.out.println("Swim to the sea : " + true);}
            else{
                System.out.println("Swim to the sea : " +false);
            }
    }
}
