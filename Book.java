public class Book {
    private String name;
    private int year;
    private Author author;

    public Book (String name, int year, Author author) {
    this.name = name;
    this.year = year;
    this.author = author;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
