class Main {

    public static void main(String[] args) {

        int[] array = {3, 7, 3, 9, 8};

        int[] occurence = new int[array.length];

        for (int i = 0; i<array.length; i++) {

            for (int j = 0; j<array.length; j++) {

                if (array[j] == array[i]) {
                    occurence[i]++;
                }

            }

        }

        for (int i = 0; i<array.length; i++) {
            
            System.out.println("Occurences de "+array[i]+ " : " + occurences[i]);

        }

    }

}