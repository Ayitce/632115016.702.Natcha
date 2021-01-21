package week7;

public class MountainBike extends Bicycle {
    int gear;

    MountainBike() {
        this.speed = 0.0;
        this.gear = 1;
    }

    MountainBike(double speed) {
        this.speed = speed;
        this.gear = 1;
    }

    public void SetGear(int gear) {
        this.gear = gear;
    }

    public void speedUp() {
        if (speed + (5*gear) > 99) {
            this.speed = 99.0;
        } else {
            this.speed += (5*gear);
        }
    }

}
