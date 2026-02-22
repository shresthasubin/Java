package Model;

import java.sql.Timestamp;

public class Entry {
    private int id;
    private String note;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Entry(int id, String note, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.note = note;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}