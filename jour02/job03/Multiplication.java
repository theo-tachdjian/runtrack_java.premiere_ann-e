import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			
			int num = Integer.parseInt(sc.nextLine());
			
			for (int i = 0; i<9;i++) {
				System.out.println((i+1) + " x " + num + " = " + (i+1)*num);
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}