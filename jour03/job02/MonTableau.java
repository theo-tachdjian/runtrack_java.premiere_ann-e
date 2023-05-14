class Main {

    public static void main(String[] args) {

        int[] monTableau = {12, 6, 76, 89};

        for (int i=0; i<monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        System.out.println();

        monTableau[0] = 127;
        monTableau[1] = 6456465;
        monTableau[2] = 741;
        monTableau[3] = 4685132;

        for (int i=0; i<monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

    }

}