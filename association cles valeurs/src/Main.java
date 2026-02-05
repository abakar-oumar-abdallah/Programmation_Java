import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Implémentation de Map
        var departements = new HashMap<Integer, String>();

        // La méthode put permet l'ajout ou la modification d'un enregistrement de la collection
        departements.put(1, "Ain");
        departements.put(2, "Aisne");
        departements.put(3, "Allier");

        System.out.println(departements);

        departements.put(1, "Ain modifié"); // La clé existe déjà, modifie l'enregistrement 1 pour donner la valeur "Ain modifié".

        //Il est également possible de lire ou de supprimer des valeurs en se basant sur la clé :
        var ain = departements.get(1);
        departements.remove(2);

        var  verify = departements.containsKey(2);
        var verity = departements.containsValue("Allier");

        System.out.println(departements);
        System.out.println(ain);
        System.out.println(verify);
    }
}

/*
Les Map sont des collections qui fonctionnent par clé / valeur. Chaque enregistrement dans les Map possèdent donc deux éléments.
Ces types de collections sont très puissants, car ils permettent de relier des valeurs à des index et de rendre l'accès aux données plus performant.

Important : Les Map requièrent deux types différents dans l'opérateur diamant<>. Ils sont nécessaires pour typer les clés et les valeurs de la collection.
 */
