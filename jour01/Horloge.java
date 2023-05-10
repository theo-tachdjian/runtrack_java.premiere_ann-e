import java.util.Scanner;

class Horloge {
	
	public static void main(String[] args) {
		
		// Ouvre une commande qui permet d'enregistrer une réponse
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une durée en minutes : ");

		try {
			// On récupere la réponse
			String input = sc.nextLine();
			
			// On convertit la réponse précédente en heures et en minutes grace aux variables nombre, heures et minutes
			long nombre = Long.parseLong(input);
			long heures = nbre / 60;
			long minutes = nbre % 60;
			 
			// On affiche sous fome de phrase la variable nombre avec son équivalence en heures et minutes
			System.out.println(nbre+" minutes est équivalent à " + heures + " heures et " + minutes + " minutes.");
			
			// Permet d'arrteter le code et affiche si il y a eu une erreur 
			sc.close();
		} catch (Exception e) {
			System.out.println("Erreur");
			sc.close();
		}
		
	}
	
}