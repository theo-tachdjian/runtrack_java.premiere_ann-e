class Main {
	
	public static void main(String[] args) {
		
		int[][] tableau = {{5,9,3},{7,2,8},{1,6,4}};
		
		int[] tableau_en_ligne = new int[tableau.length*tableau[0].length];
	
		for (int i = 0; i < tableau.length; i++) {
			
			for (int j = 0; j < tableau[i].length; j++) {
				
				tableau-en-ligne[(i*tableau[i].length) + j] = tableau[i][j];
				
			}
			
		}
		
		while(!checkTri(tableau_en_ligne)) {
			
			for (int i = 0; i < tableau_en_ligne.length-1; i++) {
				
				if (tableau_en_ligne[i] > tableau_en_ligne[i+1]) {
					int temp = tableau_en_ligne[i];
					tableau_en_ligne[i] = tableau_en_ligne[i+1];
					tableau_en_ligne[i+1] = temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < tableau_en_ligne.length; i++) {
			tableau[i/tableau[0].length][i%tableau[0].length] = tableau_en_ligne[i];
		}
		
		for (int i = 0; i<tableau.length; i++) {
			System.out.println("Colone "+i+" :");
			for (int j = 0; j<tableau[i].length; j++) {
				
				System.out.println(tableau[i][j]);
				
			}
			
		}
		
	}
	
	static boolean checkTri(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
	
}