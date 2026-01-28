public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit("Faise", "Rouge", "Tchad");
        Fruit fruit2 = new Fruit("Pomme", "Vert", "Cameroun");
        System.out.println("Fruit : " + fruit.nom);
        System.out.println("Origine : " + fruit.origine);
        System.out.println("Origine : " + fruit.estTchadien()); // Appliation de la méthode estTchadien
        System.out.println("Fruit : " + fruit2.nom);
        System.out.println("Fruit : " + fruit2.origine);
        System.out.println("Origine : " + fruit2.estTchadien()); // Appliation de la méthode estTchadien

        // L'objet avec surchage de constructeur
        Fruit fruit3 = new Fruit("Orange", "Nigéria");
        System.out.println("Fruit : " + fruit3.nom);
        System.out.println("Origine : " + fruit3.origine);

        // Application de la méthode sur l'objet
        System.out.println("Origine : " + fruit3.estTchadien());

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

Les attributs (ou propriétés) :

Pour rappel, il est possible de définir des attributs dans les classes afin de représenter
des concepts plus complexes que les types natifs.

Les constructeurs :

Les constructeurs sont des fonctions particulières qui permettent de créer des objets grâce au mot-clé new.

Le mot-clé this :

Dans le bloc d'instructions du constructeur précédent, on voit l'utilisation du mot-clé this.
Il s'agit en fait de l'objet qui sera instancié à l'utilisation du new.

Les méthodes :

Les méthodes sont des fonctions particulières appliquables directement aux objets.

Utilisation des méthodes :

L'intérêt des méthodes, c'est qu'elles permettent de définir des fonctions qui ont accès aux attributs des objets que l'on a instancié.
 */