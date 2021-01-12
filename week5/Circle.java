//**632115016 Natcha Petchsrikul */

package week5;

import java.lang.Math;

public class Circle {
    double x;
    double y;
    double radius;

    Circle(double newx,double newy,double newradius){
        x = newx;
        y = newy;
        radius = newradius;
    }

    Circle(double newx,double newy){
        x = newx;
        y = newy;
        radius = 1.0;
    }

    public double getArea(){
        radius = (radius >= 0) ? radius : 0;
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        radius = (radius >= 0) ? radius : 0;
        return 2 * Math.PI * radius;
    }
    public boolean checkIntersect(Circle C2){
        double C1C2 = Math.sqrt(Math.pow(this.x - C2.x,2) + Math.pow(this.y - C2.y,2));
        if(C1C2 <= this.radius + C2.radius){
            return true;
        }
        else return false;
    }
}
