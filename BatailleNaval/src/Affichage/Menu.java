package Affichage;

import java.util.Scanner;

import BatailleNavale.Jeu;

public class Menu {

	public static void MenuBatailleNaval(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choix;



		do {
			System.out.println("1. Jouer");
			System.out.println("2. Regles du jeu");
			System.out.println("3. Quitter\n");

			System.out.println("Saisissez votre choix entre 1 et 3:\n");
			choix = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch(choix) {

			case 1 :

				Jeu.jeu();

				break;

			case 2 :
				System.out.println("2.-----------Regles de la Bataille Navale-----------\n\n");
				System.out.println("La bataille navale oppose deux joueurs.\n\n" 
						+"1. Chaque joueur dispose de deux grilles carrées de côté 10, dont les lignes sont numérotées de 0 à 9, \nles colonnes, de A à J, ainsi que d'une flotte composée de quelques bateaux d'un à cinq cases de long.\n\n" 
                        +"2. Au début du jeu, chaque joueur place ses bateaux sur sa grille, en s'assurant que deux bateaux différents ne soient pas collés.\nL'une des grilles représente la zone contenant sa propre flotte. \nL'autre représente la zone adverse, où il cherchera à couler les bateaux de son adversaire.\n\n" 
						+"3. Chaque joueur, a  son tour, ecrit une case (par exemple \"J2\"), si un bateau est touche, un rond est affiche\net le message \"Touche\" apparait, sinon une croix et \"Rate\".\n\n"
						+"4. De nouveaux missiles sont ajoutés, il ne peut y avoir qu'une seule utilisation d'un seul missile spécial au choix.\nLe premier pourra toucher les cases sur toute une ligne, à la verticale ou horizontale, mais pas les deux.\nLe dernier missile, touche les cases sous la forme d'un carré de 3 cases de large avec la case choisie comme épicentre de l'explosion.\n\n"
                		+"5. Le gagnant sera celui qui aura détruit tout les bateaux de son adversaire en premier!\n");


			case 3 : 
				System.out.println("Au revoir :)" );
				break;

			default:
				System.out.println("ERREUR ! Entree incorrecte !");
				break;
			}
		}
		while (choix!= 3);


		sc.close();
	}

}
