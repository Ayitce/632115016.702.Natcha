/// 632115016 Natcha Petchsrikul

package week6;

public class InheritanceExample {
    public static void main(String[]args){
        Artist art = new Artist("Ball",20,"Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Chef chef = new Chef("Poom", 19, "Male");
        chef.menu = "fried rice with soup samsee cat";
        chef.introduce();
        chef.cookFood();

        Journalist jour = new Journalist("Por", 19, "Female");
        jour.news = "Sia O";
        jour.introduce();
        jour.newsAnnouce();

        CEO ceo = new CEO("Hin", 19, "Male");
        ceo.company = "Frit";
        ceo.introduce();
        ceo.ofCompany();

        Gamer gamer = new Gamer("Jojo", 19, "Male");
        gamer.game = "Valorant";
        gamer.introduce();
        gamer.playGame();

        Dancer dancer = new Dancer("Jett", 19,"Female" );
        dancer.song = "Oh my";
        dancer.introduce();
        dancer.dancing();
    }
    
}
