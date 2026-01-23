public class Main {

    public static void main(String[] args) {

        //Appel de la prémière fonction
        var chaine = helloWorld();
        System.out.println(chaine);

        //Appel la deuxième fonction
        var somme = addition(57, 12);
        System.out.println("L'addition nous donne : " + somme);
    }

    private static String helloWorld() {
        return "Hello World";
    }

    public static int addition(int x, int y) {
        return x + y;
    }
}

/*

Qu'est-ce qu'une fonction ?

Une fonction est un bloc d'instructions qui peut être exécuté à différents endroits du programme.
Il s'agit donc d'un bout de code réutilisable à différents endroits dans le programme.

Les fonctions en Java sont en fait des méthodes statiques : ça veut dire qu'elles sont définies obligatoirement à l'intérieur d'une class sans pour autant être des fonctions liées aux objets.

Les mots-clés public et privat :

Une fonction public peut être appelée par n'importe quelle autre fonction dans le code.
Une fonction private ne peut être appelée que par des fonctions de la même class que celles de la fonction private.

Le mot-clé static :

Dans ce chapitre, nous définirons toujours des fonctions / méthodes statiques.
Pour cela, il faut ajouter le mot-clé static à la définition de la fonction.

Sans le mot-clé static, cela correspond alors à des méthodes pour les objets.
Nous verrons comment celles-ci fonctionnent dans le chapitre sur la POO.

Conventions de nommage :

Les fonctions suivent la convention de nommage du camelCase.
Tous les mots après le premier mot commencent par une majuscule et le reste est en minuscule.

Les class suivent la convention de nommage du PascalCase.
Tous les mots commencent par une majuscule (y compris le premier). Le reste est en minuscule.
 */