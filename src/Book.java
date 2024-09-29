public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.yearPublication = year;
    }

    public String getTitleBook() {
        return this.title;
    }

    public Author getAuthorBook() {
        return this.author;
    }

    public int getYearPublicationBook() {
        return this.yearPublication;
    }

    public void setYearPublication(int year) {
        yearPublication = year;
    }
}
