package laba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nENTER THE TASK NUMBER");

            Scanner in = new Scanner(System.in);
            int task = in.nextInt();

            switch (task) {
                case 0:
                    System.out.println("EXIT");
                    return;
                case 1:
                    System.out.println("TASK 1");
                    ex1();
                    break;
                case 2:
                ex2();
                    break;
            }
        }
    }

    public static void ex1() {
        ProcessStrings ob = new ProcessStrings ("QWERTY");
        ProcessStrings ob1 = new ProcessStrings ("123456789");

        System.out.println(ob.charCount());
        System.out.println(ob.oddChars());
        System.out.println(ob.reverseStr());

        System.out.println(ob1.charCount());
        System.out.println(ob1.oddChars());
        System.out.println(ob1.reverseStr());
    }

    public static void ex2() {
        MathFunc ob = new MathFunc();
        System.out.println("Module of the complex number " + ob.absCompexNumber(0, 2));
        System.out.println("Degree pow (number 3, degree 4) " + ob.pow(3, 4));
        System.out.println("radius = 10, len of the circle = " + ob.circleLen(10));
    }
}