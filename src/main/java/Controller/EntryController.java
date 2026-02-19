package Controller;

import Model.Entry;
import java.sql.Timestamp;
import java.util.ArrayList;

public class EntryController {

    private ArrayList<Entry> entries = new ArrayList<>();
    private int idCounter = 1;

    public void addEntry(String name) {

        Timestamp now = new Timestamp(System.currentTimeMillis());

        Entry entry = new Entry(
                idCounter++,
                name,
                now,
                now
        );

        entries.add(entry);

        System.out.println("Entry added successfully.");
    }

    public void viewEntries() {

        if (entries.isEmpty()) {
            System.out.println("No entries found.");
            return;
        }

        System.out.println("\n--- Entries ---");
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
}
