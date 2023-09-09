package labaaa;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public void Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public void Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double Y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = xDisp;
        this.y = yDisp;
    }
}
