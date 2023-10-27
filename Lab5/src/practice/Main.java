package practice;

import javax.swing.*;
import java.awt.*;
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
//                ex2();
                    break;
            }

        }


    }

    public static void ex1() {
        JFrame window = new JFrame("Window");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        JPanel panel = new JPanel();
        //panel.setLayout(LayoutManager); // !!!!!!!!
        panel.setBackground(Color.GRAY);
        window.setPreferredSize(new Dimension(500, 500));


        JButton butMilan = new JButton("AC Milan");
        JButton butMadrid = new JButton("Real Madrid");
        //butMadrid.setLocation(); // !!!!!!!
        panel.add(butMilan);
        panel.add(butMadrid);
        int counter1 = 0;
        int counter2 = 0;
        String result = String.valueOf(counter1) + " X " + String.valueOf(counter2);
        JLabel outResult = new JLabel(result, JLabel.CENTER);
        panel.add(outResult);

        window.getContentPane().add(panel);
        window.pack();
        window.setVisible(true);
    }
}