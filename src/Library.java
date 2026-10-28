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

    public int nrOfBooks() { return books.size();}

    public Book findBook(String titel) {
        for (Book book : books) {
            if (book.getTitel().equalsIgnoreCase(titel)) {
                return book;
            }
        }
        return null;
    }

}
