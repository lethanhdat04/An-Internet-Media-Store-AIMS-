package aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book extends Media {

    private List<String> authors = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, float cost) {
        this(title);
        this.cost = cost;
    }

    public Book(String title, String category, float cost) {
        this(title, cost);
        this.category = category;
    }

    public boolean addAuthor(String author) {
        for (String s : authors) {
            if (Objects.equals(s, author)) {
                System.out.println("Those authors existed");
                return false;
            }
        }
        authors.add(author);
        System.out.println("Add author has completed");
        return true;
    }

    public boolean removeAuthor(String author) {
        for (String s : authors) {
            if (Objects.equals(s, author)) {
                authors.remove(author);
                System.out.println("Remove has completed");
                return true;
            }
        }
        System.out.println("This author is not in list");
        return false;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
