package Model;

public class ListItem {

    private String name;
    private int image;
    private String description;

    // Constructor
    public ListItem(int image, String name, String description)
    {
        this.name = name;
        this.description = description;
        this.image = image;
    }


    // ---- getter & setter for image ----
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }


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



}//closing
