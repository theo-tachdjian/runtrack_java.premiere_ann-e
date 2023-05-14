import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			
			int num = Integer.parseInt(sc.nextLine());
			
			sc.close();
			
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					
					String line = "";
					for (int j = 0; j < i; j++) {
						line += "*";
					}
					System.out.println(line);
				}
			} else {
				System.out.println("L'entrée n'est pas positive !");
			}
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}