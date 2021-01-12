package week5;

//**632115016 Natcha Petchsrikul

public class NerfGun {
    int ammunition;
    static int GunID = 0;

    NerfGun() {
        ammunition = 0;
        GunID++;
    }

    NerfGun(int ammu) {
        ammunition = ammu;
        GunID++;
    }

    public void displayNumOfAmmunition() {
        System.out.println(this.ammunition + " bullet left");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + GunID);
    }

    public void reload(int ammu) {
        if (ammunition + ammu > 15) {
            System.out.println("Error!! the ammunition is overload");
        } else
            ammunition += ammu;

    }

    public void fire() {
        if (ammunition > 0) {
            this.ammunition--;
            System.out.println("BANG !!!");
        } else {
            System.out.println("There is no ammunition");
        }
    }

}