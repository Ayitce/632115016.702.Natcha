package week9;

public class CEO extends Person {
    String company;

    public CEO(String name,int bornYear,String company){
        super(name, bornYear);
        this.company = company;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a CEO of " + company + "company.");
    }
}
