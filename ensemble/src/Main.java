void main() {
    var set = new HashSet<Integer>();

    // Ajouter des éléments dans l'ensemble
    set.add(55);
    set.add(2);
    set.add(2);
    set.add(55);
    set.add(2);
    set.add(2);

    // Quand on ajoute des valeurs dupliquées, il n'y a pas d'erreurs. Cependant, les valeurs dupliquées ne sont pas insérées.
    System.out.println(set);

    // Il est possible de vérifier si le Set contient un élément dans ses valeurs
    // La méthode contains
    if (set.contains(2)) {
        System.out.println("L'élément existe dans l'ensemble donné : " + set.contains(2));
    }

    // HashSet et null
    set.add(null);
    set.add(null);
    System.out.println(set); // Note : On voit que null n'est présent qu'une seule fois. Comme les autres valeurs, null n'est pas dupliqué.

    // TreeSet : Implémentation de trieSet
    var trieSet = new TreeSet<String>();
    trieSet.add("ABAKAR");
    trieSet.add("Oumar");
    trieSet.add("Abdallah");
    trieSet.add("Abakar");
    trieSet.add("Tahir");
    trieSet.add("Oumar");
    System.out.println(trieSet); // Le tri par défaut ici insère les éléments par ordre alphabétique


    // Il est possible de changer le tri naturel des TreeSet

    // Comparator
    var trieSetInverse = new TreeSet<String>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    });
    trieSetInverse.add("Adam");
    trieSetInverse.add("Abakar");
    trieSetInverse.add("Tahir");
    System.out.println(trieSetInverse); // En inversant la comparaison des objets, on obtient un tri qui est l'ordre inverse de l'ordre alphabétique.
}

/*
Les ensembles :

Les Sets permettent de définir des ensembles : il n'est donc pas possible d'avoir des valeurs dupliquées dans le Set.

Leurs utilisations sont similaires aux List mais avec plus de restrictions.

Note : Tout comme pour List, l'opérateur diamant <> est utilisé pour préciser le type des valeurs des Sets.

HashSet : Implémentation de Set.

Note : On arrive à faire ces comparaisons avec des caractères (et des chaînes) car les caractères ont une valeur numérique.
C'est pour cette raison que le tri naturel est par ordre alphabétique, car la valeur numérique de 'a' est plus petite que la valeur numérique de 'b'.

 */