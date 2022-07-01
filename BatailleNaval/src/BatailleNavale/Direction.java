package BatailleNavale;

import java.util.Scanner;

public class Direction {

	//Connaitre la directions du bateaux avec les argument : la grille du joueur conscerner, les coordonnées X et Y et la taille du bateau
	public static void direction(char[][] joueur, int coordonneY,int coordonneX, int bateauTaille) {

		
		int choix = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dans quelle directions voulez vous posez votre bateau\n"
				+"1.Horizontal vers la droite\n"
				+"2.Vertical vers le bas");

		choix=Integer.parseInt(sc.nextLine());



		switch(choix) {

		//Horizontale
		case 1 :
			int k = bateauTaille-1;

			while(k>=0 && joueur[coordonneX][coordonneY] == '~') {
				joueur[coordonneX][coordonneY] = (char) (54-bateauTaille);
				coordonneY+=1;
				k--;
				System.out.println(coordonneY);
			}
			System.out.println("Désolé un bateau est deja la ");
			

			break;

		//Vertical
		case 2 :

			int k1 = bateauTaille-1;
			while(k1>=0 && joueur[coordonneX][coordonneY] == '~') {
				joueur[coordonneX][coordonneY] = (char) (54-bateauTaille);
				coordonneX+=1;
				k1--;
				System.out.println(coordonneX);
			}

			System.out.println("Désolé un bateau est deja la ");
			break;


		default:
			System.out.println("Erreur");

		}
		



	}

}

