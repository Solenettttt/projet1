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


public class nvjeux2 {
	
							
		
		/*initialisation et affichage du jeu à utilisé tout au long du code*/
		public static void plateauvide(String [][][] JEUX) {
		
		System.out.println("___________________________");
		
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
		System.out.println(" ");
	}
	
	/*affichage du jeu à utilisé tout au long du code*/
		public static void plateau(String [][][] JEUX,int l, int c, int pion, String pa) {
		
		JEUX[l][pion][c]=pa;
		System.out.println("***Voici le nouveau plateau de jeu:*** ");
		System.out.println("__________________________ ");
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
		System.out.println(" ");
	}
	
	

	
		/*menu a appeler une fois au debut de la partie=demande quelle sorte de partie les joueurs veulent jouer*/
		public static int menu () {
	
		int rep;
		
		System.out.println("***Menu***");

		System.out.println("_________________________________");

		System.out.println("***Rentrez le numero de votre choix:***\n"+"0) Quitter \n"+"1) jouer 1vs1 \n"+"2) jouer 1vs1 avec 2 couleurs \n"+"3) jouer à 3 joueurs \n"+"4) jouer à 4 joueurs");

		rep = Lire.i();
		
		return rep;
	   
		}
		
		
		public static void remplissagematricenomjoueur ( int i, String []nom){
			

					////////////// On définit une liste composée des noms de chaque joueurs
			int diff=0;
			for (int j=0;j<i;j++){
				int k=j+1;
			System.out.println("Prenom du joueur  "+k+" :");
			nom[j] = Lire.S();
			
			if (diff==1){
				while (nom[diff-1].equals(nom[diff])){			
				System.out.println(" \n"+"Donnez un autre prenom joueur "+k+" : ");
				nom[j] = Lire.S();
				}
			}
			if (diff==2){
				while ((nom[diff-1].equals(nom[diff])) || (nom[diff-2].equals(nom[diff]))){			
				System.out.println(" \n"+"Donnez un autre prenom joueur "+k+" : ");
				nom[j] = Lire.S();
				}
			}
			if (diff==3){
				while ((nom[diff-1].equals(nom[diff])) || (nom[diff-2].equals(nom[diff])) || (nom[diff-3].equals(nom[diff]))){			
				System.out.println(" \n"+"Donnez un autre prenom joueur "+k+" : ");
				nom[j] = Lire.S();
				}
			}
			diff++;
		}
		
			}
		
			
				
			public static int nombredejoueurs ( int js){
			
			
			int i;
			
			switch(js){					
				case(1):i=2;
				break;
				
				case(2):i=2;/* switch car pour que cela fonctionne aussi pour 2 joueurs 2 couleurs*/
				break;
				
				case(3):i=3;
				break;
				
				case(4):i=4;
				break;
				
				default: i=0;
				break;
				}
				return i;
			}
		
		
		
