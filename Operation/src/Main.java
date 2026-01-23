public class Main {

    public static void main(String[] arg) {

        var plusPetit = 2;
        var plusGrand = 4;
        var nombreInt = 4;
        nombreInt *= 2;

        var resultat = (plusPetit + plusGrand) * 5;

        var testEgalite = plusPetit == plusGrand;
        var testPlusPetit = plusPetit > plusGrand;
        var testPlusGrand = plusPetit < plusGrand;
        var testDeDifference = plusPetit != plusGrand;

        var hello1 = "Hello";
        var hello2 = new String("Hello");


        System.out.println("La valeur de nombreInt est: " + nombreInt);
        System.out.println("Le résultat du calcul est : " + resultat);
        System.out.println("Le reste du résultat est : " + resultat % nombreInt);

        System.out.println("Les deux nombres sont-ils égals : " + testEgalite);
        System.out.println("Le nombre plusPetit est-il supérieur au nombre plusGrand ? : " + testPlusPetit);
        System.out.println("Le nombre plus petit est-il inférieur au nombre plus grand ? : " + testPlusGrand);
        System.out.println("Les deux nombres sont-ils différents en valeur ? : " + testDeDifference);

        System.out.println("Ici, les deux variables sont considérés comme deux objets différents : " + (hello1 == hello2));
        System.out.println("Ici, ce sont les contenus de deux variables qui sont testés : " + hello1.equals(hello2) );

    }
}