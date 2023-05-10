import java.util.Scanner;

class AskName {
	
	public static void main(String[] args) {
		
		// Ouvre une commande qui permet dd'enregistrer une réponse
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez votre prénom : ");
		String prenom = sc.nextLine();
		
        // On récupere la réponse suivante
		System.out.println("Veuillez entrez votre nom : ");
		String nom = sc.nextLine();
		
        // Afficher les éléments reçu avec une phrase qui va bien 
		System.out.println("Vous vous appelez " + prenom + " " + nom);
		
		// Permet d'arrteter le code
		sc.close();
		
	}
	
}