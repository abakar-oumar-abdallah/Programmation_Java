import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Pommes");
        fruits.add("Poires");
        fruits.add("Fraises");
        fruits.add("Mangues");

        for (String fruit : fruits) {
            if (fruit.equals("Pommes")) {
                continue;
            }
            System.out.println(fruit);

            if (fruit.equals("Fraises")) {
                break;
            }

            // Une autre manière d'utiliser break sdans le cas de switch.

            switch (fruit) {
                case "Pommes" :
                    System.out.println(fruit);
                    break;
                case "Poires" :
                    System.out.println(fruit);
                    break;
            }
        }

    }

}

/*

Dans cette leçon, les structures de contrôle itératives et conditionnelles sont utilisées en même temps
pour comprendre l'utilisation de deux nouvelles instructions : continue et break.

Quand continue s'exécute, la boucle passe à l'itération suivante directement sans exécuter le reste du bloc.
Voici le résultat de l'exécution :

Quand break s'exécute, on sort de la boucle même si la condition de sortie n'est pas encore vraie.
 */