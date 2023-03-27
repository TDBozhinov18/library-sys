public class Transaction {
    private int id;
    private String details;
    private String date;

    private int borrowingId;

    public int getBorrowingId() {
        return borrowingId;
    }

    public void setBorrowingId(int borrowingId) {
        this.borrowingId = borrowingId;
    }

    public Transaction(int id, String details, String date) {
        this.id = id;
        this.details = details;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void update(){

    }
}
