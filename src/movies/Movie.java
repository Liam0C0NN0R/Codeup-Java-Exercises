package movies;

public class Movie {
    private String name;
    private String category;

    // Constructor that sets both fields
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getter and setter for 'name'
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'category'
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
