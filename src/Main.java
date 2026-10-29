import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner =new Scanner(System.in);

        System.out.println("\n--- Biblioteket ---");

        int val = -1;

        while (val != 0){
            System.out.println("\n1. Registrera Ny Bok");
            System.out.println("2. Visa Alla Böcker");
            System.out.println("3. Sök Bok Titel");
            System.out.println("4. Låna en Bok");
            System.out.println("5. Lämna Tillbaka en Bok");
            System.out.println("6. Visa Endast Tillgängliga Böcker");
            System.out.println("7. Visa Antal Registrerade Böcker");

            System.out.println("0. Avsluta programmet");
            System.out.print("\nVälj ett alternativ: ");


        }
    }
}
