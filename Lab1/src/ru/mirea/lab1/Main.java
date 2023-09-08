package ru.mirea.lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("\nEnter the task number (1 - 5) [0 - exit]");
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
                    ex3(args);
                    break;
                case 4:
                    ex4();
                    break;
                case 5:
                    ex5();
                    break;
                case 0:             //exit
                    System.out.println("EXIT");
                    return;
                default:
                    break;

            }
        }
    }


    // TASK 1
    public static void ex1() {
        System.out.println("\nTASK 1");
        int[] array = new int[] {1, 2, 3, 4, 5};
        int addition = 0;
        int mean;

        for (int i = 0; i < 5; i++) {
            addition += array[i];
        }

        mean = addition / array.length;
        System.out.println("Addition of array = " + addition + "; Ariphmetic mean = " + mean);
    }

    public static void ex2() {
        System.out.println("\nTASK 2");
        int[] array = new int[5];
        int addition = 0;
        int mean;


        int iter = 0;

        while (iter < array.length) {
            Scanner in = new Scanner(System.in);
            array[iter] = in.nextInt();
            addition += array[iter];
            iter++;
        }

        iter = 0;

        int min = array[0];
        int max = array[0];

        while (iter < array.length) {
            if (array[iter] < min) {
                min = array[iter];
            }
            if (array[iter] > max) {
                max = array[iter];
            }
           iter++;
        }
        mean = addition / array.length;

        System.out.println("Addition of array = " + addition + "; Ariphmetic mean = " + mean + "\n");
        System.out.print("Min element: " + min + "; Max element: " + max);
    }


    public static void ex3(String[] args) {
        System.out.println("\nTASK 3");
        System.out.println("Command line args: ");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void ex4() {
        System.out.println("\nTASK 4");
        System.out.print("1");
        for (int i = 2; i < 11; i++) {
             System.out.print(" + 1" + "/" + i);
        }
    }


    public static void ex5() {
        System.out.println("\nTASK 5");
        System.out.println("Enter the number to calculate the factorial");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;

        for (int i = 1; i < number; i++, result*= i) {}
        System.out.println("Factorial: " + result);
    }
 }

