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
                    ex1();
                    break;
                case 2:
//                    ex2(args);
                    break;
            }

        }
    }


    public enum Seasons {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,

        TEMP_WINTER,
        TEMP_SPRING,
        TEMP_SUMMER,
        TEMP_AUTUMN
    }

    public static void ilove(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            default:
                break;
        }
    }

    public static void ex1() {
        System.out.println(Seasons.TEMP_AUTUMN);
    }

}
