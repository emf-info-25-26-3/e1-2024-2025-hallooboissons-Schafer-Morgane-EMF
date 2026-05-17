package app;

import models.Bouteille;
import models.Cageot;
import models.Client;
import models.Commande;

public class Application {

    public static void main(String[] args) {
        Commande[] commandes = new Commande[10];
        Client client1 = new Client("Ducobu", "Jean", "Bulle");
        Client client2 = new Client("Haroni", "Mac", "Fribourg");
        Cageot cageot1 = new Cageot("X83H4");
        Cageot cageot2 = new Cageot("X83H5");
        Cageot cageot3 = new Cageot("X83H6");
        Cageot cageot4 = new Cageot("X83H7");
        Bouteille bouteille1 = new Bouteille("Henniez rouge", 2.60, 1, true);
        Bouteille bouteille2 = new Bouteille("Henniez verte", 2.60, 1, true);
        Bouteille bouteille3 = new Bouteille("Coca-Cola", 3.85, 1.5, false);
        Bouteille bouteille4 = new Bouteille("Pepsi", 3.55, 1.5, false);
        Bouteille bouteille5 = new Bouteille("Sinalco", 4.25, 1.5, false);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille1);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille2);
        cageot1.ajouterBouteille(bouteille2);
        cageot2.ajouterBouteille(bouteille3);
        cageot2.ajouterBouteille(bouteille3);
        cageot3.ajouterBouteille(bouteille4);
        cageot3.ajouterBouteille(bouteille5);
        cageot4.ajouterBouteille(bouteille1);
        cageot4.ajouterBouteille(bouteille3);
        cageot4.ajouterBouteille(bouteille3);
        commandes[0] = new Commande(client1);
        commandes[1] = new Commande(client2);
        commandes[0].ajouterCageot(cageot1);
        commandes[0].ajouterCageot(cageot2);
        commandes[0].ajouterCageot(cageot3);
        commandes[1].ajouterCageot(cageot4);
        afficherCommande(commandes[0]);
        afficherCommande(commandes[1]);
    }

    public static void afficherCommande(Commande commande) {
        if (commande != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            System.out.println("La commande contient " + commande.listeCageots().length + " cageots.");
            System.out.println("Le prix total de la commande est de " + commande.prixCommande() + " Frs.");
        }
    }
}