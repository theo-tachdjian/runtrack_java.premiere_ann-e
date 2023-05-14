class Main {

    public static void main(String[] args) {

        int[] tableau = new int[5];

        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        for (int i=0; i<tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        System.out.println("Valeur de l'index 1: "+tableau[1]);

    }

}