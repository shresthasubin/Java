package Model;

import java.sql.Timestamp;

public class Topic {
    private int id;
    private String name;
    private final Timestamp createdAt;
    private Timestamp updatedAt;

    public Topic(int id, String name, Timestamp createdAt, Timestamp updatedAt){
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getId () {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Timestamp getUpdatedAt () {
        return this.updatedAt;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "id: " + id + ", note: " + name;
    }
}
