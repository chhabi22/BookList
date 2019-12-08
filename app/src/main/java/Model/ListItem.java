package Model;

public class ListItem {

    private String name;
    private String description;

    // ---- consturctor ----
    public ListItem(String name, String description) {
        this.name = name;
        this.description = description;

    }


    // -------- Getter & Setter for 'name' ----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // -------- Getter & Setter for 'description' ----------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }






}
