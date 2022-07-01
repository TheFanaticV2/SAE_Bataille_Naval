package BatailleNavale;

import java.util.Scanner;

public class VariablesConstantes {
	
	static int missileSpeciale1=1;
	static int missileSpeciale2=1;
	
	static Scanner sc = new Scanner(System.in);
	
	static int compteur;
	static int porteAvions, croiseur, contreTorpilleurs, sousMarin, torpilleur;
	
	public static char[][] grilleJoueur1;
	public static char[][] grilleJoueur2;

	static char[][] grilleJoueur1SansBateau;
	static char[][] grilleJoueur2SansBateau;
	
	static int IdJoueur1 = 1;
	static int IdJoueur2 = 2;

	public static int compteurGagnant1=5;
	public static int compteurGagnant2=5;
}
