package week9;

public class FootballPlayer extends Person {
    String club;

    public FootballPlayer(String name, int bornYear, String club) {
        super(name, bornYear);
        this.club = club;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a football player and work in " + club + ".");
    }
}
