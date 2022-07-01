package Affichage;

public class Grille {



//Cree un tableau a 2 dimension de 10 par 10
	public static char[][] creationGrille() {
		char[][] grille = new char[10][10];

		for (int i = 0; i < grille.length; i++)
			for (int j = 0; j < grille[i].length; j++)
				grille[i][j] = '~';

		return grille;
	}



//Affiche 2 grille a 2 dimension 
	public static void affichageGrille(char[][] grillePerso, char[][] grilleAdvers) {

		System.out.println();

		for(int i = 0; i < 45; i++)
			System.out.print("—");
		System.out.print("\t\t\t\t\t\t");
		for(int i = 0; i < 45; i++)
			System.out.print("—");
		// affichage lettre
		char lettre;
		System.out.println();
		System.out.print("|   | ");
		for(lettre = 'A'; lettre <= 'J'; lettre++)
			System.out.print(lettre + " | ");

		System.out.print("\t\t\t\t\t\t");
		System.out.print("|   | ");
		for(lettre = 'A'; lettre <= 'J'; lettre++)
			System.out.print(lettre + " | ");

		System.out.println(); System.out.print("|");
		for (int j = 0; j <= grillePerso[0].length; j++)
			System.out.print("———|");


		System.out.print("\t\t\t\t\t\t");System.out.print("|");
		for (int j = 0; j <= grillePerso[0].length; j++)
			System.out.print("———|");

		//affichage tableau
		for (int i = 0; i < grillePerso.length; i++) {
			//grille perso
			if (i != grillePerso.length - 1) {
				System.out.print("\n| " + (i) + " | ");
			}
			else {
				System.out.print("\n| " + (i) + " | ");
			}
			for (int j = 0; j < grillePerso[i].length; j++)
				System.out.print(grillePerso[i][j]+ " | ");



			//grille adverse
			if (i != grillePerso.length - 1) {
				System.out.print("\t\t\t\t\t\t");
				System.out.print("| " + (i + 1) + " | ");
			}
			else {
				System.out.print("\t\t\t\t\t\t");
				System.out.print("| " + (i) + " | ");
			}
			for (int j = 0; j < grilleAdvers[i].length; j++) {
				System.out.print(grilleAdvers[i][j] + " | ");
			}


			//affichage ligne horizontale
			if (i != grillePerso.length - 1) {
				System.out.println();
				System.out.print("|");
				for (int j = 0; j <= grillePerso[i].length; j++)
					System.out.print("———|");
			}

			if (i != grillePerso.length - 1) {
				System.out.print("\t\t\t\t\t\t");
				System.out.print("|");
				for (int j = 0; j <= grilleAdvers[i].length; j++) {
					System.out.print("———|");
				}
			}
		}
		System.out.println();
		for (int j = 0; j < 45; j++)
			System.out.print("—");
		System.out.print("\t\t\t\t\t\t");
		for (int j = 0; j < 45; j++)
			System.out.print("—");
		System.out.println("\n");
	}



	public static void affichageGrille2(char[][] grillePerso) {

		System.out.println();

		for(int i = 0; i < 45; i++)
			System.out.print("—");

		// affichage lettre
		char lettre;
		System.out.println();
		System.out.print("|   | ");
		for(lettre = 'A'; lettre <= 'J'; lettre++)
			System.out.print(lettre + " | ");

		System.out.println(); System.out.print("|");
		for (int j = 0; j <= grillePerso[0].length; j++)
			System.out.print("———|");


		//affichage tableau
		for (int i = 0; i < grillePerso.length; i++) {
			//grille perso

			System.out.print("\n| " + (i) + " | ");

			for (int j = 0; j < grillePerso[i].length; j++)
				System.out.print(grillePerso[i][j]+ " | ");


			//affichage ligne horizontale
			if (i != grillePerso.length - 1) {
				System.out.println();
				System.out.print("|");
				for (int j = 0; j <= grillePerso[i].length; j++)
					System.out.print("———|");
			}


		}
		System.out.println();
		for (int j = 0; j < 45; j++)
			System.out.print("—");
		System.out.println("\n");
	}
}