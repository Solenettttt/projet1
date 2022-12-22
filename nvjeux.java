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
 */


public class nvjeux {
	
							
		
		/*initialisation et affichage du jeu à utilisé tout au long du code*/
		public static void plateauvide(String [][][] JEUX) {
		
		
		for (int i=0;i<3;i++){
			for (int j = 0; j < 3; j++) {  
				for (int h = 0; h < 3; h++) {
					JEUX[i][j][h]="O";
					System.out.print("    "+JEUX[i][j][h]+"    |"); 
					
				}
						System.out.println("     "); 
										
			}
				
				System.out.println("____________________________");
				System.out.println("     "); 
						
		}
	}
	
	/*affichage du jeu à utilisé tout au long du code*/
		public static void plateau(String [][][] JEUX) {
		
		
		for (int i=0;i<3;i++){
			for (int j = 0; j < 3; j++) {  
				for (int h = 0; h < 3; h++) {

					System.out.print("    "+JEUX[i][j][h]+"    |"); 
					
				}
						System.out.println("     "); 
										
			}
				
				System.out.println("____________________________");
				System.out.println("     "); 
						
		}
	}
	
	

	
		/*menu a appeler une fois au debut de la partie=demande quelle sorte de partie les joueurs veulent jouer*/
		public static int menu () {
	
		int rep;
		
        System.out.println("Menu");

        System.out.println("_________________________________");

        System.out.println("Rentrez le numero de votre choix:\n"+"0) Quitter\n"+"1) jouer 1vs1"+"2) jouer 1vs1 avec 2 couleurs"+"3)jouer à 3 joueurs"+"4)jouer à 4 joueurs");

        rep = Lire.i();
        
        return rep;
        

		
		}
			
			
			/*initialisation des joueurs et leurs pions*/
        public static void Lancerpartie1vs1( String J1, String j2, String p1, String p2, int js ) {       
       
       //ici j1 j2 ont ils besoin d'etre les meme quenjai utlisé pour appeler la fonction dnas le amin? ya til une difference
        /*int i;*/
        
    
        System.out.println("___________________\n"+"Partie 1vs1\n"+"___________________");
        
        System.out.println("Prenom du joueur 1 :");
        J1 = Lire.S();
        
        System.out.println("  \n"+"Par quelle lettre souhaitez vous representer vos pions?");
        p1= Lire.S();

        System.out.println(" \n"+"Prénom du joueur 2 : ");
        j2 = Lire.S();
        
			while (J1 == j2){
			System.out.println(" \n"+"Donnez un autre prenom joueur 2 : ");
			j2 = Lire.S();
			}
        
        System.out.println(" \n"+"Par quelle lettre souhaitez vous representer vos pions?");
        p2= Lire.S();
       
			while (p2 == p1){
			System.out.println(" \n"+"Donnez une autre lettre joueur 2 : ");
			p2 = Lire.S();
			}
       			}
       			
       			
		
		/*remplissage matrice pions des joueurs*/
		public static void remplissagepionJ ( int js, int [][]pionsJ){
			
			int[][] pions = new int[4][3];
			int i;
			
			switch(js){					/*si js egale 0 rien ne se passe*/
				case(1):i=2;
				break;
				
				case(2):i=2;/* switch car pour que cela fonctionne aussi pour 2 joueurs 2 couleurs*/
				break;
				
				case(3):i=3;
				break;
				
				case(4):i=4;
				break;}
				
				for (int j=0; j<3;j++){
					for (int h=0; h<i; h++){
						pionsJ[h][j] = 3;
						System.out.println(pionsJ[j][h]);
						}
					}
				
				//return pions;
			}
			
			
		/*à ne plus faire	
		*	 pionsJ1= creeVecteurInitial();

		*	 pionsJ2= creeVecteurInitial();*/
			 
	
		/*changement d'idée on ne fait plus un vecteur par joueur mais un matrice qui reunie tout les pions=faciliter la vérification et création des pions pour chaque joueurs
		*public static int[] creeVecteurInitial() {

        *int[] res;

        *res = new int[3];

        *for (int i = 0; i < 3; i++) {               // on parcout tout le vecteur et on met tout les coefs égale à 3

         *   res[i] = 3;

        *}

        *return res;

}
    */
			
        
       
        
			
