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
                    ex1("I like java, abfdgagfdgdf, java the best!!!");
                    break;
                case 2:
                    ex2();
                    break;
            }

        }
    }

    public static void ex1(String line) {
        System.out.println("Last symbol: " + line.charAt(line.length() - 1));
        System.out.println("endsWith(\"!!!\"): " + line.endsWith("!!!"));
        System.out.println("startsWith(\"I like\"): " + line.startsWith("I like"));
        System.out.println("contains(\"Java\")" + line.contains("Java"));


        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        String secondLine = line.substring(0, 5);
        System.out.println(secondLine);
    }

    public static void ex2() {
        Person ob = new Person("Stepan", "Rybachek", "Mihailovich");
        Person ob1 = new Person("Tokarev");

        System.out.println(ob.getFullname());
        System.out.println(ob1.getFullname());

    }
}

