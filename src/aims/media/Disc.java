package aims.media;

public class Disc extends Media{
    protected float length;
    protected String director;

    public Disc() {
        super();
    }

    public Disc(float length, String director) {
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float length, String director) {
        super(title);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float cost, float length, String director) {
        super(title, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost, float length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
