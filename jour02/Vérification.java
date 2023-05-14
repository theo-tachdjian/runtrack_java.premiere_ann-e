import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez votre age : ");

		try {
			
			int age = Integer.parseInt(sc.nextLine());
			
			if (age < 16) {		
				System.out.println("Vous ne pouvez pas travailler !");
			} else if (age >= 67) {		
				System.out.println("Vous êtes à la retraite !");
			} else {		
				System.out.println("Vous pouvez travailler !");
				if (age > 55) {		
					System.out.println("... mais vous aurez du mal à trouver un emploi !");
				}
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}