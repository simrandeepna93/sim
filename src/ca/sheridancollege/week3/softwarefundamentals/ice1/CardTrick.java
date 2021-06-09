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
 *Modifier:Simrandeep singh
 * STUDENT ID:991621182
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       
        Card[] magicHand = new Card[7];
         Scanner scan = new Scanner(System.in);
        Random anycard = new Random();
        System.out.println("The cards in the magic hand are: ");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(anycard.nextInt(13)  + 1);
            c.setSuit(Card.SUITS[anycard.nextInt(4)]);
            magicHand[i] =c;
            System.out.println(c);
        }
       
          System.out.print("Enter card value: ");
        int val = scan.nextInt();
        System.out.print("Enter suit: ");
        String suit = scan.next();
        Card a = new Card();
        a.setValue(val);
        a.setSuit(suit);  
       
        boolean found = false;
        System.out.println("Searching for: " + a);
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == a.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(a.getSuit())) {
                System.out.println("Card is found in magic hand :" + (i+1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");
    }
}
   
