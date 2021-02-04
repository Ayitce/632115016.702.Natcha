package week9;

public class Cube extends Rectangle {
    int length;

    public Cube(int width,int height,int length){
        super(width, height);
        this.length = length;
    }

    public String toString(){
        return "this is a cube with the side of " + length ;
    }
}
