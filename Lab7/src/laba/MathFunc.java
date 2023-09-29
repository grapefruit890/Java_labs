package laba;

public class MathFunc implements MathCalculable {
    public double pow(double number, double degree) {
        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }

        return result;
    }
    public double absCompexNumber(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double circleLen(double radius) {
        return 2 * PI * radius;
    }
}
