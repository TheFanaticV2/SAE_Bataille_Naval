package BatailleNavale;

import Affichage.Grille;

public class Jeu {


	public static void jeu(){
		
		
		
		VariablesConstantes.grilleJoueur1 = Grille.creationGrille();
		VariablesConstantes.grilleJoueur1SansBateau = Grille.creationGrille();
		VariablesConstantes.grilleJoueur2 = Grille.creationGrille();
		VariablesConstantes.grilleJoueur2SansBateau = Grille.creationGrille();

		PlacerBateau.placerB(VariablesConstantes.grilleJoueur1,VariablesConstantes.IdJoueur1);
		PlacerBateau.placerB(VariablesConstantes.grilleJoueur2,VariablesConstantes.IdJoueur2);
		
		
		System.out.println("Que la guerre commence !\n");
		
		Grille.affichageGrille2(VariablesConstantes.grilleJoueur1);
		Grille.affichageGrille2(VariablesConstantes.grilleJoueur2);


		while (VariablesConstantes.compteurGagnant1!=0 || VariablesConstantes.compteurGagnant2!=0) {
			
			ChoixCase.choixMissile(VariablesConstantes.grilleJoueur1,VariablesConstantes.IdJoueur1);
			ChoixCase.choixMissile(VariablesConstantes.grilleJoueur2,VariablesConstantes.IdJoueur2);
			
		}
		
	


	}
	
	
}