		/*remplissage matrice pions des joueurs*/
			public static void remplissagepionJ ( int js, int [][]pionsJ){
				int i;
				switch(js){					
				case(1):i=2;
				break;
				
				case(2):i=4;/* switch car pour que cela fonctionne aussi pour 2 joueurs 2 couleurs*/
				break;
				
				case(3):i=3;
				break;
				
				case(4):i=4;
				break;
				
				default: i=0;
				break;
				}
					System.out.println("   ");
					System.out.println("***Voici la matrice qui fait le compte de vos pions:***");
					
				for (int j=0; j<3;j++){
					for (int h=0; h<i; h++){
						pionsJ[j][h] = 3;
						System.out.print("   "+pionsJ[j][h]+"   |");
						}
						System.out.println("   ");
					}
					System.out.println("   ");
					}
				
			
		
			
			/*ici cette fonction fonctionne pour tous les joueur, selection pions*/
		public static int choisirpions( int[][] pionsj, String ja, int JA) {
	
		int typeDePions=-1;
		
		System.out.println("******************************** ");
		System.out.println("***C'est au tour de "+ja+" de jouer:***");

		System.out.println(" \n"+"***"+ ja + " veuillez selectionner un type de pion:***\n"+"0 pour petit;\n"+"1 pour moyen;\n"+"2 pour grand"); 

		typeDePions = Lire.i();

		
			/*ici on vérifie si il es possible de prendre le pions choisi et si il en reste dans la matrice de piosn*/
			while (typeDePions!= 0 && typeDePions!=1 && typeDePions!=2){
		
			System.out.println(ja + " veuillez selectionner un type de pion parmi:\n"+"0 pour petit;\n"+"1 pour moyen;\n"+"2 pour grand)");

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

		System.out.println("***"+ja+" choisissez la ligne sur laquelle vous placez votre pion:***\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

		ligne = Lire.i();
		
		
		while (ligne!=0 && ligne!=1 && ligne!=2){
			
			System.out.println(ja+", l'emplacement que vous avez choisi n'est pas possible");
			
			System.out.println("Choisissez une ligne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne");

		ligne = Lire.i();
	}
		return ligne;
	}
	
	
		
				/*ici cette fonction fonctionne pour tous les joueur, selecgionne ligne*/
		public static int choisircolonne( String ja) {
		int  colonne;
		
		System.out.println("***"+ja+" choisissez la colonne sur laquelle vous placez votre pion:***\n"+"0 pour la première colonne\n"+"1 pour la deuxieme colonne\n"+"2 pour la troisieme colonne\n");

		colonne = Lire.i();
		
		while (colonne!=0 && colonne!=1 && colonne!=2){
			
			System.out.println(ja+", l'emplacement que vous avez choisi n'est pas possible");
			
			System.out.println("Choisissez une colonne sur laquelle vous placez votre pion:\n"+"0 pour la première ligne\n"+"1 pour la deuxieme ligne\n"+"2 pour la troisieme ligne\n");

		colonne = (int)Lire.i();
		}    
		return colonne;

		}
		
			/*ici on vérifier si il est possible d'utiliser le pion et lemplacent choisi dans le jeu*/
			public static int possible(String[][][] plateaux, String ja,int ligne, int colonne, int pion) {
			
			int rep;
	
			if(plateaux[ligne][pion][colonne]!="O"){
				System.out.println("			*****ATTENTION*****");
				System.out.println(ja+", l'emplacement que vous avez choisi n'est pas libre. \n"+"Veuillez choisir de nouveau:");
				System.out.println(" 			*******************");
				System.out.println(" ");
				rep=0;
			}else{
			 rep = 1;
			 }
			 
			 System.out.println(" ");
		return rep;
		
		}
	
		
			
			
			/*pour enlever pions de la matrice de pions et affiche*/
			public static void enlevepions( int [][] pionsj, String ja, int JA, int typeDePions, String [] nom, int js){
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
				
				default: i=0;
				break;
				}
			if (js==2){
			pionsj[typeDePions][JA]=pionsj[typeDePions][JA]-1;
			System.out.println("");
			System.out.println("***"+ja+"  voici les pions qu'il vous reste:***");
		}else {
			pionsj[typeDePions][JA]=pionsj[typeDePions][JA]-1;
			System.out.println("");
			System.out.println("***"+ja+"  voici les pions qu'il vous reste:***");
		}
			
			for (int j=0; j<3;j++){
					for (int h=0; h<i; h++){
						
						System.out.print("   "+pionsj[j][h]+"   |");
						}
						System.out.println("   ");
					}
			System.out.println(" ");
			}
	
		
		

 
	
			
		public static void main (String[] args) {
		
		int J=1;
		while(J==1){		//boucle pour rejouer la partie
		
		System.out.println("Bienvenue au jeux otrio");
	
			
		String JEU [][][] = new String [3][3][3];	/*plateau de jeu, puisque je defini les pions par des lettre on a des String*/
		 plateauvide(JEU);
		 
		int[][] pionsJ = new int[3][4];		/*matrice des pions des joueru*/
		String [] nom= new String [4];		/*matrice des noms des joueru*/
		int p=0;  					/*compte le nbre de tours de jeu*/
		String Pa, Ja;				/*pions actuel et joueur actuel*/
			Pa= " ";
			Ja= " ";
		int nb=-1;
		
		/*on ne peut placer que 27 pions de=ans le plateau*/    	/*à ajouter les conditions de victoire ici avec un while*/
		
			
			
		int Js=menu();		/////*Js=joueurs;, utilisé d'abord pour le type de partie puis pour le nombre de joueurs*/
		int quel_jeux=Js;		
						
						////* en fonction de menu, on defini le de joueur nb, varible que lo, va utliser tout au long du code notamment sous le nom i*/
		nb=nombredejoueurs ( Js);
				
				/////chgmt de plan on va jjste autoriser au joueur de definir leurs nom quon mettrza dans une atrice et plus le nom de leurs pions; trop compliqué
		remplissagematricenomjoueur ( nb, nom);
			
		
					/////*apres avoir définit les joueur on peut remplir la matrice de pions*/
		remplissagepionJ ( Js, pionsJ);
						
		
	while (p<28){		//	A FAIRE: ajouter les condition de victoire avec dans while
		int JA=p%nb; 	///*JA pour le joueur actuel en nombre= joueur n1.joueur n2.joueur n°3... et Ja est le nom en caractere du joueur actuel*/

		if (quel_jeux==2){
			JA=p%4;				///*module pour definir quel joueur joue pour chaque tours pour 1vs1 2 couelur, on peut garder seulement ce if pour faire version 1vs1 2couleur
			if (JA==0){			
				Ja=nom[0];
				Pa="U";
				}
				else if (JA==1){			
				Ja=nom[1];
				Pa="D";
				}else if (JA==2){			
				Ja=nom[0];
				Pa="T";
				}
				else if (JA==3){			
				Ja=nom[1];
				Pa="Q";
				}
	} else {	
		if (JA==0){		
			JA=p%nb;			///*module pour definir quel joueur joue pour chaque tours autre que pour 1vs1 2 couelur*/		
				Ja=nom[0];
				Pa="U";
				}
				else if (JA==1){			
				Ja=nom[1];
				Pa="D";
				}else if (JA==2){			
				Ja=nom[2];
				Pa="T";
				}
				else if (JA==3){			
				Ja=nom[3];
				Pa="Q";
				}
			}
			
				/* ce while est pour continuer de demander de choisir un emplacement tant que la place et le pions choisi ne sont pas disponible*/
					int i=0;
					int C=-1;
					int L=-1;
					int pion=-1;				/*colonne ligne et type de pions que je joueur actuel choisi*/
		
				while (i==0){				//boucle : on choisi pions et emplacement puis on verifie si possible et si pas possible le i reste a 0 et la boucle recommence				
				pion=choisirpions( pionsJ, Ja, JA);
				L=choisirligne( Ja);
				C=choisircolonne( Ja);
				
				i=possible(JEU,Ja, L, C, pion);
				}
			
			/*une fois choisi on peut l'enlever de la matrice pions et ajouter le pions au plateau*/
				enlevepions( pionsJ,Ja, JA, pion, nom, Js);
			
				plateau(JEU, L, C, pion, Pa);
				
			p=p+1;
			
			}
			//A FAIRE:rediger qui a gagné et ne pas oublier que le cas 1vs1 deux couleurs où il faudra donner le bon nom du joueur qui gagne
	
		System.out.println("Voulez vous refaire une parie?\n"+"0=finir\n"+"1=rejouer");
		J=Lire.i();
	}
	}}
		
			
			

 
		
		
	


