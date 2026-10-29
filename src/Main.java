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

                System.out.print("Bok ID: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book(titel, author, bookId);
                library.addNewBook(book);
            }else if (choice == 2) {
                library.inventory();
            }



        }
    }

    public static void showMenu() {
        System.out.println("1. Registrera Ny Bok  | 2. Visa Alla Böcker      | 3. Sök Bok Titel ");
        System.out.println("4. Låna en Bok        | 5. Lämna Tillbaka en Bok | 6. Visa Tillgängliga Böcker ");
        System.out.println("7. Visa Antal Böcker  | 8.                       | 9. ");
        System.out.println("0. Avsluta");
        System.out.print("\nVälj ett alternativ: ");
    }
}
