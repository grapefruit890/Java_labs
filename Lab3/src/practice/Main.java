package practice;

import java.util.Random;
import java.util.Arrays;
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




    public static void output(float[] array) {
        for (int i = 0; i < array.length; i++)  {
            System.out.print(array[i] + "  ");
        }
    }

    public static void ex1() {
        Random rnd = new Random();
        int size = rnd.nextInt(15);
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float)Math.random();
        }

        System.out.println("Array before sort");
        output(array);

        Arrays.sort(array);

        System.out.println("\nArray after sort");
        output(array);
    }

    public static void ex2() {
        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
           employees[i] = new Employee();
        }

        employees[0] = new Employee("Bob", 4000);
        employees[1] = new Employee("Gregory", 100500);
        employees[2] = new Employee("John", 999);
        employees[3] = new Employee("Alexander", 2500);

        Report.generateReport(employees);
    }

}