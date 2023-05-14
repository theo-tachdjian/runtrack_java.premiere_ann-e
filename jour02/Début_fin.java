class Main {
	
	public static void main(String[] args) {
		
		final int REF = 1234;
		
		int premierChiffre = 0;
		
		int exposant = 1;
		
		while (REF / exposant > 10) {
			
			exposant *= 10;
			
		}
		premierChiffre = REF / exposant;
		
		System.out.println("Premier chiffre: "+premierChiffre);
		System.out.println("Dernier chiffre: "+REF%10);
		
	}
	
}