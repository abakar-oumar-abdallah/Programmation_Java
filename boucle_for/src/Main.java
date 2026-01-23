import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //for classique
        int compteur;
        for (compteur = 0; compteur <10; compteur++) {
            System.out.println("Compteur " + compteur);
        }

        //Parcourir une collection
        ArrayList<String> fruits = new ArrayList<>();

        //Ajouter des élèments dans la liste
        fruits.add("Pomme");
        fruits.add("Mangue");
        fruits.add("Mandarine");

        //Le boucle pour parcourir
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}

/*

La boucle for permet de répéter des instructions un certains nombre de fois ou même de parcourir des collections.

On a : for classique & for sur itérables

 */