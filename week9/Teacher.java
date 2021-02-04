package week9;

public class Teacher extends Person{
    String workPlace;

    public Teacher(String name, int bornYear , String workPlace){
        super(name, bornYear);
        this.workPlace = workPlace;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach the students in " + workPlace + ".");
    }
}
