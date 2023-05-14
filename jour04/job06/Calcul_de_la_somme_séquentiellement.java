import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Main {
	
	static int sum = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez vos nombres en suivant le paterne suivant : 1,2,3,4,5 : ");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		try {
			String input = sc.nextLine().strip();
			
			long startTime = System.currentTimeMillis();
			
			int debut = 0;
			
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ',') {
					numList.add(Integer.parseInt(input.substring(debut, i)));
					debut = i+1;
				} else if (i == input.length()-1) {
					numList.add(Integer.parseInt(input.substring(debut, i+1)));
				}
			}
			
			for (int i = 0; i < numList.size(); i++) {
				
				sum += numList.get(i);
				
			}
			
			System.out.println("Somme : " + sum);
			
			System.out.println("Temps exécution : "+(System.currentTimeMillis() - startTime) + " ms");
			
		} catch (Exception e) {
			System.out.println("Erreur, réessayez");
		}
		
	}

}