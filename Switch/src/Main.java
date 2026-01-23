/*
Écrire un programme Java qui :

Demande à l’utilisateur de saisir un chiffre entier.

Récupère la valeur saisie au clavier.

Utilise une structure switch pour effectuer les traitements suivants :

Si l’utilisateur saisit 1, afficher "I"

Si l’utilisateur saisit 2, afficher "II"

Si l’utilisateur saisit 3, afficher "III"

Pour toute autre valeur, afficher "Invalide"

Améliorer le programme afin de :

✅ Gérer les chiffres de 1 à 5

🔍 Vérifier que l’utilisateur saisit bien un nombre

🔁 Répéter la saisie tant que la valeur est invalide

⚠️ Afficher des messages d’erreur explicites
 */



/*
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saissisez un chiffre :");

        var chiffre = saisieUtilisateur.nextInt();

        switch(chiffre) {

            case 1:
                System.out.println("I");
                break;

            case 2:
                System.out.println("II");
                break;

            case 3:
                System.out.println("III");
                break;

            default:
                System.out.println("Invalide");
        }
    }
}
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chiffre = 0;

        // Boucle tant que le chiffre n'est pas valide
        while (chiffre < 1 || chiffre > 5) {

            System.out.print("Veuillez saisir un chiffre entre 1 et 5 : ");

            // Vérifie que la saisie est un nombre entier
            if (scanner.hasNextInt()) {

                chiffre = scanner.nextInt();

                if (chiffre < 1 || chiffre > 5) {
                    System.out.println("❌ Erreur : le chiffre doit être compris entre 1 et 5.");
                }

            } else {
                System.out.println("❌ Erreur : la saisie doit être un nombre entier.");
                scanner.next(); // Nettoyage de la saisie invalide
            }
        }

        // Conversion en chiffre romain
        System.out.print("✅ Résultat : ");

        switch (chiffre) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
        }

        scanner.close();
    }
}

/*
L'instruction switch

Tout comme l'instruction if, l'instruction switch n'est pas une expression, elle n'est pas assignable.

Il est possible de l'implémenter de la manière suivante :

var chiffre = 2;
switch (chiffre) {
    case 1 :
        System.out.println("I");
        break;
    case 2 :
        System.out.println("II");
        break;
    default:
        System.out.println("Invalide");
}

switch est appliqué à une variable pour tester le contenu de celle-ci.

L'instruction case
Permet de définir les différentes valeurs possible de la variable testée. Ce sont des tests d'égalité uniquement.

L'instruction default
Permet de définir le comportement par défaut du switch ni aucune des conditions d'égalité n'est vraie.
 */