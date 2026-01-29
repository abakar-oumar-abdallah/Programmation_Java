public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit("Mangue", "Vert", "Tchad");
        var fruit2 = new Fruit("Mangue", "Jaune", "Tchad");

        System.out.println(fruit.equals(fruit2));

    }
}