/*

📝 Énoncé

Écrire un programme Java qui :

Demande à l’utilisateur de saisir son âge.

Récupère l’âge saisi au clavier.

Affiche un message différent selon les cas suivants :

Si l’âge est strictement supérieur à 100, afficher :
« Vous êtes centenaire »

Sinon, si l’âge est supérieur ou égal à 18, afficher :
« Félicitations ! Vous êtes majeur »

Sinon, si l’âge est strictement inférieur à 0, afficher :
« Âge non valide »

Sinon, afficher :
« Désolé, vous êtes encore mineur »

⚙️ Contraintes techniques

Utiliser la classe Scanner pour la saisie utilisateur

Utiliser des conditions if / else if / else

Le programme doit s’exécuter dans la méthode main

*/

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    var saisieUtilisateur = new Scanner(System.in);

    System.out.println("Saissisez votrte âge :");

    var age = saisieUtilisateur.nextInt();

    if(age > 100) {
      System.out.println("Vous êtes centenaire");
    }

    else if (age >= 18) {
      System.out.println("Félications ! Vous êtes majeur");
    }

    else if (age < 0) {
      System.out.println("Age non valide");
    }

    else {
      System.out.println("Désolé. Vous êtes encore mineure");
    }

  }

}

/*

Aller plus loin : la saisie utilisateur dans la console

Il est possible de demander à un utilisateur de saisir des données dans la console lors de l'exécution de programmes Java. Voici comment faire :

var saisieUtilisateur = new Scanner(System.in);
System.out.println("Saisissez un age :");
var age = saisieUtilisateur.nextInt();

Les objets Scanner et System

Scanner est un objet natif Java qui va nous permettre de lire du contenu depuis une source : ici System.in.

System.in fait référence à l'entrée standard utilisateur qui correspond par défaut au terminal.

Les fonctions de saisies de Scanner

Il est ensuite possible d'appeler des fonctions de Scanner pour lire des données provenant de la source (donc ici du terminal) : nextInt(), nextBoolean(), nextLine(), ...
Dans l'exemple précédent, saisieUtilisateur.nextInt() essaie de convertir l'entrée de l'utilisateur depuis la console en entier, et d'assigner la valeur de l'entier à la variable age.

Import

Pour utiliser Scanner, il faut importer l'objet de la manière suivante en première ligne du fichier Main.java

import java.util.Scanner;

 */