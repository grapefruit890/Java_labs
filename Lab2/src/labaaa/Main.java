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
                   ex2();
                   break;
//               case 3:
//                   ex3();
//                   break;
//               case 4:
//                   ex4();
//                   break;
//               case 5:
//                   ex5();
//                   break;
//               case 6:
//                   ex6();
//                   break;
//               case 7:
//                   ex7();
//                   break;
//               case 8:
//                   ex8();
//                   break;
//               case 9:
//                   ex9();
//                   break;
//               case 10:
//                   ex10();
//                   break;
           }

       }
    }

    public static void ex1() {
        Author bob = new Author("bob", "new_email@gmail.com", 'm');
        bob.setEmail("bobabob@gmail.com");

        System.out.println("Name: " + bob.getName());
        System.out.println("Email: " + bob.getEmail());
        System.out.println("Gender: " + bob.getGender());
    }

    public static void ex2() {
        Ball ball_1 = new Ball();
        ball_1.setX(20);
        ball_1.setY(100);
        System.out.println("Ball_1 X: " + ball_1.getX() + "; Y: " + ball_1.getY());
    }
}
