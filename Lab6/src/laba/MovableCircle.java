package laba;

public class MovableCircle extends MovablePoint {
    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
       super(x, y, xSpeed, ySpeed);
    }

    private int radius;
    private MovablePoint center;
    public String toString() {
       String result;
       result = String.valueOf(x) + " " + String.valueOf(y) + " " + String.valueOf(xSpeed) + " " + String.valueOf(ySpeed);
       return result;
    }
}
