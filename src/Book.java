public class Book {
    private String bookName;
    private Author authorName;
    private int year;

    public Book (String bookName, Author authorName,int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;

    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return authorName;
    }


    public int getYear() {
        return year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(Author authorName) {
        this.authorName = authorName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
