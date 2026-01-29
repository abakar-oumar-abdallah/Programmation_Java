public interface Motorise {
    void pleinEssence();
}

/*
Les méthodes des interfaces ne peuvent pas être private. C'est normal car le but est de forcer l'utilisation de
ces méthodes pour les classes filles. Il n'est donc pas nécessaire de préciser le mot-clé public dans le cas des
méthodes d'interfaces.
 */