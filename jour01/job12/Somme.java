import java.util.Scanner;

class Somme {
	
	public static void main(String[] args) {
		
		// Ouvre une commande qui permet d'enregistrer une réponse
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Entrez un nombre : ");
			
			// On récupere la réponse et on vérifie si il y a une erreur
			double num1 = Double.parseDouble(sc.nextLine());
			System.out.print("Entrez un nouveau nombre : ");
			
			// On récupere la réponse et on vérifie si il y a une erreur
			double num2 = Double.parseDouble(sc.nextLine());
			
			// Permet d'arrteter le code et affiche si il y a eu une erreur 
			sc.close();
			
			System.out.println(num1 + num2);
			
		} catch (Exception e) {
			System.out.println("Erreur");
			sc.close();
		}
		
	}
	
}