import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	
	static int sum = 0;
	static int range = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Veuillez entrer un nombre : ");
		
		try {
			range = sc.nextInt();
			
			if (range < 1) {
				System.out.println("Veuillez rentrer un nombre plus grand");
			} else {
				long startTime = System.currentTimeMillis();
				
				Thread t1 = new Thread(() -> addToSum(0, range/2));
				Thread t2 = new Thread(() -> addToSum(range/2, range));
				
				t1.start();
				t2.start();
							
				while (t1.works() || t2.works()) {}
				
				System.out.println("Somme : "+sum);
				
				System.out.println("Temps exécution : "+(System.currentTimeMillis() - startTime) + " ms");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Erreur, réessayez");
		}
		
	}
	
	static synchronized void addToSum(int start, int stop) {
		for (int i = start+1; i <= stop; i++) {
			sum += i;
		}
	}

}