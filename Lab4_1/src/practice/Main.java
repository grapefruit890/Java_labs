package practice;

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

    public static void ex1() {
        Phone ob1 = new Phone("+79084259077", "Iphone 3", 133.0f);
        Phone ob2 = new Phone("+79085439864", "Samsung S10", 150.32f);
        Phone ob3 = new Phone("+79044205300", "Huawei", 120.4f);

        System.out.println("Phone 1: " + ob1.getNumber() + " " + ob1.getModel() + " " + ob1.getWeight());
        System.out.println("Phone 2: " + ob2.getNumber() + " " + ob2.getModel() + " " + ob2.getWeight());
        System.out.println("Phone 3: " + ob3.getNumber() + " " + ob3.getModel() + " " + ob3.getWeight());

        ob1.receiveCall("John", "+79085458503");
        ob1.sendMessage(new String[]{"+790400000000", "+790843525230", "+790412345678"});
    }

    public static void ex2() {
        Learner[] learners = new Learner[3];
        learners[0] = new Student("Bob", 19);
        learners[1] = new Student("John", 21);
        learners[2] = new Schoolboy("Mark", 14);

        learners[0].setStatus("Student");
        learners[1].setStatus("Student");
        learners[2].setStatus("Schoolboy");

        for (int i = 0; i < 3; i++) {
            System.out.println(learners[i].getName() + ", " + learners[i].getAge() + "; Status: " + learners[i].getStatus());
        }

    }
}