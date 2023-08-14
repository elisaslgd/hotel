import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelApplication {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Scanner scanner;


        Scanner scanner = new Scanner(System.in);

        // Création de clients, chambres et réservations (à compléter)

        System.out.println("Hôtel créé avec succès!");

        // Exemple de menu IHM console (à compléter)
        while (true) {
            System.out.println(
                    System.out.println

                    System.out
                    "1. Ajouter un client");
            System.out.println("2. Ajouter une chambre");
            System.out.println("3. Créer une réservation");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:
                    System.out.println("Au revoir!");
                    scanner.close();
                    System.exit(
                            scanner.close
                            0);


                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}


