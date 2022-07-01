package BatailleNavale;

import java.util.Scanner;

import Affichage.Grille;

public class CoordonneeBateau {


	//creation de la methode coordonne qui prend en argument la grille du joueur conscerner, la taille du bateau et l'identifiant du joueur 
	public static void coordonnee(char[][] grilleJoueur,int bateauTaille, int idJoueur){

		String coordonneeXstr;
		int coordonneeY;
		int coordonneeX;


		Scanner sc = new Scanner(System.in);

		//demande de coordonnées pour le bateau  
		System.out.println("Joueur "+ idJoueur +" : Quels sont les coordonnee auquel vous voulez posez votre bateau ? (Une lettre en majusscule suivie d'un chiffre entre 0 et 9) " ); 

		String coordonnesXetY = sc.nextLine();
		Grille.affichageGrille2(grilleJoueur);


		coordonneeX = coordonnesXetY.charAt(1);
		coordonneeY= coordonnesXetY.charAt(0);

		coordonneeY = coordonneeY-65;
		coordonneeX = coordonneeX-48;
		
		System.out.println(coordonneeY);
		System.out.println(coordonneeX);
		
		
		
		//saisie forcé de bonne coordonnées
		while(coordonneeY < 0 || coordonneeY > 9 &&  coordonnesXetY.length() == 2) {
			System.out.println("Erreur les coordonnées ne sont pas bonnes");


			System.out.println("Joueur "+ idJoueur +" : Quels sont les coordonnee auquel vous voulez posez votre bateau ? " ); 

			coordonnesXetY = sc.nextLine();
			
			Grille.affichageGrille2(grilleJoueur);
			
			coordonneeX = coordonnesXetY.charAt(1);
			coordonneeY= coordonnesXetY.charAt(0);
			
			coordonneeY = coordonneeY-65;
			coordonneeX = coordonneeX-48;


			System.out.println(coordonneeY);
			System.out.println(coordonneeX);


		}


		Direction.direction(grilleJoueur, coordonneeY, coordonneeX, bateauTaille);
		
	}


}
