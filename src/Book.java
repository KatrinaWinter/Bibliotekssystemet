public class Book {
    private final String titel;
    private final String author;
    private final int bookId;

    public Book(String titel, String author, int bookId) {
        this.titel = titel;
        this.author = author;
        this.bookId = bookId;
    }

    public String getTitel() { return titel; }
    public String getAuthor() { return author; }
    public int getBookId() { return bookId; }
}
