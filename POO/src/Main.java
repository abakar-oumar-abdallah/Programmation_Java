public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit("Faise", "Rouge", "Tchad");
        Fruit fruit2 = new Fruit("Pomme", "Vert", "Cameroun");
        System.out.println("Fruit : " + fruit.nom);
        System.out.println("Origine : " + fruit.origine);
        System.out.println("Fruit : " + fruit2.nom);
        System.out.println("Fruit : " + fruit2.origine);

        // L'objet avec surchage de constructeur
        Fruit fruit3 = new Fruit("Orange");
        System.out.println("Fruit : " + fruit3.nom);
        System.out.println("Origine : Sans origine");

    }
}

/*

Les classes :

En Java, il est interdit de définir plusieurs classes différentes dans le même fichier source.
Il faut donc créer autant de fichier .java que de classe dans le code (à l'exception des classes internes que nous
verrons plus tard dans le chapitre).

Le nom d'une classe doit respecter la convention de nommage du PascalCase
(toutes les premières lettres de chaque mot doivent être en majuscule).

Les objets :

Pour rappel, un objet représente une instance d'une classe.
 */