public class Main {

    public static void main(String[] args) {
        int resultat = addition(50, 40);
        System.out.println("La somme est : " + resultat);

        String chains = afficher("ABAKAR", " Oumar"); // Les éléments entre () sont des arguments
        System.out.println(chains);
    }

    public static int addition(int entier1, int entier2) {
        return entier1 + entier2;
    }

    public static String afficher(String chain1, String chain2) { // Les éléments entre () sont des paramètres
        return chain1 + chain2;
    }
}

/*
Paramètres et arguments :

Un peu de vocabulaire est nécessaire autour des paramètres et arguments pour bien comprendre comment les fonctions sont
définies.

Les paramètres d'une fonction sont les noms listés dans la définition de la fonction. Les arguments d'une fonction
sont les valeurs réelles passées à la fonction. Les paramètres sont initialisés avec les valeurs des arguments fournis.

 */