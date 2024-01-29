public class Book {
//Dam niste variabile private
    private String title;
    private String author;
    private String isbn;
//Initializam cartea
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
// Get method for elemnts:
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
// Set method for elemnts:

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
//  Scriem book ca string
     public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

public class Library{
    private List<Book> books;
// Function to initialize the Library object with an empty list of books
    public Library() {
        this.books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }
    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    // Setter method for the list of books
    public void setBooks(List<Book> books) {
        this.books = books;
    }   
}