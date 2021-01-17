package week7;

public class MainPet {
    public static void main(String[] args){
        System.out.println("My dog");
        Dog dog = new Dog("Lucky","poodle","brown",2);
        dog.size = "small";
        dog.hair = "short";
        dog.place = "jungle";
        dog.bark = "Box Box!!";
        dog.showPetData();
        dog.Run();
        dog.Size();
        dog.Bark();
        dog.IsShortHair();

        System.out.println("--------------");
        System.out.println("My fish");
        Fish fish = new Fish("Meow","shark","white",5);
        fish.size = "Big";
        fish.speed = "Fast";
        fish.water = "salt";
        fish.showPetData();
        fish.Size();
        fish.SwimSpeed();
        fish.IsSwimToTheSea();

        System.out.println("--------------");
        System.out.println("My Bird");
        Bird bird = new Bird("Booboo","parrot","gray",3);
        bird.country = "england";
        bird.fly = "can";
        bird.speak = "'Hew Kao!!'";
        bird.showPetData();
        bird.CheckCountry();
        bird.Speak();
        bird.IsCanFly();
    }
}
