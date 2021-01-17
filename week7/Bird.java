package week7;

public class Bird extends Pet {
    String country;
    String fly;
    String speak;

    Bird(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void CheckCountry() {
        System.out.println("Its country : " + country);
    }

    public void Speak(){
        System.out.println(name + " is saying " + speak);
    }

    public void IsCanFly(){
        if(fly.equals("can")){
            System.out.println("It can fly");
        }
        else {
            System.out.println("It can't fly");
        }
    }
}
