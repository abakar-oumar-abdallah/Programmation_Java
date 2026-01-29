public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit("Faise", "Rouge", "Tchad");

        /*
        Fruit fruit2 = new Fruit("Pomme", "Vert", "Cameroun");
        System.out.println("Fruit : " + fruit.nom);
        System.out.println("Origine : " + fruit.origine);
        System.out.println("Origine : " + fruit.estTchadien()); // Appliation de la méthode estTchadien
        System.out.println("Fruit : " + fruit2.nom);
        System.out.println("Fruit : " + fruit2.origine);
        System.out.println("Origine : " + fruit2.estTchadien()); // Appliation de la méthode estTchadien

        - L'objet avec surchage de constructeur
        Fruit fruit3 = new Fruit("Orange", "Nigéria");
        System.out.println("Fruit : " + fruit3.nom);
        System.out.println("Origine : " + fruit3.origine);

        - Application de la méthode sur l'objet
        System.out.println("Origine : " + fruit3.estTchadien());
         */

        // L'utilisation des accesseurs
        System.out.println("Avant de setter notre est fruit est : " + fruit.getNom());

        // Chanement du nom du fruit
        fruit.setNom("Pomme");
        System.out.print("Après avoir setté le fruit : " + fruit.getNom());

        Banane banane = new Banane("RCA");
        System.out.println(banane.descriptionFruit());

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

L'intérêt des méthodes, c'est qu'elles permettent de définir des fonctions qui ont accès aux attributs
des objets que l'on a instancié.

Les accesseurs :

Le principe d'encapsulation :

En programmation, l’encapsulation désigne le regroupement de données avec un ensemble de routines
qui en permettent la lecture et la manipulation. En pratique, on va gérer l'encapsulation des données
en utilisant les accesseurs dans du code Java.

Les accesseurs sont des méthodes tout à fait normales. Leur rôle se limite à la lecture ou à la modification
des attributs d'un objet.

Cela implique également que l'on travaillera uniquement avec des attributs private par la suite pour s'assurer
que l'accès aux attributs des objets se fera toujours de la manière prévue par le développeur.

Les getters :

Les getters sont des accesseurs de lecture.

Les setters :

Les setters sont des accesseurs d'écriture.

Attention : Définir des setters dans une classe rend les objets créés par la suite mutables. Autant que possible,
il est conseillé de ne pas rendre les objets mutables pour éviter des bugs liés aux modifications
(un objet peut être référencé à différents endroits du code et donc il peut être modifié à différents endroits également).

L'héritage :

L'héritage permet de créer des classes "enfants" d'autres classes afin d'hériter automatiquement de leurs comportements.

Grâce à l'héritage, les objets d'une classe fille ont accès aux données et aux méthodes de la classe parente et peuvent les étendre.

Note : l'héritage multiple n'existe pas en Java, ce qui signifie qu'une classe ne peut pas hériter de plusieurs classes
parentes, mais d'une seule.

Le mot-clé extends permet d'hériter de la classe Fruit.

Le constructeur parent est appelé en utilisant l'invocation super(...).

Il est possible de surcharger le comportement d'une méthode de la classe parente en utilisant l'annotation @Override.
Les annotations sont une notation particulière en Java qui peuvent être appliquées sur des classes ou des attributs
ou des méthodes. Nous verrons en détails leur fonctionnement dans un prochain chapitre.

N'importe quelle méthode de la classe parente peut être appelée en utilisant l'invocation super.nomDeLaMethode(...).
Limitation : Il n'est pas possible d'utiliser un attribut private ou une méthode private de la classe parente dans la classe fille.

Classes final :

Les classes final ne peuvent pas être héritées. Ainsi, le code suivant ne compilera pas :

public class StringCustom extends String { }
En effet, String est une classe final. Il n'est donc pas possible de l'étendre

Classes abstract :

Les classes abstract permettent de définir des classes qui ne peuvent pas créer d'objets. Le but est de créer une classe
avec des données et des comportements par défaut qui pourront ensuite être héritées par des classes filles.

Méthodes abstract :

Dans les classes abstract, il est possible de définir des méthodes abstract. Ce sont des méthodes qui n'ont pas de bloc
d'instructions mais qui doivent obligatoirement être surchargées par les classes filles.

On peut définit une méthode abstract ainsi :

public abstract class Fruit {
    ...
    public abstract String abstractMethod();
}
 */