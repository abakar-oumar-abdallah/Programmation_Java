public class Fruit {

    // Instancier l'objet sur la classe interne
    FruitInterne fruitInterne = new FruitInterne();

    // La classe interne dans la classe Fruit
    public class FruitInterne {
        private String nomInterne = "nom interne";

        // Getter de la classe interne
        public String getNomInterne() {
            return nomInterne;
        }
    }
}

/*
Classes internes :

Note : Il est assez rare d'utiliser des classes internes.
Cela peut être utile quand on travaille sur des tests automatisés (les tests seront décrits dans un chapitre ultérieur).
Pour le moment, il est suffisant de savoir qu'il est possible d'imbriquer des classes.
 */
