public class Main {

    public static void main(String[] args) {
        var resultat = multiplication(5,3);
        System.out.println("La multiplication nous donne : " + resultat);

        // Ajout du boucle
        while (resultat < 200) {
            resultat = resultat + 10;

            System.out.println("Le nouveau résultat est : " + resultat);
        }
    }

    // Documenter la fonction en utilisant javadoc
    /**
     * Cette fonction sert à multiplier deux paramètres passer entrée et retourne le résultat de la multiplication
     * @param entier1 Le premier entier à multiplier
     * @param entier2 Le second entier à multiplier
     * @return int Le résultat de la multiplication
     */
    public static int multiplication(int entier1, int entier2) {
        return entier1 * entier2;
    }
}

/*
La javadoc :

Il est possible de créer de la documentation pour du code Java. On utilise pour cela la javadoc.

Pour les fonctions, la javadoc permet de décrire :

le fonctionnement de la fonction
les paramètres d’entrée
le retour de la fonction s’il y en a un

Pour documenter une fonction, on utilise une syntaxe très proche des commentaires multi-lignes,
comme le montre l’exemple ci-dessus. /** ... (étoite & slash) pour fermer.

Quelle utilité ?

La javadoc est surtout utile dans les deux cas suivants:

Lorsque l’on travaille sur une librairie utilisable par d’autres développeurs
Lorsque l’on travaille en équipe sur un même logiciel

Générer la javadoc :

Pour générer la javadoc, il est possible d’utiliser la commande suivante :

javadoc -d javadoc src/*
 */