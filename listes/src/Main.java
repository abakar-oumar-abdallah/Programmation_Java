import java.util.ArrayList;

void main() {
    var liste = new ArrayList<String>();

    // Méthode pour ajouter des éléments dans une liste
    liste.add("Premier");
    liste.add("Deuxième");
    liste.add("Troisième");

    System.out.println(liste);

    // Les ArrayList sont mutables. Il est donc possible d'en modifier leur taille contrairement auxtableaux.

    // Ajouter un élément à un index
    liste.add(1, "Avant deuxième");
    System.out.println(liste);

    // Ajout de valeurs dupliquées
    liste.add("Dupliquer");
    liste.add("Dupliquér");
    System.out.println(liste);

    // Lecture de la valeur d'un index
    var troisieme = liste.get(3);
    System.out.println(troisieme);

    // Modifier la valeur d'un index
    liste.set(4, "Maintenant quatrième");
    System.out.println(liste);

    // Il est possible de supprimer un élément à l'index voulu

    // Supprimer la valeur d'un index
    liste.remove(1); // Cela supprimera l'élément "Avant deuxième"
    System.out.println(liste);

    // Il est possible de vérifier si la List contient un élément dans ses valeurs

    // La méthode contains
    if (liste.contains("Premier")) {
        System.out.println("La liste contient l'élément : " + liste.contains("Premier"));
    }

    // ArrayList à n dimensions
    var space = new ArrayList<ArrayList<ArrayList<Integer>>>();
    space.add(new ArrayList<ArrayList<Integer>>());
    space.get(0).add(new ArrayList<Integer>());
    space.get(0).get(0).add(25);

    // ArrayList et null
    liste.add("valeur 1");
    liste.add(null);
    liste.add("valeur 2");
    System.out.println(liste); // Affiche [valeur 1, null, valeur 2]
}
