package laba;

import javax.xml.crypto.Data;
import java.util.*;
import java.time.*;

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
        LocalDate oldDate = LocalDate.of(2023, 9, 1);
        System.out.println("task receipt date " + oldDate);
        System.out.println("submission data " + LocalDate.now() + " " + LocalTime.now());
    }

    public static void ex2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();
        System.out.println("Enter month");
        int month = in.nextInt();
        System.out.println("Enter day");
        int day = in.nextInt();

        LocalDate inputDate = LocalDate.of(year, month, day);

        if (inputDate.compareTo(LocalDate.now()) < 0)  {
            System.out.println("that date has already passed");
        } else if (inputDate.compareTo(LocalDate.now()) > 0) {
            System.out.println("YET TO COME");
        }

        else {
            System.out.println("SAME DATES");
        }
    }

    public static void ex3() {
        long startTime1 = System.currentTimeMillis();
        ArrayList list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add(i);
        }

        list1.remove(10);
        list1.remove(15);

        for (int i = 0; i < 100; i++) {
            list1.add(i + 1);
        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("ArrayList time in milliseconds: " + (endTime1 - startTime1));

//------------------------------------------------------------------
        long startTime2 = System.currentTimeMillis();

        LinkedList list2 = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list2.add(i);
        }

        list2.remove(10);
        list2.remove(15);

        for (int i = 0; i < 100; i++) {
            list2.add(i + 1);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList time in milliseconds: " + (endTime2 - startTime2));
    }

    public static void ex4() {
        Calendar calendar = new GregorianCalendar(2019, 0 , 27);;
        Date date = calendar.getTime();
        System.out.println(date);
    }

}