import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			
			int numero = Integer.parseInt(sc.nextLine());
			
			sc.close();
			
			System.out.println("Le numéro entré contient " + (Integer.toString(numero).length() - ((numero < 0) ? 1:0)) + " chiffre(s).");
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}