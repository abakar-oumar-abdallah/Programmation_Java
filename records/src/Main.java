public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Pomme", "Vert", "Tchad");

        System.out.println(fruit);
    }
}

/*
Les records :

Les records sont un type de classe Java qui proposent une syntaxe compacte pour la déclaration de classes aux
fonctionnalités restreintes qui agrègent des valeurs de manière immuable.

Les records répondent aux besoins suivants :

créer facilement des objets qui expriment une simple agrégation de valeurs immuables.
implémenter automatiquement des méthodes orientées données telles que les accesseurs et les méthodes equals(), hashCode() et toString()
 */