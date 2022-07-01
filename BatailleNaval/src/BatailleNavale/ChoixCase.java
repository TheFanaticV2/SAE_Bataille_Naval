package BatailleNavale;

import java.util.Scanner;

import Affichage.Grille;

public class ChoixCase {

	static Scanner sc = new Scanner(System.in);

	public static void choixMissile (char[][] grilleJoueur,int idJoueur) {

		int choix;

		if (idJoueur==1) {

			if (VariablesConstantes.missileSpeciale1!=0) {
				System.out.println("Joueur " + idJoueur + " quel missile souhaitez vous utiliser ? ");
				System.out.println("1. Missile normale (1 case)");
				System.out.println("2. Missile destructeur (1 ligne ou colonne)");
				System.out.println("3. Missile carré (3 cases)");
				choix = Integer.parseInt(sc.nextLine());

				switch (choix) {	
				case 1:
					choixCase(1,grilleJoueur);
					break;

				case 2:
					choixMissileDestructeur(1,grilleJoueur);
					break;

				case 3:
					choixMissileCarré(1,grilleJoueur);
					break;

				default:
					System.out.println("ERREUR ! Entrée incorrecte !");
					break;
				}
			}
			else
				choixCase(1,grilleJoueur);
		}
		else {
			if (VariablesConstantes.missileSpeciale2!=0) {
				System.out.println("Joueur " + idJoueur + " ,quel missile souhaitez vous utiliser ? ");
				System.out.println("1. Missile normale (1 case)");
				System.out.println("2. Missile destructeur (1 ligne ou colonne)");
				System.out.println("3. Missile carré (3 cases)");
				choix = Integer.parseInt(sc.nextLine());

				switch (choix) {	
				case 1:
					choixCase(2,grilleJoueur);
					break;

				case 2:
					choixMissileDestructeur(2,grilleJoueur);
					break;

				case 3:
					choixMissileCarré(2,grilleJoueur);
					break;

				default:
					System.out.println("ERREUR ! Entrée incorrecte !");
					break;
				}
			}
			else
				choixCase(2,grilleJoueur);
		}


	}

	public static void choixCase (int idJoueur, char[][] grilleJoueur) {

		int caseAttaquee;
		int nombre1=5;
		int nombre2=4;
		int nombre3=3;
		int nombre4=2;
		int nombre5=1;

		String coordonneeXstr;
		int coordonneeY;
		int coordonneeX;

		if (idJoueur==1) {
			Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur2SansBateau);

			System.out.println("Joueur 1 ,choisissez une case a  attaquer : ");

			String coordonnesXetY = sc.nextLine();
			Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur2SansBateau);

			coordonneeX = coordonnesXetY.charAt(1);
			coordonneeY= coordonnesXetY.charAt(0);

			coordonneeY = coordonneeY-65;
			coordonneeX = coordonneeX-48;

