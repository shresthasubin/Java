package Controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Topic;

public class TopicController {
    private ArrayList<Topic> topics = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add topic");
            System.out.println("2. View topic");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    addTopic();
                    break;

                case 2:
                    viewTopic();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid option");
            }


        }
    }

    public void addTopic() {
        System.out.println("Enter Id: ");
        int id = sc.nextInt();
        sc.next();
        System.out.println("Enter topic name: ");
        String name = sc.nextLine();
    }

    public static void viewTopic() {

    }
}