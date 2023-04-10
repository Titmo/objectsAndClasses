public class Book {
    private String bookName;
    private int year;

    public Book (String bookName, int year) {
        this.bookName = bookName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
