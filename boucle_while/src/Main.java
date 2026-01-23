public class Main {
    public static void main(String[] args) {

        //while classique
        var compteur = 0;
        while (compteur < 0) {
            System.out.println(compteur);
            compteur++;
        }

        //do while
        compteur = 0;
        do {
            System.out.println(compteur);
            compteur++;
        } while (compteur < 0);

    }

}

/*
La boucle while permet de répéter des instructions tant qu'une condition est vraie.

Les différences :

La boucle commence par do et n'a pas de condition à ce niveau.
On exécute donc le contenu du bloc au moins une première fois.

le while à la fin vérifie la condition et sort de la boucle si elle est fausse.
Ne pas oublier le ; à la fin de la ligne qui est nécessaire ici.

Pour résumer, un do while exécute forcément au moins une itération
car la condition de sortie est vérifiée à la fin de la boucle.
 */