import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public boolean addNewBook(Book book) {
        for (Book existingBook : books) {
            if (existingBook.getBookId() == book.getBookId()) {
                System.out.println("Varning: Bok-ID finns redan!");
                return false;
            }
        }
        books.add(book);
        System.out.println(book.getTitel() + "Tillagt!");
        return true;
    }

    public void inventory() {
        if (books.isEmpty()) {
            System.out.println("Biblioteket är tomt. ");
            return;
        }
        for (Book book : books) {
            System.out.println(book.getTitel() +
                    " Sktiven av: " + book.getAuthor() +
                    "ID nr. " + book.getBookId());
        }
    }

    public Book findBook(String titel) {
        for (Book book : books) {
            if (book.getTitel().equalsIgnoreCase(titel)) {
                return book;
            }
        }
        return null;
    }

    public int nrOfBooks() {
        return books.size();
    }

    public void availableBooks() {
        boolean foundAvailable = false;
        for (Book book : books) {
            if (book.getAvailable()) {
                System.out.println(book.getTitel() +
                        " Sktiven av: " + book.getAuthor() +
                        "ID nr. " + book.getBookId());
                foundAvailable = true;
            }
        }
        if (!foundAvailable) {
            System.out.println("Inga böcker tillgängliga.");
        }
    }

}