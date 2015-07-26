package xingke.sqlitemultiple;

/**
 * Created by Xingke on 25/07/2015.
 */
public class Tag {
    private int id;
    private String tag_name;

    public Tag() {
    }

    public Tag(String tag_name) {
        this.tag_name = tag_name;
    }

    public Tag(int id, String tag_name) {
        this.id = id;
        this.tag_name = tag_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }
}
