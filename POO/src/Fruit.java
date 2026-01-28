public class Fruit {

    public String nom;
    public String couleur;
    public String origine;

    public Fruit(String nom, String couleur, String origine) {
        this.nom = nom;
        this.couleur = couleur;
        this.origine = origine;
    }

    // La surchage de constructeur pour un nouvel objet
    public Fruit(String nom) {
        this.nom = nom;
    }

}
