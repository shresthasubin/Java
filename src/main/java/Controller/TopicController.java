package Controller;

import Model.Entry;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

public class TopicController {

    private static ArrayList<Entry> entries = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add Topic");
            System.out.println("2. View Topics");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    addTopic(sc);
                    break;

                case 2:
                    viewTopics();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addTopic(Scanner sc) {

        System.out.print("Enter topic name: ");
        String name = sc.nextLine();

        Timestamp now = new Timestamp(System.currentTimeMillis());

        Entry entry = new Entry(
                idCounter++,
                name,
                now,
                now
        );

        entries.add(entry);

        System.out.println("Topic added successfully.");
    }

    private static void viewTopics() {

        if (entries.isEmpty()) {
            System.out.println("No topics found.");
            return;
        }

        System.out.println("\n--- Topics ---");
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
}
