public class Main {
    public static void main(String[] args) {
        int[] entiers; // 1 dimension
        int[][] entiers2; // 2 dimensions
        int[][][] entiers3; // 3 dimensions

        // Instanciation
        entiers = new int[]{1, 2, 1};
        entiers2 = new int[][] { {3, 2, 1}, {1, 3, 2}, {1, 1, 4} };
        entiers3 = new int[][][] {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}},
        };

        System.out.println(entiers3[1][0][1]);
        // Dans ce cas, on accède au deuxième élément de la première dimension, puis au premier élément de la seconde dimension
        // et enfin à la deuxième position de la troisième dimension. Cette lecture correspond à la huitième valeur du tableau.

        entiers3[1][0][1] = 20; // L'élément à cet indice prend une nouvelle valeur.

        System.out.println(entiers3[1][0][1]);

        for (int[][] premiereDimension : entiers3) {
            for (int[] deuxiemeDimension : premiereDimension) {
                for (int troisiemeDimension : deuxiemeDimension) {
                    System.out.println(troisiemeDimension);
                }
            }
        }
    }
}

/*
En Java, un tableau est une structure de données contenant un groupe d'éléments tous du même type, avec des adresses
consécutives dans la mémoire. Un tableau a un nombre fixe d'éléments et il est impossible de changer sa taille.

Il est possible de lire, écrire et itérer sur un tableau
 */