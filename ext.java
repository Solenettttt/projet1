/*
 * ext.java
 * 
 * Copyright 2023 Thuy <Thuy@RICHARD_LENOVO>
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


public class ext {

    /*initialisation et affichage du jeu; structure qui sera utilisée tout au long du code*/
    public static void plateauvide(String[][][] JEUX) {

				System.out.println("___________________________");

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						for (int h = 0; h < 3; h++) {
							JEUX[i][h][j] = "-";
							System.out.print("    " + JEUX[i][h][j] + "    |");

						}
						System.out.println("     ");

					}

					System.out.println("____________________________");
					System.out.println("     ");

				}
				System.out.println(" ");
    }

    /*procédure affichage du jeu qui est utilisée tout au long du code*/
    public static void plateau(String[][][] JEUX, int l, int c, int pion, String pa) {

				JEUX[l][c][pion] = pa;
				System.out.println("***Voici le nouveau plateau de jeu:*** ");
				System.out.println("__________________________ ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						for (int h = 0; h < 3; h++) {

							System.out.print("    " + JEUX[i][h][j] + "    |");

						}
						System.out.println("     ");

					}

					System.out.println("____________________________");
					System.out.println("     ");

				}
				System.out.println(" ");
			}

    /*menu a appeler au lancement d'une partie= fonction demande quelle sorte de partie les joueurs veulent jouer en entrant un chiffre*/
    public static int menu() {

					int rep;

					System.out.println("***Menu***");

					System.out.println("_________________________________");

					System.out.println("***Rentrez le numero de votre choix:***\n" + "0) Quitter \n" + "1) jouer 1vs1 \n" + "2) jouer 1vs1 avec 2 couleurs \n" + "3) jouer à 3 joueurs \n" + "4) jouer à 4 joueurs\n" + "5)jouer contre ordinateur (facile)");

					rep = Lire.i();

					return rep;

	}
	
    //fonction qui traduit le nombre entré pour sélectionner le type de partie en le nombre de joueurs
    public static int nombredejoueurs(int js) {

        int i;

			switch(js){			        /* switch utile pour que cela fonctionne aussi pour 2 joueurs 2 couleurs*/
				case(1):i=2;
				break;
				
				case(2):i=2;
				break;
				
				case(3):i=3;
				break;
				
				case(4):i=4;
				break;
				
				case(5):i=2;
				break;
				
				default: i=0;
				break;
        };

        return i;
    }
    
    public static int nombredecouleurs( int js) {
        int i;
        
          switch(js){					
				case(1):i=2;
				break;
				
				case(2):i=4;
				break;
				
				case(3):i=3;
				break;
				
				case(4):i=4;
				break;
				
				case(5):i=2;
				break;
				
				default: i=0;
				break;
        };
        
        return i;
	}

		// On définit une liste composée des noms de chaque joueurs; la taille de la liste est défini en fonction du nombre de joueur 
    public static void remplissagematricenomjoueur(int i, String[] nom) {
					//liste n'est jamais affiché, seulement utile pour répertorier et prendre le bon nom du joueur acutel
				int diff = 0;				
				for (int j = 0; j < i; j++) {
					int k = j + 1;
					System.out.println("Prenom du joueur  " + k + " :");
					nom[j] = Lire.S();

					if (diff == 1) {
						while (nom[diff - 1].equals(nom[diff])) {
							System.out.println(" \n" + "Donnez un autre prenom joueur " + k + " : ");
							nom[j] = Lire.S();
						}
					}
					if (diff == 2) {
						while ((nom[diff - 1].equals(nom[diff])) || (nom[diff - 2].equals(nom[diff]))) {
							System.out.println(" \n" + "Donnez un autre prenom joueur " + k + " : ");
							nom[j] = Lire.S();
						}
					}
					if (diff == 3) {
						while ((nom[diff - 1].equals(nom[diff])) || (nom[diff - 2].equals(nom[diff])) || (nom[diff - 3].equals(nom[diff]))) {
							System.out.println(" \n" + "Donnez un autre prenom joueur " + k + " : ");
							nom[j] = Lire.S();
						}
					}
					diff++;			//vérifie que les noms choisi sont tous différents entre eux
				}

    }


    /*procédure remplissage de la matrice qui fait le compte des pions des joueurs*/
    public static void remplissagepionJ(int cl, int[][] pionsJ) {
					
					System.out.println("\n ***Voici la matrice qui fait le compte de vos pions:***");

					for (int j = 0; j < 3; j++) {
						for (int h = 0; h < cl; h++) {
							pionsJ[j][h] = 3;
							System.out.print("   " + pionsJ[j][h] + "   |");
						}
						System.out.println("   ");
					}
					System.out.println("   ");
		}


    /*ici cette fonction fonctionne pour tous les joueurs, selection pions*/
    public static int choisirpions(int[][] pionsj, String ja, int JA, int js) {

				int typeDePions = -1;

				if (js == 5 && JA == 1) {
					typeDePions = (int) ((3) * Math.random());
					while (pionsj[typeDePions][JA] == 0) {
						typeDePions = (int) ((3) * Math.random());
					}
				} else {

					System.out.println("******************************** ");
					System.out.println("***C'est au tour de " + ja + " de jouer:***");

					System.out.println(" \n" + "***" + ja + " veuillez selectionner un type de pion:***\n" + "0 pour petit;\n" + "1 pour moyen;\n" + "2 pour grand");

					typeDePions = Lire.i();

					/*ici on vérifie si il es possible de prendre le pions choisi et si il en reste dans la matrice de piosn*/
					while (typeDePions != 0 && typeDePions != 1 && typeDePions != 2) {

						System.out.println(ja + " veuillez selectionner un type de pion parmi:\n" + "0 pour petit;\n" + "1 pour moyen;\n" + "2 pour grand)");

						typeDePions = Lire.i();

					}

					while (pionsj[typeDePions][JA] == 0) {

						System.out.println(ja + " veuillez selectionner un type de pion car vous n'avez plus de ce pions");

						typeDePions = Lire.i();
					}
				}

				return typeDePions;
			}

    /*fonction qui fonctionne pour tous les joueur= selectionne colonne*/
    public static int choisirligne(String ja, int js, int JA) { 

				int ligne;
				if (js == 5 && JA == 1) {
					ligne = (int) ((3) * Math.random());

				} else {

					System.out.println("***" + ja + " choisissez la ligne sur laquelle vous placez votre pion:***\n" + "0 pour la première ligne\n" + "1 pour la deuxieme ligne\n" + "2 pour la troisieme ligne\n");

					ligne = Lire.i();

					while (ligne != 0 && ligne != 1 && ligne != 2) {

						System.out.println(ja + ", l'emplacement que vous avez choisi n'est pas possible");

						System.out.println("Choisissez une ligne sur laquelle vous placez votre pion:\n" + "0 pour la première ligne\n" + "1 pour la deuxieme ligne\n" + "2 pour la troisieme ligne");

						ligne = Lire.i();
					}
				}
				return ligne;
			}

    /*fonction qui fonctionne pour tous les joueurs= selectionne ligne*/
    public static int choisircolonne(String ja, int js, int JA) { //, int js, int JA
				int colonne;

				if (js == 5 && JA == 1) {
					colonne = (int) ((3) * Math.random());
				} else {

					System.out.println("***" + ja + " choisissez la colonne sur laquelle vous placez votre pion:***\n" + "0 pour la première colonne\n" + "1 pour la deuxieme colonne\n" + "2 pour la troisieme colonne\n");

					colonne = Lire.i();

					while (colonne != 0 && colonne != 1 && colonne != 2) {

						System.out.println(ja + ", l'emplacement que vous avez choisi n'est pas possible");

						System.out.println("Choisissez une colonne sur laquelle vous placez votre pion:\n" + "0 pour la première ligne\n" + "1 pour la deuxieme ligne\n" + "2 pour la troisieme ligne\n");

						colonne = (int) Lire.i();
					}
				}
				return colonne;

			}

    /*fonction = vérifier s'il est possible d'utiliser le pion et l'emplacement choisi dans le jeu*/
    public static int possible(String[][][] plateaux, String ja, int ligne, int colonne, int pion) {

				int rep;

				if (plateaux[ligne][colonne][pion] != "-") {
					System.out.println("			*****ATTENTION*****");
					System.out.println(ja + ", l'emplacement que vous avez choisi n'est pas libre. \n" + "Veuillez choisir de nouveau:");
					System.out.println(" 			*******************");
					System.out.println(" ");
					rep = 0;
				} else {
					rep = 1;
				}

				System.out.println(" ");
				return rep;

	}

    /*procédure pour enlever pions de la matrice de pions et afficher nouvelles matrice*/
    public static void enlevepions(int[][] pionsj, int JA, int typeDePions, String[] nom, int cl) {
        
				pionsj[typeDePions][JA] = pionsj[typeDePions][JA] - 1;
				System.out.println("\n***  voici le compte des pions qu'il reste:***");

					for (int j = 0; j < 3; j++) {
						for (int h = 0; h < cl; h++) {

							System.out.print("   " + pionsj[j][h] + "   |");
						}
						System.out.println("   ");
					}
					System.out.println(" ");
		}
				
		//fonction qui définit variable n pour faire le compte du nombre de boucle maximum possible, en fonction du type de partie
		public static int boucle(int js){
					 int n;
					if (js == 1 || js == 5) {	//joueurs n'ont que 9 pions, donc il y a partie nulle quand tous les pions sont pris//
						n = 18;
					}else{
						n = 27;					//partie nulle quand tous les emplacements sur le plate
					}
					return n;
		}
					
            
		public static void main(String[] args) {

            System.out.println("Bienvenue au jeux otrio");
            
        int J = 1;
        while (J == 1) {		//boucle pour rejouer la partie
			
            String JEU[][][] = new String[3][3][3]; /*=plateau de jeu, puisque je defini les pions par des lettre on a des String*/       
            plateauvide(JEU);

            int[][] pionsJ = new int[3][4];            /*=matrice des pions des joueur*/
            String[] nom = new String[4];              /*=liste des noms des joueur*/
            int p = 0;						           /*=compte le nbre de tours de jeu*/
            String Pa = " ";				           /*=pions actuel */
            String Ja = " ";           				   /*=joueur actuel*/
            int nb = -1;							   /*=nombre de joueur*/
            int cl = -1;					   		   /*nombre de couleurs*/


            int Js = menu();							//*Js= le type de partie*/

            nb = nombredejoueurs(Js);            		//* = nombre de joueur, en fonction de menu, variable utile pour la suite*/
            remplissagematricenomjoueur(nb, nom);
			cl = nombredecouleurs(Js);					//* = nombre de couleur, en fonction de menu, variable utile pour la suite*/
            remplissagepionJ(cl, pionsJ);				


			int n= boucle(Js);            // définit le nb de tour max par type de partie (cas d'égalité si pas de conditions de victoire)

            while (p < n && CondVictoire(JEU, Pa, Ja) == false) {	
                int JA = 0; 			///*JA= le joueur actuel en nombre= joueur n1.joueur n2.joueur n°3...; différent de Ja*/

                if (Js == 2) {
                    JA = p % 4;				///*modulo pour definir quel Ja et Ja pour chaque tours pour 1vs1 2 coueleur
                    if (JA == 0) {
                        Ja = nom[0];
                        Pa = "U";
                    } else if (JA == 1) {
                        Ja = nom[1];
                        Pa = "D";
                    } else if (JA == 2) {
                        Ja = nom[0];
                        Pa = "T";
                    } else if (JA == 3) {
                        Ja = nom[1];
                        Pa = "Q";
                    }
                } else {
		          JA = p % nb;	     		///*modulo pour definir quel Ja et Pa pour chaque tours autre que pour 1vs1 2 couleur*/		
                    if (JA == 0) {
                        JA = p % nb;			
                        Ja = nom[0];
                        Pa = "U";
                    } else if (JA == 1) {
                        Ja = nom[1];
                        Pa = "D";
                    } else if (JA == 2) {
                        Ja = nom[2];
                        Pa = "T";
                    } else if (JA == 3) {
                        Ja = nom[3];
                        Pa = "Q";
                    }
                }

                int i = 0;						/*variable pour vérifié la possibilité du mouvement choisi*/
                int C = -1;						/*colonne que je joueur actuel choisi*/
                int L = -1;						/*ligne que je joueur actuel choisi*/
                int pion = -1;                  /*type de pions que je joueur actuel choisi*/

                while (i == 0) {		 //boucle : vérifier si  pions et emplacement choisi est possible; si pas possible le i reste a 0 et la boucle recommence				
                    pion = choisirpions(pionsJ, Ja, JA, Js);
                    L = choisirligne(Ja, Js, JA);
                    C = choisircolonne(Ja, Js, JA);

                    i = possible(JEU, Ja, L, C, pion);
                }

                enlevepions(pionsJ, JA, pion, nom, cl);  /*une fois choisi on peut enlever pion de la matrice pions et ajouter le pions au plateau*/
                plateau(JEU, L, C, pion, Pa);

                p = p + 1;
		}

            System.out.println("Voulez vous refaire une partie?\n" + "0=finir\n" + "1=rejouer");
            J = Lire.i();
        }
    }

    public static boolean CondVictoire(String[][][] plateau, String Pa, String Ja) {
        boolean victoire = false;
        int i, j, k;
        for (k = 0; k < 3; k++) {
            for (i = 0; i < 3; i++) {
               if (plateau[k][0][i] == Pa && plateau[k][1][i] == Pa && plateau[k][2][i] == Pa && plateau[k][0][i] != "O") {    //victoire lignes même taille
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if (plateau[0][k][i] == Pa && plateau[1][k][i] == Pa && plateau[2][k][i] == Pa && plateau[0][k][i] != "O") {       // victoire colonnes même taille
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if (plateau[k][i][0] == Pa && plateau[k][i][1] == Pa && plateau[k][i][2] == Pa && plateau[k][i][0] != "O") {
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;       // victoire sur la même case
	       } else if (plateau[k][0][0] == Pa && plateau[k][1][1] == Pa && plateau[k][2][2] == Pa && plateau[k][i][0] != "O"){
		    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;   // victoire ascendante/descendante sur diagonale 1
	       } else if (plateau[k][0][2] == Pa && plateau[k][1][1] == Pa && plateau[k][2][0] == Pa && plateau[k][i][0] != "O"){
		       System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;   // victoire ascendante/descendante sur diagonale 2  
                } else if ((plateau[0][1][1] == Pa) && ((plateau[0][0][0] == Pa && plateau[0][2][2] == Pa) || (plateau[0][0][2] == Pa && plateau[0][2][0] == Pa))) { // 1ere ligne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[1][1][1] == Pa) && ((plateau[1][0][0] == Pa && plateau[1][2][2] == Pa) || (plateau[1][0][2] == Pa && plateau[1][2][0] == Pa))) { // 2eme ligne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[2][1][1] == Pa) && ((plateau[2][0][0] == Pa && plateau[2][2][2] == Pa) || (plateau[2][0][2] == Pa && plateau[2][2][0] == Pa))) { // 3eme ligne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[1][0][1] == Pa) && ((plateau[0][0][0] == Pa && plateau[2][0][2] == Pa) || (plateau[0][0][2] == Pa && plateau[2][0][0] == Pa))) {  //1ere colonne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[1][1][1] == Pa) && ((plateau[0][1][0] == Pa && plateau[2][1][2] == Pa) || (plateau[0][1][2] == Pa && plateau[2][1][0] == Pa))) { // 2eme colonne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[1][2][1] == Pa) && ((plateau[0][2][0] == Pa && plateau[2][2][2] == Pa) || (plateau[0][2][2] == Pa && plateau[2][2][0] == Pa))) { // 3eme colonne
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                } else if ((plateau[1][1][1] == Pa) && ((plateau[0][0][0] == Pa && plateau[2][2][2] == Pa) || (plateau[0][0][2] == Pa && plateau[2][2][0] == Pa))) { // 1ere diagonale
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;

                } else if ((plateau[1][1][1] == Pa) && ((plateau[0][2][0] == Pa && plateau[2][0][2] == Pa) || (plateau[0][2][2] == Pa && plateau[2][0][0] == Pa))) { // 2eme diagonale
                    System.out.println("*** Bravo ! " + Ja + " a gagné la partie ! ***");
                    victoire = true;
                }

                }

            }

        return victoire;
    }
	
	
// fonction de l'ia intermédiaire.
	
        while (p < n && CondVictoire(JEU, Pa, Ja) == false) {	
                int JA = 0; 
                if (Js == 6) {
                    JA = p % 4;				///*modulo pour definir quel Ja et Ja pour chaque tours pour 1vs1 2 coueleur
                    if (JA == 0) {
                        Ja = nom[0];
		      Je = nom[0]
                        Pa = "U";
			 Pe = "R";   
                    } else if (JA == 1) {
                        Ja = nom[1];
			    Je = nom[1] 
                        Pa = "D";
			     Pe = "R"; 
                    } else if (JA == 2) {
                        Ja = nom[0];
			     Je = nom[2]
                        Pa = "T";
			     Pe = "R"; 
                    } else if (JA == 3) {
                        Ja = nom[1];
			     Je = nom[3]
                        Pa = "Q";
			     Pe = "R"; 
                    }
                } else {
		          JA = p % nb;	     		// "R" est le pion de l'algorithme (non par défaut car il n'est pas modifiable à travers les commandes du menu)		
                    if (JA == 0) {
                        JA = p % nb;			
                        Ja = nom[0];
			     Je = nom[0]
                        Pa = "U";
			     Pe = "R"; 
                    } else if (JA == 1) {
                        Ja = nom[1];
			     Je = nom[1]
                        Pa = "D";
			     Pe = "R"; 
                    } else if (JA == 2) {
                        Ja = nom[2];
			     Je = nom[2]
                        Pa = "T";
			     Pe = "R"; 
                    } else if (JA == 3) {
                        Ja = nom[3];
			     Je = nom[3]
                        Pa = "Q"; 
			     Pe = "R"; 
        } public static int Danger(String[][][] plateau, String Pa, String Ja, String Pe) { 
		
        boolean meilleurcoup = false;
        int i, j, k;
        for (k = 0; k < 3; k++) {
            for (i = 0; i < 3; i++) {
               if (plateau[k][0][i] == Pa && plateau[k][1][i] == Pa && plateau[k][2][i] == Pa && plateau[k][0][i] != "O"){    
	            public static boolean CondVictoire(String[][][] plateau, String Pa, String Ja) {
        boolean victoire = false;
        int i, j, k;
        for (k = 0; k < 3; k++) {
            for (i = 0; i < 3; i++) {
               if (plateau[k][0][i] == Pa && plateau[k][1][i] == Pa && plateau[k][0][i] != "O") {    //victoire lignes même taille
	       plateau[k][2][i] == Pe;
	       if (plateau[k][0][i] == Pa && plateau[k][2][i] == Pa && plateau[k][0][i] != "O") {    //victoire lignes même taille
	       plateau[k][1][i] == Pe;
	        if (plateau[k][2][i] == Pa && plateau[k][0][i] != "O") {    // bloquer lorsque 2 pions adverses de même taille sont alignés sur la même ligne
	       plateau[k][0][i] == Pe;
                    meilleurcoup = true;
		    
                } else if (plateau[1][k][i] == Pa && plateau[2][k][i] == Pa && plateau[0][k][i] != "O") {      
	         plateau[0][k][i] = Pe;
		if (plateau[1][k][i] == Pa && plateau[0][k][i] == Pa && plateau[0][k][i] != "O") {
		 plateau[2][k][i] = Pe;
		if (plateau[0][k][i] == Pa && plateau[2][k][i] == Pa && plateau[0][k][i] != "O") {
		 plateau[1][k][i] = Pe;
		    meilleurcoup = true;   // bloquer lorsque 2 pions adverses de même taille sont alignés sur la même colonne
                 
                } else if (plateau[k][i][1] == Pa && plateau[k][i][2] == Pa && plateau[k][i][0] != "O") {
		 plateau[0][k][i] = Pe;
		if (plateau[0][k][i] == Pa && plateau[2][k][i] == Pa && plateau[0][k][i] != "O") {
		 plateau[1][k][i] = Pe;
		if (plateau[0][k][i] == Pa && plateau[1][k][i] == Pa && plateau[0][k][i] != "O") {
		 plateau[2][k][i] = Pe;
		    meilleurcoup = true;  // bloquer lorsque 2 pions adverses sont sur la même case
		    
                       
                } else if ((plateau[0][1][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][2][0] == Pa)) { // 1ere ligne
                  plateau[0][2][2] = Pe || plateau[0][0][2] = Pe;
	        } else if ((plateau[0][1][1] == Pa) && (plateau[0][2][2] == Pa || plateau[0][0][2] == Pa)) {
		  plateau[0][0][0] = Pe || plateau[0][2][0] = Pe;
		   meilleurcoup = true;
		   
                  } else if ((plateau[2][1][1] == Pa) && (plateau[2][0][0] == Pa || plateau[2][0][2] == Pa)) {  
                 plateau[2][2][2] = Pe; 
		  } else if ((plateau[2][1][1] == Pa) && (plateau[2][0][0] == Pa || plateau[2][0][2] == Pa)) {  
		 plateau[2][2][0] = Pe;
	        } else if ((plateau[2][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[2][0][0] = Pe 
		   } else if ((plateau[2][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[2][0][2] = Pe;
		  meilleurcoup = true;
		    
		  } else if ((plateau[1][0][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][0][2] == Pa)) {  
                 plateau[2][0][2] = Pe;
		  } else if ((plateau[1][0][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][0][2] == Pa)) { 
		 plateau[2][0][0] = Pe;
	       } else if ((plateau[1][0][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][0][2] == Pa)) { 
		  plateau[0][0][0] = Pe;
		  } else if ((plateau[0][1][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][2][0] == Pa)) {
		   plateau[0][0][2] = Pe;
                     meilleurcoup = true;
		     
                   } else if ((plateau[1][1][1] == Pa) && (plateau[0][1][0] == Pa || plateau[0][1][2] == Pa)) {  
                 plateau[2][1][2] = Pe;
		  } else if ((plateau[1][1][1] == Pa) && (plateau[0][1][0] == Pa || plateau[0][1][2] == Pa)) {  
		 plateau[2][1][0] = Pe;
	        } else if ((plateau[1][1][1] == Pa) && (plateau[2][1][2] == Pa || plateau[2][1][0] == Pa)) {
		  plateau[0][1][0] = Pe;
		   } else if ((plateau[1][1][1] == Pa) && (plateau[2][1][2] == Pa || plateau[2][1][0] == Pa)) {
		  plateau[0][1][2] = Pe;
		   meilleurcoup = true;
		   
                        } else if ((plateau[1][2][1] == Pa) && (plateau[0][2][0] == Pa || plateau[0][2][2] == Pa)) {  
                 plateau[2][2][2] = Pe;
		  } else if ((plateau[1][2][1] == Pa) && (plateau[0][2][0] == Pa || plateau[0][2][2] == Pa)) {  
		 plateau[2][2][0] = Pe;
	        } else if ((plateau[1][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[0][2][0] = Pe;
		  } else if ((plateau[1][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[0][2][2] = Pe;
		   meilleurcoup = true;
		   
                 } else if ((plateau[1][1][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][0][2] == Pa)) {  
                 plateau[2][2][2] = Pe;
		  } else if ((plateau[1][1][1] == Pa) && (plateau[0][0][0] == Pa || plateau[0][0][2] == Pa)) {  
		 plateau[2][2][0] = Pe;
	        } else if ((plateau[1][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[0][0][0] = Pe;
		  } else if ((plateau[1][1][1] == Pa) && (plateau[2][2][2] == Pa || plateau[2][2][0] == Pa)) {
		  plateau[0][0][2] = Pe;
		meilleurcoup = true;
		 
		 } else if ((plateau[1][1][1] == Pa) && (plateau[0][2][0] == Pa || plateau[0][2][2] == Pa)) {  
                 plateau[2][0][2] = Pe;
		  } else if ((plateau[1][1][1] == Pa) && (plateau[0][2][0] == Pa || plateau[0][2][2] == Pa)) {  
		 plateau[2][0][0] = Pe;
	        } else if ((plateau[1][1][1] == Pa) && (plateau[2][0][2] == Pa || plateau[2][0][0] == Pa)) {
		  plateau[0][2][0] = Pe;
		   } else if ((plateau[1][1][1] == Pa) && (plateau[2][0][2] == Pa || plateau[2][0][0] == Pa)) {
		  plateau[0][2][2] = Pe;
                meilleurcoup = true;
		}
   
   }
  }
  }
  return meilleurcoup;
  }