			for (int x=0; x<grilleJoueur.length; x++) 
				for (int y=0; y<grilleJoueur[x].length; y++) {

					while (grilleJoueur[coordonneeY][coordonneeX] != '~') {
						if (grilleJoueur[coordonneeY][coordonneeX] == '1'||grilleJoueur[coordonneeY][coordonneeX] == '2' || grilleJoueur[coordonneeY][coordonneeX] == '3'||grilleJoueur[coordonneeY][coordonneeX] == '4'||grilleJoueur[coordonneeY][coordonneeX] == '5' ) {
							System.out.println("Touché !");
							System.out.println("Joueur 1, choisissez une nouvelle fois une case à  attaquer : ");
							VariablesConstantes.grilleJoueur2SansBateau[coordonneeY][coordonneeX] = 'O';

							coordonnesXetY = sc.nextLine();
							Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur2SansBateau);


							coordonneeX = coordonnesXetY.charAt(1);
							coordonneeY= coordonnesXetY.charAt(0);

							coordonneeY = coordonneeY-65;
							coordonneeX = coordonneeX-48;	
						}
						else {
							System.out.println("Touché coulé !");
							VariablesConstantes.compteurGagnant1 -= 1;
							if (VariablesConstantes.compteurGagnant1==0)
								Gagnant.gagnant(idJoueur);
							else {
								System.out.println("Joueur 1, choisissez une nouvelle fois une case à  attaquer : ");
								coordonnesXetY = sc.nextLine();
								Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur2SansBateau);

								coordonneeX = coordonnesXetY.charAt(1);
								coordonneeY= coordonnesXetY.charAt(0);

								coordonneeY = coordonneeY-65;
								coordonneeX = coordonneeX-48;
							}
						}
					}

				}
			if (grilleJoueur[coordonneeY][coordonneeX]=='~')
				VariablesConstantes.grilleJoueur2SansBateau[coordonneeY][coordonneeX] = 'X';
				System.out.println("Raté !");
		}

		else if(idJoueur==2) {
			Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur1SansBateau);
			System.out.println("Joueur 2 , choisissez une case à  attaquer : ");
			String coordonnesXetY = sc.nextLine();
			Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur1SansBateau);

			coordonneeX = coordonnesXetY.charAt(1);
			coordonneeY= coordonnesXetY.charAt(0);

			coordonneeY = coordonneeY-65;
			coordonneeX = coordonneeX-48;	

			for (int x=0; x<grilleJoueur.length; x++) 
				for (int y=0; y<grilleJoueur[x].length; y++) {

					while (grilleJoueur[coordonneeY][coordonneeX]!='~') {
						if (nombre1!=0 || nombre2!=0 || nombre3!=0 || nombre4!=0 || nombre5!=0) {
							System.out.println("Touché !");
							System.out.println("Joueur 2, choisissez une nouvelle fois une case à  attaquer : ");
							VariablesConstantes.grilleJoueur1SansBateau[coordonneeY][coordonneeX] = 'O';

							coordonnesXetY = sc.nextLine();
							Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur1SansBateau);

							coordonneeX = coordonnesXetY.charAt(1);
							coordonneeY= coordonnesXetY.charAt(0);

							coordonneeY = coordonneeY-65;
							coordonneeX = coordonneeX-48;
						}
						else {
							System.out.println("Touché coulé !");
							VariablesConstantes.compteurGagnant2 -= 1;
							if (VariablesConstantes.compteurGagnant2==0)
								Gagnant.gagnant(idJoueur);
							else {
								System.out.println("Joueur 2, choisissez une nouvelle fois une case à  attaquer : ");
								coordonnesXetY = sc.nextLine();
								Grille.affichageGrille(grilleJoueur, VariablesConstantes.grilleJoueur1SansBateau);

								coordonneeX = coordonnesXetY.charAt(1);
								coordonneeY= coordonnesXetY.charAt(0);

								coordonneeY = coordonneeY-65;
								coordonneeX = coordonneeX-48;	
							}
						}
						if (grilleJoueur[coordonneeY][coordonneeX]=='~')
							VariablesConstantes.grilleJoueur1SansBateau[coordonneeY][coordonneeX] = 'X';
							System.out.println("Raté !");
					}
				}
		}

	}





	public static void choixMissileDestructeur (int idJoueur, char[][] grilleJoueur) {

		int choixLigneOuColonne;

		System.out.print("Joueur 1, voulez-vous détruire une ligne ou une colonne (1 pour ligne, 2 pour colonne)? ");
		choixLigneOuColonne = Integer.parseInt(sc.nextLine());

		switch (choixLigneOuColonne) {
		case '1':
			int ligne;
			System.out.print("Quelle est la ligne que vous voulez détruire : ");
			ligne = Integer.parseInt(sc.nextLine());

			switch (ligne) {
			case '0':
				for (int x=0; x<10; x++)
					break;

			case '1' : 
				for (int x=0; x<10; x++)
					break;

			case '2':
				for (int x=0; x<10; x++)
					break;

			case '3':
				for (int x=0; x<10; x++)
					break;

			case '4':
				for (int x=0; x<10; x++)
					break;

			case '5':
				for (int x=0; x<10; x++)
					break;

			case '6':
				for (int x=0; x<10; x++)
					break;

			case '7':
				for (int x=0; x<10; x++)
					break;

			case '8':
				for (int x=0; x<10; x++)
					break;

			case '9':
				for (int x=0; x<10; x++)
					break;

			default:
				System.out.println("ERREUR ! Entrée incorrecte !");
				break;
			}

			break;

		case '2':
			int colonne;
			System.out.print("Quelle est la colonne que vous voulez détruire : ");
			colonne = Integer.parseInt(sc.nextLine());

			switch (colonne) {
			case 'A':
				for (int y=0; y<10; y++)
					break;

			case 'B' : 
				for (int y=0; y<10; y++)
					break;

			case 'C':
				for (int y=0; y<10; y++)
					break;

			case 'D':
				for (int y=0; y<10; y++)
					break;

			case 'E':
				for (int y=0; y<10; y++)
					break;

			case 'F':
				for (int y=0; y<10; y++)
					break;

			case 'G':
				for (int y=0; y<10; y++)
					break;

			case 'H':
				for (int y=0; y<10; y++)
					break;

			case 'I':
				for (int y=0; y<10; y++)
					break;

			case 'J':
				for (int y=0; y<10; y++)
					break;

			default:
				System.out.println("ERREUR ! Entrée incorrecte !");
				break;
			}
		default:
			System.out.println("ERREUR ! Entrée incorrecte !");
			break;

		}

		if (idJoueur==1)
			VariablesConstantes.missileSpeciale1 -=1;
		else 
			VariablesConstantes.missileSpeciale2 -=1;
	}


	public static void choixMissileCarré (int idJoueur, char[][] grilleJoueur) {

		int choixCaseCentral;

		System.out.print("Joueur 1, choisissez la case centrale sur lequel le missile va s'écraser : ");
		choixCaseCentral = Integer.parseInt(sc.nextLine());


		if (idJoueur==1)
			VariablesConstantes.missileSpeciale1 -=1;
		else 
			VariablesConstantes.missileSpeciale2 -=1;
	}

}


