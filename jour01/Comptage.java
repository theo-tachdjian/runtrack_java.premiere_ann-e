import java.util.Scanner;

class Boucle {
	
	public static void main(String[] args) {
		
		// Ouvre une commande qui permet dd'enregistrer une réponse
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			// On récupere la réponse et on vérifie si il y a une erreur
			int nbre = Integer.parseInt(sc.nextLine());
			
			if (nbre >= 1) {
				int i = 1;
				
				while (i < nbre) {
					System.out.print(i+",");
					
					i += 1;
				}
				System.out.print(nbre+"\n");
			} else if (nbre == 1) {
				System.out.println(1);
			} else {
				System.out.println("Le nombre n'est pas valide !");
			}
			
		// Permet d'arrteter le code et affiche si il y a eu une erreur
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}