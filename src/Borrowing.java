public class Borrowing {
    private int id;
    private int bookId;
    private int borrowerId;
    private String dateborrowed;
    private String datadue;

    public Borrowing(int id, int bookId, int borrowerId, String dateborrowed, String datadue) {
        this.id = id;
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.dateborrowed = dateborrowed;
        this.datadue = datadue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getDateborrowed() {
        return dateborrowed;
    }

    public void setDateborrowed(String dateborrowed) {
        this.dateborrowed = dateborrowed;
    }

    public String getDatadue() {
        return datadue;
    }

    public void setDatadue(String datadue) {
        this.datadue = datadue;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", borrowerId='" + borrowerId + '\'' +
                ", dateborrowed='" + dateborrowed + '\'' +
                ", datadue='" + datadue + '\'' +
                '}';
    }

    public void create(){

    }

    public void update(){

    }
}
