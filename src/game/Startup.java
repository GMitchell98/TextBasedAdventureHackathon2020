/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author dod98
 */
public class Startup {
    
    

    public static Player Startup() {
        Scanner in = new Scanner(System.in);
        boolean namethere = false;
        boolean strthere = false;
        boolean dexthere =false;
        Player currentPlayer;
        
        String pName ="";
        int pStr = 0;
        int pDex =0;

        //stat points
        int statpoints = 10;
        
        //name input
        while (namethere == false) {

            System.out.println("Enter your heroes/heroines name: ");
            String name = in.nextLine();
     
            if (name.length() > 0) {
                pName= name;
                System.out.println("Your name is: " + pName);
                namethere =true;  
            } else {
                 System.out.println("Please enter a name: ");
            }
        }

        //str input
        while (strthere == false) {
            System.out.println("You have " + statpoints + " remaining, use them wisely!");
            System.out.println("Please enter the stat points you want add: ");
            try {
                int strNumber = Integer.parseInt(in.nextLine());

                if (strNumber >= 0 && strNumber < statpoints) {
                    System.out.println("Your strength attribute has been given " + strNumber + " points");
                    statpoints-=strNumber;
                    pStr =strNumber;
                    strthere =true;
                    
                } else {
                    System.out.println("Please enter a number greater than zero and less than your remaining stat points");
                }

            } catch (NumberFormatException ex) {
                //handles exception
                System.out.println("Please enter an interger :)");
            }
        }
        
        
         //dex input
        while (dexthere == false) {
            System.out.println("You have " + statpoints + " remaining, use them wisely!");
            System.out.println("Please enter the stat points you want to add to dexterity: ");
            try {
                int dexNumber = Integer.parseInt(in.nextLine());

                if (dexNumber >= 0 && dexNumber <= statpoints) {
                    System.out.println("Your dexterity attribute has been given " + dexNumber + " points");
                    statpoints-=dexNumber;
                    pDex=dexNumber;
                    dexthere = true;
                } else {
                    System.out.println("Please enter a number greater than zero and less than your remaining stat points");
                }

            } catch (NumberFormatException ex) {
                //handles exception
                System.out.println("Please enter an interger :)");
            }
        }

         return currentPlayer = new Player(pName,pStr,pDex);

    }
}
