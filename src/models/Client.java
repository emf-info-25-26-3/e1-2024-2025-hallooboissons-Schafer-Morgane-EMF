package models;

public class Client {
    // Atributs
    private String nom;
    private String prenom;
    private String ville;

    // Constructeur
    public Client(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    // toString
    public String toString() {
        return "Client " + nom.toUpperCase() + " " + prenom + " - " + ville;
    }
}
