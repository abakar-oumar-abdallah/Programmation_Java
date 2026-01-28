public class Fruit {

    private String nom;
    private String couleur;
    private String origine;

    public Fruit(String nom, String couleur, String origine) {
        this.nom = nom;
        this.couleur = couleur;
        this.origine = origine;
    }

    /*
    - La surchage de constructeur pour un nouvel objet
    public Fruit(String nom, String origine) {
        this.nom = nom;
        this.origine = origine;
    }

    - Les méthodes
    public boolean estTchadien() {
        if(this.origine.equals("Tchad")) return true;
        return false;
    }
     */

    // Les accesseurs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
