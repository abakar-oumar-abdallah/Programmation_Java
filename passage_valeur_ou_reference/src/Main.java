import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var list = new ArrayList<String>();

        //ajouter des valeurs dans la liste
        list.add("value1");

        mofify(list);
        System.out.println(list);
    }

    private static void mofify(ArrayList list) {
        list.add("value2");
    }

}

/*
Passage par valeur ou référence

Dans l’exemple suivant :

public static void modify(int x) {
    x = 12; //Modification de la valeur local uniquement car il ne s’agit pas d’une référence
}

public static void main(String[] args) {
    var x = 1;
    modify(x);
    System.out.println(x); //Affiche 1 car non modifié
}

Lors de l’utilisation des types natifs Java en tant qu’arguments d’une fonction, l’initialisation de la variable locale
x de la fonction se fait par valeur et non pas par référence. Il n’est donc pas possible de modifier l’argument utilisé
par la fonction main au sein de la fonction modify.

Passage par référence :

public static void modify(ArrayList<String> x) {
    x.add("c"); // Modifier la référence
}

public static void main(String[] args) {
    var x = new ArrayList<String>();
    x.add("a");
    x.add("b");
    modify(x); // Va modifier la liste car il s’agit d’une référence
    System.out.println(x); // Affiche [a, b, c] car modifié par la fonction
}

Contrairement au passage par valeur, on passe ici une référence car on utilise ici un objet. Il est alors possible de
le modifier dans la fonction car il s’agit d’un objet mutable.

Attention : Il n’est pas conseillé de modifier des objets dans des fonctions séparées comme dans l’exemple précédent car
cela entraine un risque accru de bugs.
 */