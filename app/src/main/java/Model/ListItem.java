package Model;

public class ListItem {

    private String name;

    public ListItem(String name, String description) {
        this.name = name;
        this.description = description;

    }

    private String description;


    // ---- getter & setter for name ----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ---- getter & setter for description ----
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
