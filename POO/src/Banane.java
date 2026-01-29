public class Banane extends Fruit {

    public Banane(String origine) { // Constgructeur de la classe fille
        super("Banane", "Jaune", origine); // Ici, on a appelé le constructeur de la classe parent avec le mot-clé super

    }

    @Override
    public String descriptionFruit() {
        return "surchage de la réponse " + super.descriptionFruit();
    }
}
