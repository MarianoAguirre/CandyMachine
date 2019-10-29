/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;

import java.util.Scanner;

/**
 *
 * @author 21006
 */
public class CandyMachine {

    /**
     * @param args the command line arguments
     */
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to THS's Computer Candy Machine!\n"
                + " All candy provided is virtual.");
        System.out.println("How much money do ya got?");

        double money = money();
        System.out.println("Well, lemme tell ya what we got here");
        displayChoices();
        System.out.println("So, what'll ya have?");
        double dispense = dispense();
        double change;
        if(money > dispense){
            change = money - dispense;
            System.out.println("Thanks for purchasing candy through us.");
        System.out.println("Please take your candy, and your $ " + change);
        }
        else if(money < dispense){
            System.out.println("You're broke, get out of here");
        }
        else{
            System.out.println("Thanks for purchasing your candy through here, you have no change");
        }
        
      
        
        
        

        // TODO code application logic here
    }

    public static double money() {
        double dollar = kb.nextDouble();
        System.out.println("$ " + dollar + ", that's all?");
        return dollar;

    }

    public static double displayChoices() {
        String display = kb.nextLine();
        System.out.println("A $0.65 Twix\n"
                + "B $0.50 Chips\n"
                + "C $0.75 Nutter Butter\n"
                + "D $0.65 Peanut Butter Cup\n"
                + "E $0.55 Juicy Fruit Gum");
        return 0;

    }

    public static double dispense() {
        char choice = kb.next().charAt(0);

        if (choice == 'A' || choice == 'a') {
            return 0.65;
        } else if (choice == 'B' || choice == 'b') {
            return 0.50;
        } else if (choice == 'C' || choice == 'c') {
            return 0.50;

        } else if (choice == 'D' || choice == 'd') {
            return 0.50;

        } else if (choice == 'E' || choice == 'e') {
            return 0.50;
        }
        return 0;
    }
    
}
