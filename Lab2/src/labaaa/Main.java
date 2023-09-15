package labaaa;
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
                   ex2(args);
                   break;
           }

       }
    }

    public static void ex1() {
        TestAuthor bob = new TestAuthor("Bob", "old_email", 'm');
//        Author bob = new Author("bob", "new_email@gmail.com", 'm');
//        bob.setEmail("bobabob@gmail.com");
//
//        System.out.println("Name: " + bob.getName());
//        System.out.println("Email: " + bob.getEmail());
//        System.out.println("Gender: " + bob.getGender());
//        System.out.println("-----\n" + bob.toString());
    }

    public static void ex2(String[] args) {
        System.out.println(args.length);
    }
}
