package lava;

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
                    ex1();
                    break;
                case 2:
//                    ex2();
                    break;
            }
        }
    }

    public static void ex1() {
        Student ob1 = new Student("Stepan", "Rybachek", "aboba", 2, "IVBO");
        Student ob2 = new Student("Vadim", "Tokarev", "aboba", 1, "IVBO");
        SortingStudentsByGPA.setArray(ob1, ob2);
        SortingStudentsByGPA.outArray();
    }
}