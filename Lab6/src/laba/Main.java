package laba;

public class Main {
    public static void main(String[] args) {
        MovableCircle ob1 = new MovableCircle(10, 10, 5,1);
        MovablePoint ob2 = new MovablePoint(5, 5, 1, 1);

        System.out.println(ob1.toString());
        System.out.println(ob2.toString());

        ob1.moveRight();
        System.out.println(ob1.toString());
    }
}