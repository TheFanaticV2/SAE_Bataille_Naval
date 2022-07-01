package BatailleNavale;

import java.util.Scanner;

import Affichage.Grille;

public class PlacerBateau {

	

	public static void placerB(char[][]Joueur, int idJoueur) {

		Scanner sc = new Scanner(System.in);

		int choix=0;


		VariablesConstantes.compteur=0; VariablesConstantes.porteAvions = 0; VariablesConstantes.croiseur=0; VariablesConstantes.contreTorpilleurs=0; VariablesConstantes.sousMarin=0; VariablesConstantes.torpilleur=0;


		System.out.println("Joueur "+ idJoueur +" a toi de placer tes bateau\n");

		Grille.affichageGrille2(Joueur);
		do {
			System.out.println("Saisissez votre choix entre 1 et 5:\n");

			System.out.println("1. Un porte-avions (5 cases)");
			System.out.println("2. Un croiseur (4 cases)");
			System.out.println("3. Un contre-torpilleurs (3 cases)");
			System.out.println("4. Un sous-marin (2 cases)");
			System.out.println("5. Un torpilleur (1 case)");
			choix=Integer.parseInt(sc.nextLine());


			while (choix<1 || choix >5) {
				System.out.println("Choix incorrect : Saisissez votre choix entre 1 et 5");
				choix=Integer.parseInt(sc.nextLine());


			}


			while (choix<1 || choix >5);


			switch(choix) {


			case 1 :

				if (VariablesConstantes.porteAvions == 0){
					CoordonneeBateau.coordonnee(Joueur,5, idJoueur);
					System.out.println(VariablesConstantes.porteAvions);
					VariablesConstantes.compteur++;
					VariablesConstantes.porteAvions++;



				}

				else
				{
					System.out.println("Vous avez deja placer votre porte-avions");

				}
				break;

			case 2 :

				if (VariablesConstantes.croiseur == 0){
					CoordonneeBateau.coordonnee(Joueur,4,idJoueur);
					System.out.println(VariablesConstantes.croiseur);
					VariablesConstantes.compteur++;
					VariablesConstantes.croiseur++;



				}

				else{
					System.out.println("Vous avez deja placer votre croiseur");

				}
				break;

			case 3 : 

				if (VariablesConstantes.contreTorpilleurs == 0){


					CoordonneeBateau.coordonnee(Joueur,3,idJoueur);
					System.out.println(VariablesConstantes.contreTorpilleurs);
					VariablesConstantes.compteur++;
					VariablesConstantes.contreTorpilleurs++;
				}





				else{
					System.out.println("Vous avez deja placer votre contre torpilleurs");


				}
				break;


			case 4 : 

				if (VariablesConstantes.sousMarin == 0){

					CoordonneeBateau.coordonnee(Joueur,2,idJoueur);
					System.out.println(VariablesConstantes.sousMarin);
					VariablesConstantes.compteur++;
					VariablesConstantes.sousMarin++;




				}

				else {
					System.out.println("Vous avez deja placer votre sous-marin");

				}
				break;

			case 5 : 

				if (VariablesConstantes.torpilleur == 0){

					CoordonneeBateau.coordonnee(Joueur,1,idJoueur);
					System.out.println(VariablesConstantes.torpilleur);
					VariablesConstantes.compteur++;
					VariablesConstantes.torpilleur++;
				}



				else {
					System.out.println("Vous avez deja placer votre torpilleur");

				}
				break;



			}
			Grille.affichageGrille2(Joueur);
			System.out.println(VariablesConstantes.compteur);

		}	
		while (choix>=1 && choix<=5 && VariablesConstantes.compteur <=5 && (VariablesConstantes.porteAvions == 0 || VariablesConstantes.croiseur == 0 ||VariablesConstantes.contreTorpilleurs == 0 || VariablesConstantes.sousMarin == 0 || VariablesConstantes.torpilleur == 0));
		System.out.println();




	}


}
