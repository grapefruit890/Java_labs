package laba;

public class MovablePoint implements Movable {
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    public String toString() {
        String result;
        result = String.valueOf(x) + " " + String.valueOf(y) + " " + String.valueOf(xSpeed) + " " + String.valueOf(ySpeed);
        return result;
    }

}
