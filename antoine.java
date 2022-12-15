/*
 * antoine.java
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

/**

*

* @author anto

*/

public class ProjetOtrio {

 

    public static void lancerPartie1vs1(int[][] plateau) {

        String Joueur1;

 

        String Joueur2;

        int nbrJoueur = 2;

        int[] pionsJoueur1 = new int[3];

        int[] pionsJoueur2 = new int[3];

 

        System.out.println("Partie 1vs1");

        System.out.println("Prénom joueur 1 : ");

        Joueur1 = Lire.S();

        System.out.println("Prénom joueur 2 : ");

        Joueur2 = Lire.S();

        pionsJoueur1 = creeVecteurInitial();

        pionsJoueur2 = creeVecteurInitial();

        tourDeJeu(pionsJoueur1, pionsJoueur2, plateau, Joueur1, Joueur2);

    }

 

    public static void afficherPlateau(int[][] plateau) {

       System.out.println("------------" + "\n");

        for (int[] tab : plateau) {

            for (int s : tab) {

                System.out.print("| " + s + " |");         // \n signifie à la ligne

 

            }

 

            System.out.println("\n");

            System.out.print("------------");

            System.out.println("\n");

        }

    }

 

    public static int[] creeVecteurInitial() {

        int[] res;

        res = new int[3];

        for (int i = 0; i < 3; i++) {               // on parcout tout le vecteur et on met tout les coefs égale à 3

            res[i] = 3;

        }

        return res;

    }

 

    public static void afficherMatriceJoueur(int[] MatriceJoueur) {

        System.out.println("-------");

        for (int i = 0; i < 3; i++) {

            System.out.println(MatriceJoueur[i]);

        }

        System.out.println("-------");

    }

 

    public static int[] enleverPion(int indiceTypeDePion, int[] pions) {                          //enleve 1 à la bonne ligne

 

        int[] res = new int[3];

        if (indiceTypeDePion > 3 && indiceTypeDePion < 1) {   // si nb choisis différent de 1 2 3 redemander nbr

            System.out.println("rentrer un numéros disponible");

            indiceTypeDePion = Lire.i();

        } else {

            for (int i = 0; i < 3; i++) {

                if (i == indiceTypeDePion - 1) {

                    if (pions[i] == 0) {

                        System.out.println("choisir un autre type de pion");

                        indiceTypeDePion = Lire.i();

                    } else {

                        pions[i] = pions[i] - 1;

                    }

                }

            }

        }

        res = pions;

        return res;

    }

 

    public static void tourJoueur1(int[] pionsJoueur1, int[][] plateau, String joueur1) {//, int typeDePions, int valeur, int nLigne) {

        int valeur = -1;

        int nLigne = -1;

        int typeDePionsg = -1;

        System.out.println(joueur1 + " selectionner type de pion (1 pour petit, 2 pour moyen, 3 pour grand)"); // mettre prenom joueur 1 -> aller chercher joueur 1 dans mathéode lancer partie1vs1
sss
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

 

    public static void tourJoueur2(int[] pionsJoueur2, int[][] plateau, String joueur2) {// int typeDePions, int valeur, int nLigne) {

        int valeur = -1;

        int nLigne = -1;

        int typeDePions = -1;

        System.out.println(joueur2 + " selectionner type de pion (1 pour petit, 2 pour moyen, 3 pour grand)");

        typeDePions = Lire.i();

        valeur = switch (typeDePions) {

            case 1 ->

                21;

            case 2 ->

                22;

            default ->

                23;

        };

        pionsJoueur2 = enleverPion(typeDePions, pionsJoueur2);

        System.out.println("Matrice joueur 2");

        afficherMatriceJoueur(pionsJoueur2);

        System.out.println("Numéro ligne");

        nLigne = Lire.i() - 1;

        System.out.println("Numéro colonne");

        int nColonne = Lire.i() - 1;

        changerCoefMatrice(nLigne, nColonne, valeur, plateau);

    }

 

    public static void tourDeJeu(int[] pionsJoueur1, int[] pionsJoueur2, int[][] plateau, String joueur1, String joueur2) {

        //pionsJoueur1 = new int[3];

        // pionsJoueur2 = new int[3];

        int typeDePions = -1;

        //int nLigne = -1;

        //int valeur = -1;

        while ((typeDePions != 0) && (verifVictoire(plateau) == false)) {

            afficherPlateau(plateau);

            System.out.println("Matrice joueur 1");

            afficherMatriceJoueur(pionsJoueur1);

            tourJoueur1(pionsJoueur1, plateau, joueur1);

            afficherPlateau(plateau);

            System.out.println("Matrice joueur 2");

            afficherMatriceJoueur(pionsJoueur2);

            tourJoueur2(pionsJoueur2, plateau, joueur2);

            afficherPlateau(plateau);

        }

    }

 

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

    }

 

    //public static void victoire() {

//         fonction soit vraie soit fausse -> tant que fin est fausse continuer les tours de jeu et plateau pas rempli

        public static boolean verifVictoire (int [][]plateau){

            boolean victoire = false;

        for (var i = 0; i<3; i++){

         if (plateau[i][0] == plateau[i][1] && plateau[i][0] == plateau[i][2] && plateau[i][0] != 0){

              victoire = true ;

          }

          if (plateau[0][i] == plateau[1][i] && plateau[0][i] == plateau[2][i] && plateau[0][i] != 0){

              victoire = true;

          }

          for (var j = 0; j<3; j++){

              if (plateau[i][j] >1000000) {

              victoire=true;

          }

          }

        }

       

        if (plateau[0][0] == plateau[1][1] && plateau[0][0] == plateau[2][2] && plateau[0][0] != 0){

            victoire = true;

        }

        if (plateau[0][2] == plateau[1][1] && plateau[0][2] == plateau[2][0] && plateau[0][2] != 0){

            victoire = true;

        }      

        

        //  si valeur/10 est la même sur tt une colonne, ligne ou diagonale et valeur%10 sont toutes différents et valeur%10=2 au milieu return true

 

        return victoire;

}

    public static void menu(int[][] plateau) {              //méthode menu pour choisir quoi faire

        int rep = -1;

        System.out.println("Menu");

        System.out.println("----------------------------------------");

        System.out.println("Rentrez le numéro de votre choix");

        System.out.println("0) Quitter");

        System.out.println("1) jouer 1vs1");

        rep = Lire.i();

 

        if (rep == 1) {

 

            lancerPartie1vs1(plateau);

        }

    }

 

    public static void main(String[] args) {

        int[][] plateau = { //déclarer et initialiser le tableau en 2D

            {0, 0, 0},

            {0, 0, 0},

            {0, 0, 0}

 

        };

        System.out.println("Jeux otrio");

        afficherPlateau((plateau));

        menu(plateau);

        //plateauInitial();

        pion[][] plateau2;

        pion[] pionJoueur;

    }

}

 

// reste à faire:

//créer une méthode qui compte les tours (tour impair -> joueur 1/ tour pair -> joueur 2) pour dans changercoefmatrice appeler bonne méthode de tour joueur 1 ou 2

//créer une méthode qui regarde si le plateau est complet

//dire tant que les conditions de victoire pas réunies continuer à joueur

 
