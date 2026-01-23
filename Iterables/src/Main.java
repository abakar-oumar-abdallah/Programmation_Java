import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] tableau = new int[5];
        tableau[0] = 2;
        tableau[1] = 5;
        tableau[3] = 2;

        System.out.println(tableau[0]);

        int[] tableau2 = {1, 4, 2, 9};

        var tableau3 = new int[]{7,8};

        var fruits = new ArrayList<String>();

        fruits.add("Pommes");
        fruits.add("Mangue");
        fruits.add("Poivre");

        System.out.println(fruits.get(2));
        System.out.println();

    }
}

/*
Les tableaux

Les tableaux permettent de définir des collections de types natifs ou d'objets.

Leur taille est fixe et ne peut pas être changée une fois qu'ils sont déclarés.

Les listes

Les listes permettent de définir des collections d'objets uniquement.

Leur taille n'est pas fixe, il est possible d'ajouter ou de supprimer des éléments à la volée,
quand elles sont mutables (c'est le cas de la liste de type ArrayList que nous avons utilisé).
 */