package xingke.sqlitemultiple;

/**
 * Created by Xingke on 25/07/2015.
 */
public class Todo {
    private int id;
    private String note;
    private int status;
    private String created_at;

    public Todo() {
    }

    public Todo(String note, int status) {
        this.note = note;
        this.status = status;
    }

    public Todo(int id, String note, int status) {
        this.id = id;
        this.note = note;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
