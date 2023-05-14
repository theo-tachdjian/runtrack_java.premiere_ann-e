import java.util.Scanner;

class EchangeString {
	
	public static void main(String[] args) {
		
		// Ouvre une commande qui permet d'enregistrer une réponse
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un mot, ou une phrase : ");
		String chaine1 = sc.nextLine();
		
		System.out.print("Entrez un nouveau mout ou une nouvelle phrase : ");
		String chaine2 = sc.nextLine();
		
		//Permet d'échanger la chaine1 et la chaine2
		args = new String[1];
		args[0] = chaine1;
		
		chaine1 = chaine2;
		chaine2 = args[0];
		System.out.println(chaine1 + " ; " + chaine2);
		
		// Permet d'arrteter le code
		sc.close();
		
	}
	
}