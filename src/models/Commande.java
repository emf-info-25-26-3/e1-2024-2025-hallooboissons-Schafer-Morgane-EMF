package models;

public class Commande {
    // Attribut
    private final Client client;
    private Cageot[] cageots;

    // Constructeur
    public Commande(Client client) {
        this.client = client;
        cageots = new Cageot[8];
    }

    // Méthodes
    public boolean ajouterCageot(Cageot cageotAAjouter) {
        boolean cageotAjouter = false;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == null) {
                cageots[i] = cageotAAjouter;
                cageotAjouter = true;
                break;
            }
        }
        return cageotAjouter;
    }

    public boolean supprimerCageot(Cageot cageotASupprimer) {
        boolean cageotSupprimer = false;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == cageotASupprimer) {
                cageots[i] = null;
                cageotSupprimer = true;
            }
        }
        return cageotSupprimer;
    }

    public void commandeAnnule() {
        cageots = null;
    }

    public void listeCageot() {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                System.out.println(cageots[i]);
            }
        }
    }

    public double prixCommande() {
        double prixCommande = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                cageots[i].prixTotal();
            }
        }
        return prixCommande;
    }

    // Getters et Setters
    public Client getClient() {
        return client;
    }

    public Cageot[] listeCageots() {
        return cageots;
    }
}
