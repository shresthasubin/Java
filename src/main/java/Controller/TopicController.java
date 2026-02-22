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
                case choice == 1:
                    addTopic();
                    break;

                case choice == 2:
                    viewTopic();
                    break;

                case choice == 3:
                    return;

                default:
                    System.out.println("Invalid option");
            }


        }
    }

    public static void addTopic() {
        System.out.println("Enter Id: ");
        int id = sc.nextInt();
        sc.next();
        System.out.println("Enter topic name: ");
        String name = sc.nextLine();
    }

    public static void viewTopic() {

    }
}