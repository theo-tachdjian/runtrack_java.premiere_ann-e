class Facture {
	
	public static void main(String[] args) {
        
		// On déclare les variables prix et quantité
		double prix = 49.99;
		int quantite = 3;

		// On déclare les variables tarifHT et tva d'apres les variables prix et quantité
		double tarifHT = prix * quantite;
		double tva = tarifHT * 0.20;

		// On déclare la variable tarifTTC d'apres les variables tarifHT et tva
		double tarifTTC = tarifHT + tva;

		// Permet d'affiche dans le terminal chacune des valeurs avec une phrase explicative
		System.out.println("Le montant total est : " + tarifHT);
		System.out.println("Le montant de la taxe est : "+tva);
		System.out.println("Le montant total à payer est : "+tarifTTC);
		
	}
	
}