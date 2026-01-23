/*
📝 Énoncé

Écrire un programme Java qui :

Demande à l’utilisateur de saisir son âge.

Récupère l’âge saisi au clavier.

Utilise l’opérateur ternaire pour déterminer :

"Majeur" si l’âge est supérieur ou égal à 18

"Mineur" si l’âge est strictement inférieur à 18

Affiche le résultat à l’écran.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saisir un âge :");

        var age  = saisieUtilisateur.nextInt();

        var isMajeurString = age >= 18 ? "Majeur" : "Mineur";

        System.out.println(isMajeurString);
    }
}

/*
L'opérateur ternaire

Contrairement à if et switch, l'opérateur ternaire est une expression.
Comme tous les opérateurs, son résultat est assignable dans une variable.
Donc, ce n'est pas exactement une structure de contrôle,
mais son utilisation est très similaire à l'utilisation d'un if / else.
 */