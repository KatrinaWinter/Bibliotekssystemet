public class Book {
    private final String titel;
    private final String author;
    private final int bookId;
    private boolean available = false;

    public Book(String titel, String author, int bookId) {
        this.titel = titel;
        this.author = author;
        this.bookId = bookId;
    }

    public String getTitel() { return titel; }
    public String getAuthor() { return author; }
    public int getBookId() { return bookId; }
    public boolean getAvailable() {return available; }

    public boolean borrowBook() {
        if ( !available){
            System.out.println("Boken är ej tillgänglig!");
            return false;
        }
        available = false;
        System.out.println("Utlåning godkänt! Vänligen återlämna "
                + this.getTitel() + " inom två veckor!");
        return true;
    }

    public boolean returnBook() {
        if (available){
            System.out.println("Boken är redan returnerad!");
            return false;
        }
        available = true;
        System.out.println("Tack för återlämningen!");
        return true;
    }

}