			/*ici cette fonction fonctionne pour tous les joueur, selection pions*/
		public static int choisirpions( int[][] pionsj, int js, String ja, int JA) {
	
        int typeDePions=-1;
        
        System.out.println(" C'est au tour de "+ja+" de jouer:");

        System.out.println(" \n"+ ja + " veuillez selectionner un type de pion:\n"+"0 pour petit;\n"+"1 pour moyen;\n"+"2 pour grand"); 

        typeDePions = Lire.i();
        
    		/*ici on vérifie si il es possible de prendre le pions choisi et si il en reste dans la matrice de piosn*/
			while (typeDePions!= 0 || typeDePions!=1 || typeDePions!=2){
		
			System.out.println(ja + " veuillez selectionner un type de pion parmi:\n"+"p pour petit;\n"+"m pour moyen;\n"+"g pour grand)");

			typeDePions = Lire.i();
			
			}
			
			while (pionsj[typeDePions][JA]==0){
		
			System.out.println(ja + " veuillez selectionner un type de pion car vous n'avez plus de ce pions"); 

			typeDePions = Lire.i();
			}
			return typeDePions;
			}
			
		
        
        
        /*ici cette fonction fonctionne pour tous les joueur, selectionne colonne*/
		public static int choisirligne( String ja) {
			
			
		int ligne;

        System.out.println(ja+" choisissez la ligne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

        ligne = Lire.i();
        
        
        while (ligne!=0 || ligne!=1 || ligne!=2){
			
			System.out.println(ja+", l'emplacement que vous avez choisi n'est pas possible");
			
			System.out.println("Choisissez une ligne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

        ligne = Lire.i();
	}
        return ligne;
	}
	
	
        
                /*ici cette fonction fonctionne pour tous les joueur, selecgionne ligne*/
		public static int choisircolonne( String ja) {
		int  colonne;
		
        System.out.println(ja+" choisissez la colonne sur laquelle vous placez votre pion:\n"+"0 pour la première colonne\n"+"1 pour la deuxieme colonne\n"+"2 pour la troisieme colonne\n");

        colonne = Lire.i();
        
        while (colonne!=0 || colonne!=1 || colonne!=2){
			
			System.out.println(ja+", l'emplacement que vous avez choisi n'est pas possible");
			
			System.out.println("Choisissez une colonne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

        colonne = (int)Lire.i();
    	}    
        return colonne;

		}
        
        	/*ici on vérifier si il est possible d'utiliser le pion et lemplacent choisi dans le jeu*/
			public static int possible(String[][][] plateaux, String ja, int colonne,  int ligne, int pion) {
			
			int rep;
	
			if(plateaux[ligne][colonne][pion]!="O"){
				
				System.out.println(ja+", l'emplacement que vous avez choisi n'est pas libre. n/"+" Veuillez choisir de nouveau");
				
				rep=0;
			}else{
			 rep = 1;
			 }
		return rep;
		
		}
	
        
			
			
			/*pour enlever pions de la matrice de pions*/
			public static int[][] enlevepions(String ja, int JA, int typeDePions){
				
			int[][] pionsj = new int[4][3];
			
			pionsj[typeDePions][JA]=pionsj[typeDePions][JA]-1;
		
			System.out.println(ja+"voici les pions qu'il vous reste:");
			/*jsp si utile ou faisable*/
			
			return pionsj;
			}
	
		
        

 
			
		public static void main (String[] args) {
		
		
		System.out.println("Bienvenue au jeux otrio");
	
			
		String JEU [][][] = new String [3][3][3];	/*plateau de jeu, puisque je defini les pions par des lettre on a des String*/
		 plateauvide(JEU);
		 
		int[][] pionsJ = new int[4][3];		/*matrice des pions des joueru*/
		int p=0;  					/*compte de tours de jeu par joueur*/
		String Pa, Ja;				/*pions= actuel et joueur acteul*/
		int C, L, pion;				/*colonne ligne et type de pions que je joueur actuel choisi*/
		
		String J1, J2; 		/*ici le nom des joueur*/
		String P1, P2;		/*le nom de leurs pions*/
			
		/*on ne peut placer que 27 pions de=ans le plateau*/    	/*à ajouter les conditions de victoire ici avec un while*/
		while (p<28){
			
			
			int Js=menu();		/*Js=joueurs;, utilisé d'abord pour le type de partie puis pour le nombre de joueurs*/
			
			/* en fonction de menu, on defini le type de jeu qu'on joue et met en place les variables qu'on va utiliser*/
			if (Js==1){
			Js=2;		 /*ici le nombre de joueurs*/
			
			/*on defini nom et pions avec cette procedure*/
			Lancerpartie1vs1( J1, J2, P1, P2, Js );
			
				J1 = " ";
				J2 = " ";
				P1 = " ";
				P2 = " ";

			}
		/*apres avoir définit les joueur on peut commencer par remplir la matrice de pions*/
		remplissagepionJ ( Js, pionsJ);
		
		
		/*module pour definir quel joueur joue pour chaque tours(pour 1vs1)*/
		int JA=p%Js; 		/*JA pour le joueur actuel en nombre= joueur n1.joueur n2.joueur n°3... et Ja est le nom en caractere du joueur actuel*/
		if (JA==0){			
				Ja=J1;
				Pa=P1;
				}
				else{
					Ja=J2;
					Pa=P2;
					}
					
				/* ce while est pour continuer de demander de choisir un emplacement tant que la place et le pions choisi ne sont pas disponible*/
					int i=0;
				while (i==0){	
				pion=choisirpions( pionsJ, Js, Ja, JA);
				C=choisircolonne( Ja);
				L=choisirligne( Ja);
				i=possible(JEU,Ja, C, L , pion);
			
			}
			
			
			/*une fois choisi on peut l'enlever de la matrice pions et ajouter le pions au plateau*/
				pionsJ=enlevepions(Ja, JA, pion);
				
				
				JEU[L][C][pion]=Pa;
			
			
			p=p+1;
			
			}
	}}
		
