package week7;

public class MainBike {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(10);
        System.out.println("Bike1");
        System.out.println("Current speed : " + bike1.speed);
        bike1.speedUp();
        System.out.println("Current speed : " + bike1.speed);
        bike1.breakDown();
        System.out.println("Current speed : " + bike1.speed);

        System.out.println("-------------");
        MountainBike bike2 = new MountainBike(15);
        System.out.println("Bike2");
        bike2.SetGear(2);
        System.out.println("Current speed : " + bike2.speed);
        bike2.speedUp();
        System.out.println("Current speed : " + bike2.speed);
        bike2.breakDown();
        System.out.println("Current speed : " + bike2.speed);

    }

}
