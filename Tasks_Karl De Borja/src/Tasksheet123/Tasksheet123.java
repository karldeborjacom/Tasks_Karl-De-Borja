public class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // toString method to return the book details as a string
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}
