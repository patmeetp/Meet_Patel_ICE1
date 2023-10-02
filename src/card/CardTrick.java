/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import card.Card;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modified by Meet Patel, 991699476
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);  // Random number between 1 and 13 inclusive
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);  // Random number between 0 and 3 inclusive
        }
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the card value (1-13):");
        int cardValue = scanner.nextInt();
        
        System.out.println("Enter the card suit (Hearts, Diamonds, Clubs, Spades):");
        String cardSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(cardSuit);
        
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card == null) continue;
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        
        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        //Then report the result here
        
        // Adding the luck card with value 2 and suit Clubs
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
        
        if (userCard.getValue() == luckCard.getValue() && userCard.getSuit().equals(luckCard.getSuit())) {
            System.out.println("Congratulations! You picked the luck card!");
        }

    }
    
}
