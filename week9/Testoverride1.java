package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();

        System.out.println("---------------------");
        Person person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();

        System.out.println("---------------------");
        Person person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();

        System.out.println("---------------------");
        Person person4 = new PrimeMinistier("Tu", 1954, "Thailand");
        person4.introduce();

        System.out.println("---------------------");
        Person person5 = new FootballPlayer("Messi", 1987, "Barcelona football club");
        person5.introduce();

        System.out.println("---------------------");
        Person person6 = new CEO("Hin", 2001, "Frit");
        person6.introduce();
    }
}