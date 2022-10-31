package Q2;

public class TicketBook {

    private String readerName;
    private int bookId;
    private String borrowingDate;
    private String expirationDate;
    
    public TicketBook(String readerName, int bookId, String borrowingDate, String expirationDate) {
        this.readerName = readerName;
        this.bookId = bookId;
        this.borrowingDate = borrowingDate;
        this.expirationDate = expirationDate;
    }
    public String getReaderName() {
        return readerName;
    }
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBorrowingDate() {
        return borrowingDate;
    }
    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return "TicketBook [readerName=" + readerName + ", bookId=" + bookId + ", borrowingDate=" + borrowingDate
                + ", expirationDate=" + expirationDate + "]";
    }
    
    
   

  


}
