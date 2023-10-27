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
                case 3:
                    ex3();
                    break;
                case 4:
                    ex4();
                    break;
            }
        }
    }

    public static void ex1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the depth\n");
        int depth = in.nextInt();
        int value = 1;
        for (int i = 1; i <= depth; i++) {
           for (int j = 0; j < value; j++) {
               System.out.println(value);
           }
           value++;
        }
    }

    public static void ex2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n\n");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }

    public static void ex3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the A and B\n");
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.printf("A = %d; B = %d\n", A, B);

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i + " ");
            }
        }

        else {
            for (int i = A; i >= B; i--) {
                System.out.println(i + " ");
            }

        }
    }

    public static void ex4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the k and s\n");
        int k = in.nextInt();
        int s = in.nextInt();
        int range = (int) Math.pow(10, k);
        int counter = 0;

        for (int i = 1; i < range; i++) {
            int sumInWord = 0;
            while (i != 0) {
                sumInWord += (i % 10);
                i /= 10;
            }
            if (s == sumInWord) {
                counter++;
            }
        }

        System.out.println(counter);
    }

}