package models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Cageot {
    // Attribut
    private int nbrBouteillePouvantContenir;
    private final String identifiant;
    private Bouteille[] cageot;

    // Constructeur
    public Cageot(String identifiant) {
        nbrBouteillePouvantContenir = 12;
        this.identifiant = identifiant;
        cageot = new Bouteille[nbrBouteillePouvantContenir];
    }

    // Méthodes
    public boolean ajouterBouteille(Bouteille bouteilleAAjouter) {
        boolean aRetourner = false;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] == null) {
                cageot[i] = bouteilleAAjouter;
                aRetourner = true;
                break;
            }
        }
        return aRetourner;
    }

    public boolean enleverBouteille(Bouteille bouteilleAEnlever) {
        boolean aRetourner = false;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] == bouteilleAEnlever) {
                cageot[i] = null;
                aRetourner = false;
            }
        }
        return aRetourner;
    }

    public int nbrBouteilleStocke() {
        int aRetourner = 0;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                aRetourner++;
            }
        }
        return aRetourner;
    }

    public int nbrPlaceRestante() {
        int aRetourner = 0;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] == null) {
                aRetourner++;
            }
        }
        return aRetourner;
    }

    public void listeBouteille() {
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                System.out.println(cageot[i]);
            }
        }
    }

    public double prixTotal() {
        double prixTotal = 0;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                double prixBouteille = cageot[i].getPrix();
                prixTotal += prixBouteille;
            }
        }
        return prixTotal;
    }

    public static String formaterNbrBouteille(double valeur) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        DecimalFormat decimalFormat = new DecimalFormat("00", symbols);
        return decimalFormat.format(valeur);
    }

    // getters et setters
    public String getIdentifiant() {
        return identifiant;
    }

    // toString
    public String toString() {
        return "Cageot '" + identifiant + "' avec " + formaterNbrBouteille(nbrBouteilleStocke()) + "/"
                + formaterNbrBouteille(nbrPlaceRestante()) + "bouteilles";
    }
}
