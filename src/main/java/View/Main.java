package View;

import Controller.EntryController;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EntryController controller = new EntryController();

        int choice;

        while (true) {
            System.out.println("\n1. Add Entry");
            System.out.println("2. View Entries");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter topic name: ");
                    String name = sc.nextLine();
                    controller.addEntry(name);
                    break;

                case 2:
                    controller.viewEntries();
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
}
