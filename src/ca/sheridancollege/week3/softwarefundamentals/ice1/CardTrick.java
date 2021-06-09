/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
        import java.util.Random;
        

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       
        Card[] magicHand = new Card[7];
         Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        System.out.println("The cards in the magic hand are: ");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generator.nextInt(13)  + 1);
            c.setSuit(Card.SUITS[generator.nextInt(4)]);
            magicHand[i] =c;
            System.out.println(c);
        }
        // for part 3 and 412
          System.out.print("Enter card value: ");
        int val = scan.nextInt();
        System.out.print("Enter suit: ");
        String suit = scan.next();
        Card key = new Card();
        key.setValue(val);
        key.setSuit(suit);  
        // hard-coded answer for part 6 and 7
        //Card key = new Card();
     //   key.setValue(11);
       // key.setSuit("Hearts");
        boolean found = false;
        System.out.println("Searching for: " + key);
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == key.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(key.getSuit())) {
                System.out.println("Card is found in magic hand at index " + (i+1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");
    }
}
   
