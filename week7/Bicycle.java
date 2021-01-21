package week7;

public class Bicycle {
    Double speed;

    Bicycle() {
        this.speed = 0.0;
    }

    Bicycle(double speed) {
        this.speed = speed;
    }

    public void speedUp() {
        if (speed + 5 > 99) {
            this.speed = 99.0;
        } else {
            this.speed += 5;
        }
    }

    public void breakDown() {
        if (speed - 5 < 0) {
            this.speed = 0.0;
        } else {
            this.speed -= 5;
        }
    }
}