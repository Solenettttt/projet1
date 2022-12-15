/*
 * nvjeux.java
 * 
 * Copyright 2022 strieu01 <strieu01@SEC-C212-F15>
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


public class nvjeux {
	
	public static void main (String[] args) {
		
		
		System.out.println("Bienvenur au jeux otrio");
	
			
		int JEU [][][] = new int[3][3][3];
		 plateau(JEU);
		
		
	}
		
		
		
		
		
		public static void plateau(int [][][] JEUX) {
		
		
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
	
	        public static int[] enleverPion(int typeDePions, String J1, int[] pion) {
			  
/*pourquoi*/		int[] res = new int [3]; 
	
			while (typeDePions!= 0 && typeDePions!=1 && typeDePions!=2){
		
			System.out.println(J1 + " veuillez selectionner un type de pion parmi:\n"+"p pour petit;\n"+"m pour moyen;\n"+"g pour grand)");

			typeDePions = Lire.i();
			
			}
			
			while (pion[typeDePions]==0){
		
			System.out.println(J1 + " veuillez selectionner un type de pion car vous n'avez plus de ce pions"); 

			typeDePions = Lire.i();
			
			}
			
			pion[typeDePions]=pion[typeDePions]-1;
			
			res = pion;
			
			System.out.println("Les pions qu'il vous reste:");
			
			return res;
				
			}
	
	
		public static void plateaux(int[][][] plateau) {
		
		int rep;

        System.out.println("Menu");

        System.out.println("_________________________________");

        System.out.println("Rentrez le numero de votre choix:\n"+"0) Quitter\n"+"1) jouer 1vs1");

        rep = Lire.i();
        
		if (rep==1){
			
			Lancerpartie1vs1(plateau);
			
		}
		
		}
			
			
			
        public static void Lancerpartie1vs1(int [][][] JEUX) {       
       
       String P1, P2, J1, J2;
       
        int i;
        
        int[] pionsJ1 = new int[3];
        int[] pionsJ2 = new int[3];

        System.out.println("___________________\n"+"Partie 1vs1\n"+"___________________");
        
        System.out.println("Prenom du joueur 1 :");
        J1 = Lire.S();
        
        System.out.println("  \n"+"Par quelle lettre souhaitez vous representer vos pions?");
        P1= Lire.S();

        System.out.println(" \n"+"Prénom du joueur 2 : ");
        J2 = Lire.S();
        
			while (J1 == J2){
			System.out.println(" \n"+"Donnez un autre prenom joueur 2 : ");
			J2 = Lire.S();
			}
        
        System.out.println(" \n"+"Par quelle lettre souhaitez vous representer vos pions?");
        P2= Lire.S();
       
			while (P2 == P1){
			System.out.println(" \n"+"Donnez une autre lettre joueur 2 : ");
			P2 = Lire.S();
			}
       
			
			 pionsJ1= creeVecteurInitial();

			 pionsJ2= creeVecteurInitial();
			 
			 /*tourDeJeu(pionsJoueur1, pionsJoueur2, plateau, Joueur1, Joueur2);*/
	
			}
			
			
			
		public static int[] creeVecteurInitial() {

        int[] res;

        res = new int[3];

        for (int i = 0; i < 3; i++) {               // on parcout tout le vecteur et on met tout les coefs égale à 3

            res[i] = 3;

        }

        return res;

    }
		
			
		public static void tourJoueur1(int[] pionsJ1, int[][][] plateau, String J1) {
	
        int typeDePions=-1;
        int ligne, colonne;
        int [] pion= new int [3];
        
        System.out.println(" Debut du jeu 1vs1:  "+J1+"commence");

        System.out.println(" \n"+J1 + " veuillez selectionner un type de pion:\n"+"0 pour petit;\n"+"1 pour moyen;\n"+"2 pour grand"); 

        typeDePions = Lire.i();
        
        
        pionsJ1=enleverPion( typeDePions, J1, pion);

        System.out.println("Choisissez la ligne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

        ligne = Lire.i();
        

        System.out.println("Choisissez la colonne sur laquelle vous placez votre pion:\n"+"0 pour la première colonne\n"+"1 pour la deuxieme colonne\n"+"2 pour la troisieme colonne\n");

        colonne = Lire.i();
}
      /*  changerCoefMatrice(nLigne, nColonne, valeur, plateau);

        
        
            public static void changerCoefMatrice(int nLigne, int nColonne, int valeur, int[][] plateau) {

        for (int i = 0; i < 3; i++) {               //parcourt les lignes -> si bonne ligne parcourt les colonnes si bonne colonne -> met la valeur

            if (i == nLigne) {

                for (int j = 0; j < 3; j++) {

                    if (j == nColonne) {

                        if (plateau[i][j] != 0) {

                            if ((valeur % 10) > (plateau[i][j] % 10)) {

                                if ((valeur / 10^(valeur%10-1)) == (plateau[i][j] / 10^(valeur%10-1))) {       //plateau[i][j] ->  valeur de la case avant le tour

                                    plateau[i][j] = plateau[i][j] *1000 + valeur;

                                } else{ //if (valeur % 10 > plateau[i][j] % 10) {

                                    plateau[i][j] = valeur;           //-> remplacer l'ancienne valeur de la case par la nouvelle

                                } //else { refaire jouer celui qui a choisi un mauvais emplacement

 

                                //}

                            }

                        } else {

                            plateau[i][j] = plateau[i][j] + valeur;

                        }

                    }

                }

 

            }

        }

    }*/

        
        

			

		/*	 public static int[] definir_emplacement(int indiceTypeDePion, int[] pions) {
				 
				for (int i=0;i<3;i++){
					for (int j = 0; j < 3; j++) { */
				 
       /* pionsJoueur1 = enleverPion(typeDePions, pionsJoueur1);

        System.out.println("Numéro ligne");

        nLigne = Lire.i() - 1;

//            while (nLigne > 2 && nLigne < 0) {

//                System.out.println("Numéro ligne");

//                nLigne = Lire.i() - 1;

//            }

        System.out.println("Numéro colonne");

        int nColonne = Lire.i() - 1;

        changerCoefMatrice(nLigne, nColonne, valeur, plateau);*/

 
			
			
			}

 
        
		
	



