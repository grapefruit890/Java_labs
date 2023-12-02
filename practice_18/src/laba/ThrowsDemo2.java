package laba;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key;
        do {
            System.out.print("Enter a key: ");
            key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                System.out.println("Please enter a valid key.");
            }
        } while (key == ".");
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        demo.getKey();
    }
}