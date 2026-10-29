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

            if (choice == 1){
                System.out.println("Bok Tittel: ");
                String titel = scanner.nextLine();

                System.out.print("Författare: ");
                String author = scanner.nextLine();

                System.out.print("Bok-ID: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book(titel, author, bookId);
                library.addNewBook(book);

            } else if (choice == 2) {
                library.inventory();

            } else if (choice == 3) {
                System.out.println("Ange Bok Titel: ");
                String titel = scanner.nextLine();

                Book found = library.findBook(titel);

                if ( found != null) {
                    System.out.println(found.getTitel() + " Av: " +
                            found.getAuthor() + " Bok-ID: " +
                            found.getBookId());
                } else {
                    System.out.println("Boken hittades inte.");
                }

            } else if (choice == 4) {
                System.out.println("Ange Bok Titel: ");
                String titel = scanner.nextLine();

                Book found = library.findBook(titel);

                if (found != null){
                    found.borrowBook();
                } else {
                    System.out.println(" Bok: " + titel + " Fins ej!");
                }

            } else if (choice == 5) {
                System.out.println("Ange Bok Titel: ");
                String titel = scanner.nextLine();

                Book found = library.findBook(titel);

                if (found != null){
                    found.returnBook();
                } else {
                    System.out.println(" Bok: " + titel + " Tillhör ej vårat Bibliotek!");
                }

            } else if (choice == 6) {
                library.availableBooks();

            } else if (choice == 7) {
                library.nrOfBooks();

            } else if (choice == 0) {
                System.out.println("Välkommen Åter!");

            } else {
                System.out.println("Försök igen! Ange en siffra från menyn.");
            }


        }
    }

    public static void showMenu() {
        System.out.println("\n1. Registrera Ny Bok  | 2. Visa Alla Böcker      | 3. Sök Bok Titel ");
        System.out.println("4. Låna en Bok        | 5. Lämna Tillbaka en Bok | 6. Visa Tillgängliga Böcker ");
        System.out.println("7. Visa Antal Böcker  | 8.                       | 9. ");
        System.out.println("0. Avsluta");
        System.out.print("\nVälj ett alternativ: ");
    }

    /* To Kill a Mockingbird  Harper Lee       101
    *  Harry Potter           J. K. Rowling    102
    *  Pride and Prejudice    Jane Austen      103
    *  1984                   George Orwell    104 */

}
