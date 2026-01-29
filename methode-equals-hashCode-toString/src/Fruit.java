import java.util.Objects;

public class Fruit {
    private String nom;
    private String couleur;
    private String origine;

    public Fruit(String nom, String couleur, String origine) {
        this.nom = nom;
        this.couleur = couleur;
        this.origine = origine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(nom, fruit.nom) && Objects.equals(couleur, fruit.couleur) && Objects.equals(origine, fruit.origine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, couleur, origine);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", origine='" + origine + '\'' +
                '}';
    }
}
