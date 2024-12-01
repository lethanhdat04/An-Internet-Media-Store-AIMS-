package aims.media;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    // CONSTRUCTORS
    public Media() {
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, float cost) {
        this(title);
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this(title, cost);
        this.category = category;
    }

    // GETTERS & SETTERS
    public int getId() {
        return id;
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

    public float getCost() {
        return cost;
    }

}
