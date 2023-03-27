public class Books {
    private int id;
    private String title;
    private String details;
    private String author;

    public Books(int id, String title, String details, String author) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.author = author;
    }

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void add(){

    }

    public void update(){

    }

}
