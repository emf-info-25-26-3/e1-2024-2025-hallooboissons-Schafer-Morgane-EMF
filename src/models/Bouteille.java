package models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Bouteille {
    // Attributs
    private final String nom;
    private final double prix;
    private final double contenance;
    private double remplissage;
    private final boolean enVerre;

    // Constructeur
    public Bouteille(String nom, double prix, double contenance, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        remplissage = 100.0;
        this.enVerre = enVerre;
    }

    // Méthodes
    public static String formatterPrix(double prix) {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("###.00", symbols);
        return decimalFormat.format(prix);
    }

    // getters et setters

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public void setRemplissage(double remplissageActuel) {
        this.remplissage = remplissageActuel;
    }

    public boolean estEnVerre() {
        return enVerre;
    }

    // toString
    public String toString() {
        String aRetourner;
        String contenuBouteille;
        if (remplissage == 100) {
            contenuBouteille = "pleine";
        } else if (remplissage == 0) {
            contenuBouteille = "vide";
        } else {
            contenuBouteille = "entamée";
        }
        if (enVerre == true) {
            aRetourner = "Bouteille '" + nom + "' de " + contenance + "L en verre à" + formatterPrix(prix)
                    + " Frs - " + contenuBouteille;
        } else {
            aRetourner = "Bouteille '" + nom + "' de " + contenance + "L en plastique à" + formatterPrix(prix)
                    + " Frs - " + contenuBouteille;
        }
        return aRetourner;
    }
}
