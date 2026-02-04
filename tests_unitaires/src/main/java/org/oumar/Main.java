package org.oumar;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Personne personne = new Personne("ABAKAR", "Oumar Abdallah", 27, "2 Rue Saint Theodore App 15, 13001 Marseile" );

        System.out.println(personne.getAdresse());
    }
}
