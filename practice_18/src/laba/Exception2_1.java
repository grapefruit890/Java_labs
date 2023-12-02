package laba;

import java.util.Scanner;

public class Exception2_1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception2_1 demo = new Exception2_1();
        demo.exceptionDemo();
    }
}