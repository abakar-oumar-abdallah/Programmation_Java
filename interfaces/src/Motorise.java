public interface Motorise {
    default void pleinEssence() {
        System.out.println("Implémentation par défaut");
    };
}

/*
Les méthodes des interfaces ne peuvent pas être private. C'est normal car le but est de forcer l'utilisation de
ces méthodes pour les classes filles. Il n'est donc pas nécessaire de préciser le mot-clé public dans le cas des
méthodes d'interfaces.

Le mot-clé default:

Pour les méthodes des interfaces, il est possible de définir une implémentation par défaut.

Pour cela, il est possible d'utiliser le mot-clé default :

public interface Motorise {
    default void pleinEssence(){
        System.out.println("Implémentation par défaut");
    };
}

Ainsi, toutes les classes filles n'ont plus l'obligation de surcharger les méthodes des interfaces (mais elles peuvent
le faire quand même !). Il y a juste une implémentation par défaut qui sera appelée en cas d'absence de surcharge.
 */
