import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somme = 0;
		
		System.out.print("Veuillez entrer un nombre : ");
		
		try {
			int range = sc.nextInt();
			
			if (range < 1) {
				System.out.println("Veuillez rentrer un nombre plus grand");
			} else {
				long startTime = System.currentTimeMillis();
				
				for (int i = 1; i <= range; i++) {
					somme += i;
				}
				
				System.out.println("Somme : "+somme);
				
				System.out.println("Temps exécution : "+(System.currentTimeMillis() - startTime) + " ms");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Erreur, réessayez");
		}
		
	}

}