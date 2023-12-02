package laba;

import java.util.Scanner;

public class Exception2_2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        } finally {
            System.out.println("/Finally block/");
        }
    }

    public static void main(String[] args) {
        Exception2_2 demo = new Exception2_2();
        demo.exceptionDemo();
    }
}