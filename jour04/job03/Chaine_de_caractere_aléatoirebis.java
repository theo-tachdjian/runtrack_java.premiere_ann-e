import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Main {
	
	static synchronized void fillArray(char[][] chars, int index, Random r) {
		for (int i = 0; i<chars[index].length; i++) {
			chars[index][i] = (char) r.nextInt(48, 126);
		}
	}
	
	static void save(char[][] chaine, int taille) {
		File file = new File("output.txt");
		
		try {
			file.createNewFile();
			if (file.exists()) {
				FileOutputStream out = new FileOutputStream(file, false);
				if (taille == 1) {
					out.write(chaine[0][0]);
				} else {
					for (int j = 0; j < chaine.length; j++) {
						for (int i = 0; i < chaine[j].length - ((taille % 2 == 0) ? 0 : 1); i++) {
							out.write(chaine[j][i]);
						}
					}
				}
				
				out.close();
			} else {
				System.out.println("Le fichier n'existe pas");
			}
		} catch (IOException e) {
			System.out.println("Une erreur est survenue " + file.getPath());
		}
	}

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quelle est la taille de votre chaine de caractere : ");
		
		try {
			
			char[][] chaine;
			
			int taille = sc.nextInt();
			
			
			long startTime = System.currentTimeMillis();
			
			if (taille > 1) {
				
				chaine = new char[2][taille/2];
				
				Thread t1 = new Thread(() -> fillArray(chaine, 0, r));
				Thread t2 = new Thread(() -> fillArray(chaine, 1, r));
				
				t1.start();
				t2.start();
				
				while (t1.works() || t2.works()) {}
				
				save(chaine, taille);
				
			} else if(taille == 1) {
				
				chaine = new char[1][1];
				
				fillArray(chaine, 0, r);
				save(chaine, taille);
				
			} else {
				System.out.println("Veuillez entrer un nombre plus long");
				System.exit(0);
			}
			
			System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			
		} catch (Exception e) {
			System.out.println("Entrée est invalide, veuillez réessayer.");
		}
		
	}

}