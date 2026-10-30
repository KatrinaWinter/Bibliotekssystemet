import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner =new Scanner(System.in);

        System.out.println("\n--- Biblioteket ---");

        int choice = -1;

        while (choice != 0){
            showMenu();

            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ange en siffra från menyn.");
                continue;
            }

            if (choice == 1){ // Registrera Ny Bok
                System.out.println("Boktittle: ");
                String titel = scanner.nextLine();

                System.out.print("Författare: ");
                String author = scanner.nextLine();

                int bookId = 0;
                boolean validId = false;

                while (!validId) {
                    System.out.print("Bok-ID (1000–9999): ");
                    String newBookId = scanner.nextLine();

                    try {
                        bookId = Integer.parseInt(newBookId);
                    } catch (NumberFormatException e) {
                        System.out.println("Ange ett giltigt ID med fyra siffror.");
                        continue;
                    }

                    if (bookId < 1000 || bookId > 9999) {
                        System.out.println("ID måste vara mellan 1000 och 9999.");
                        continue;
                    }

                    Book book = new Book(titel, author, bookId);

                    if (library.addNewBook(book)) {
                        validId = true;
                    }else {
                        System.out.println("Ange ett annat bok-ID.");
                    }
                }

            } else if (choice == 2) { // Visa Alla Böcker
                library.inventory();

            } else if (choice == 3) { // Sök Bok Titel
                Book found = searchBook(scanner, library);

                if ( found != null) {
                    System.out.println(found.getTitel() + " Av: " +
                            found.getAuthor() + " Bok-ID: " +
                            found.getBookId());
                } else {
                    System.out.println("Boken hittades inte.");
                }

            } else if (choice == 4) { // Låna en Bok
                Book found = searchBook(scanner, library);

                if (found != null){
                    found.borrowBook();
                } else {
                    System.out.println(" Bok: " +
                            searchBook(scanner, library) +
                            " Fins ej!");
                }

            } else if (choice == 5) {  // Lämna Tillbaka en Bok
                Book found = searchBook(scanner, library);

                if (found != null){
                    found.returnBook();
                } else {
                    System.out.println(" Bok: " +
                            searchBook(scanner, library) +
                            " Tillhör ej vårat Bibliotek!");
                }

            } else if (choice == 6) { // Visa Tillgängliga Böcker
                library.availableBooks();

            } else if (choice == 7) { // Visa Antal Böcker
                System.out.println("Antal registrerade böcker: " +
                        library.nrOfBooks());

            } else if (choice == 0) { // Avsluta
                System.out.println("Välkommen Åter!");

            } else {
                System.out.println("Försök igen! Ange en siffra från menyn.");
            }


        }
    }

    public static void showMenu() {
        System.out.println("\n1. Registrera Ny Bok  | 2. Visa Alla Böcker      | 3. Sök Bok Titel ");
        System.out.println("  4. Låna en Bok        | 5. Lämna Tillbaka en Bok | 6. Visa Tillgängliga Böcker ");
        System.out.println("  7. Visa Antal Böcker  |");
        System.out.println("  0. Avsluta");
        System.out.print("\nVälj ett alternativ: ");
    }

    public static Book searchBook(Scanner scanner, Library library) {
        System.out.println("Ange Bok Titel: ");
        String titel = scanner.nextLine();

        return library.findBook(titel);
    }

    }

    /* To Kill a Mockingbird  Harper Lee       1001
    *  Harry Potter           J. K. Rowling    1002
    *  Pride and Prejudice    Jane Austen      1003
    *  1984                   George Orwell    1004 */


