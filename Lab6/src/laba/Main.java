package laba;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter the task number [0 - exit]");
            Scanner sc = new Scanner(System.in);
            int task = sc.nextInt();

            switch (task) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    ex3();
                    break;
                case 4:
                    ex4();
                    break;
                case 0:             //exit
                    System.out.println("EXIT");
                    return;
                default:
                    break;
            }
        }
    }

    public static void ex1() {
        MovableCircle ob1 = new MovableCircle(10, 10, 5, 1);
        MovablePoint ob2 = new MovablePoint(5, 5, 1, 1);

        System.out.println(ob1.toString());
        System.out.println(ob2.toString());

        ob1.moveRight();
        System.out.println(ob1.toString());
    }

    public static void ex2() {
        Animal obj1 = new Animal("Cat", "Barsik");
        Animal obj2 = new Animal("Dog", "Rex");
        Student obj3 = new Student("Mark", 19);

        System.out.printf("%s  %s  %s\n", obj1.getName(), obj2.getName(), obj3.getName());
    }

    public static void ex3() {
        NullMatrix ob1 = new NullMatrix(3);
        ob1.print();

        System.out.println("------------------------");

        NullMatrix ob2 = new NullMatrix(7);
        ob2.print();
    }

    public static void ex4() {
        Temperature ob = new Temperature(10);
        Temperature ob1 = new Temperature(11);
        Temperature ob2 = new Temperature(-5);
        Temperature ob3 = new Temperature(3.4);
        Temperature ob4 = new Temperature(100.1);

        System.out.println(ob.convert("f"));
        System.out.println(ob.convert("k") + "\n");

        System.out.println(ob1.convert("f"));
        System.out.println(ob1.convert("k") + "\n");

        System.out.println(ob2.convert("f"));
        System.out.println(ob2.convert("k") + "\n");

        System.out.println(ob3.convert("f"));
        System.out.println(ob3.convert("k") + "\n");

        System.out.println(ob4.convert("f"));
        System.out.println(ob4.convert("k") + "\n");
    }
}