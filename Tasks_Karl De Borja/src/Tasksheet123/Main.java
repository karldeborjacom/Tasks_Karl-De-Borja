public class Main {
    public static void main(String[] args) {
        // Instantiate Book objects with different values
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);
        System.out.println("\nBook 3:\n" + book3);
    }
}
