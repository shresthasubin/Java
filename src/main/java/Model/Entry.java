package Model;
import java.sql.Timestamp;

public class Entry {
    private int id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Entry(int id, String name, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return id + ". " + name;
    }
}
