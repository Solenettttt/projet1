 /*
 * jeux.java
 * 
 * Copyright 2022 PC <PC@DESKTOP-FJ8164Q>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class jeux {
	
public static void main (String[] args) {
	/*
	 * menu
	 * JEUX
	 * 
	 * lancejeuxivsi
	 * 
	 * */
	
	
	public static void menu(int[][][] JEUX) {            

        int rep;

        System.out.println("Menu");

        System.out.println("_________________________________");

        System.out.println("Rentrez le numero de votre choix:\n"+"0) Quitter\n"+"1) jouer 1vs1");

      rep = Lire.i();

 
        if (rep == 1) {

            lancerPartie1vs1(JEUX);

        }

    }
    
    
    public static void lancerPartie1vs1(int[][][] JEUX) {

        String J1;
        String J2;
        char P1;
        char P2;
        int nbrJ = 2;
        
        int[] pionsJ1 = new int[3];
        int[] pionsJ2 = new int[3];

        System.out.println("Partie 1vs1");
        
        System.out.println("Prénom du joueur 1 : ");
        J1 = Lire.S();
        
        System.out.println("Par quelle lettre souhaitez vous représenter vos pions?");
        P1= Lire.c();

        System.out.println("Prénom du joueur 2 : ");
        J2 = Lire.S();
        
        System.out.println("Par quelle lettre souhaitez vous représenter vos pions?");
        P2= Lire.S();
       
       
        for (int i=o; i<3; i++){
			
			 pionsJ1 [i] = 3;

			 pionsJ2 [i]=3;
	
			}
        }
        
		public static void matjeux(int[][][] JEUX) {
		 
		System.out.println("Jeux otrio");
	
		for (int i=0;i<3;i++){
			for (int j = 0; j < 3; j++) {  
				for (int h = 0; h < 3; h++) {
					JEUX[i][j][h]=0;
					System.out.print("    "+JEUX[i][j][h]+"    |"); 
					
				}
						System.out.println("     "); 
										
			}
				
				System.out.println("____________________________");
				System.out.println("     "); 
						
				
		}
		
		}	
        
        public static void tourJ1(int[] pionsJ1, int[][] JEUX, String) {//, int typeDePions, int valeur, int nLigne) {

        int valeur;
        int typeDePions = -1;

        System.out.println(joueur1 + " selectionner type de pion:\n"+"p pour petit;\n"+"m pour moyen;\n"+"g pour grand)"); // mettre prenom joueur 1 -> aller chercher joueur 1 dans mathéode lancer partie1vs1

        typeDePions = Lire.i();

        valeur = switch (typeDePions) {

            case p ->

                ;

            case 2 ->

                12;

            default ->
s
                13;

        };

        pionsJoueur1 = enleverPion(typeDePions, pionsJoueur1);

        System.out.println("Numéro ligne");

        nLigne = Lire.i() - 1;

//            while (nLigne > 2 && nLigne < 0) {

//                System.out.println("Numéro ligne");

//                nLigne = Lire.i() - 1;

//            }

        System.out.println("Numéro colonne");

        int nColonne = Lire.i() - 1;

        changerCoefMatrice(nLigne, nColonne, valeur, plateau);

 

    }
        
        
        
        
}}aleur;

        int nLigne = -1;

        int typeDePions = -1;

        System.out.println(joueur1 + " selectionner type de pion:\n"+"1 pour petit;\n"+"2 pour moyen;\n"+"3 pour grand)"); // mettre prenom joueur 1 -> aller chercher joueur 1 dans mathéode lancer partie1vs1

        typeDePions = Lire.i();

        valeur = switch (typeDePions) {

            case 1 :

                11;

            case 2 ->

                12;

            default ->
s
                13;

        };

        pionsJoueur1 = enleverPion(typeDePions, pionsJoueur1);

        System.out.println("Numéro ligne");

        nLigne = Lire.i() - 1;

//            while (nLigne > 2 && nLigne < 0) {

//                System.out.println("Numéro ligne");SS

//                nLigne = Lire.i() - 1;

//            }

        System.out.println("Numéro colonne");

        int nColonne = Lire.i() - 1;

        changerCoefMatrice(nLigne, nColonne, valeur, plateau);

 

    }
        
        
        
        
}}
    /*   pionsJ1 = creeVecteurInitial();

 *       pionsJ2 = creeVecteurInitial();

 *       tourDeJeu(pionsJoueur1, pionsJoueur2, plateau, Joueur1, Joueur2);

    }

	
	
	

   public static void tourJ1(int[] pionsJ1, int[][] JEUX, String J1) {//, int typeDePions, int valeur, int nLigne) {

        int valeur;
        int nLigne;
        int typeDePions;

        System.out.println(joueur1 + " selectionnez le type de pion:"+\n+"= petit, 2 pour moyen, 3 pour grand)"); // mettre prenom joueur 1 -> aller chercher joueur 1 dans mathéode lancer partie1vs1

        typeDePions = Lire.i();

        valeur = switch (typeDePions) {

            case 1 ->

                11;

            case 2 ->

                12;

            default ->

                13;

        };

        pionsJoueur1 = enleverPion(typeDePions, pionsJoueur1);

        System.out.println("Numéro ligne");

        nLigne = Lire.i() - 1;

//            while (nLigne > 2 && nLigne < 0) {

//                System.out.println("Numéro ligne");

//                nLigne = Lire.i() - 1;

//            }

        System.out.println("Numéro colonne");

        int nColonne = Lire.i() - 1;

        changerCoefMatrice(nLigne, nColonne, valeur, plateau);	
}

		/*mat pour chauqe joueur*/
	/*	System.out.print("combiende joueur joue?");
		joueurs=Lire.int();
		
		for (int J=0;J<joueurs;J++){
			
			int matjJ [][] = new int[3][3];
			
			for (int i=0;i<3;i++){
				for (int j = 0; j < 3; j++) {  

					mat[i][j]=1;
				}}}
				
				
				
		while condV=!1:{
			
			
			/*initialiser joueur(pour 2*/
/*			J=0;
			if J%2==0{
				NJ=1}
				else{
					NJ=2}
			Cont=0	
			
/*creer fonctionP*/		

	/*	System.out.print("Quelles pièce siuhaitez vous utiliser?");
		pièce=Lire.char();
		if pièce==G{
				T=2}
				else if pièce==P{
					T=0}
					else{
						T=1}
		for (i=0,i<3;i++){
			/* mat 3x3 pour chaque joueur*/
/*			if matjoueurNJ[T][i]==1{
				Cont=Cont+1}}
				
		if Cont==0{
			/*appeler fonctionP (=boucle a refaire)*/	
			
		/*creer fonction p positoin jeux libre*/
/*		System.out.print("Sur quelle ligne de 0 à 2?");
		L=Lire.int();
		
		System.out.print("Sur quelle  collone de 0 à 2?");
		C=lire.int();
		
		if JEUX [L][C][T]==0{
			JEUX [T][C][L]=X}
			else{
				/*appeler fonction p*/
				
				
	/*		J=J+1;
			
			/*	
				System.out.println("Entrez l'element [%d][%d] : ", i, j)); 
                mat[i][j] = clavier.nextInt(); 
            } 
        } 
        System.out.print("Le resultat de notre programme: \n"); 
        for (int i = 0; i < mat.length; i++) { 
            for (int j = 0; j < mat.length; j++) { 
                System.out.print(mat[i][j] + "\t"); 
            } 
            System.out.println(); }
        } 
        // fermez scanner 
        clavier.close(); */
	


