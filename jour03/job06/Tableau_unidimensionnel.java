import java.util.Random;

class Main {

    public static void main(String[] args) {

        int [] array = new int[10];
        
        Random r = new Random();

        for (int i = 0; i<array.length; i++) {

        	array[i] = r.nextInt(Integer.MAX_VALUE);

        }
        
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

    }

}