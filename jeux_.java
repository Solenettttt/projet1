/*
 * jeux_.java
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


public class jeux_ {
	
	public static void main (String[] args) {
		
		 int JEU [][][] = new int[3][3][3];
		 matjeux(JEU);
		
	int r;
	
	String l;
		l = Lire.S();
		System.out.println(l);
	
	
	    

       System.out.println("Menu");

        System.out.println("_________________________________");

        System.out.println("Rentrez le numero de votre choix:\n"+"0) Quitter\n"+"1) jouer 1vs1");

       /* System.out.println("0) Quitter");

        System.out.println("1) jouer 1vs1");*/
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
		
		}
	

        
        
        


