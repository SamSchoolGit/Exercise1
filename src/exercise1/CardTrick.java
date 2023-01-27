package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Samuel Verdejo Jan 27. 2022
 */
import java.util.*;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            Random random = new Random();
            
            card.setValue(1 + random.nextInt(13));
            card.setSuit(Card.SUITS[random.nextInt(Card.SUITS.length)]);
            
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a card: (value 1-13 then suit, 1 for hearts, 2 for diamonds, 3 for spades, 4 for clubs)");
        
        Card userCard = new Card();
        userCard.setValue(in.nextInt());
        userCard.setSuit(Card.SUITS[in.nextInt()]);
        
        for(Card c: hand) {
            if(c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())) {
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sam, but you can call me Sam, Sam or Sam");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- LEARN ALOT!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Dancing");
        System.out.println("-- Eating");
        System.out.println("-- Crying");
        System.out.println("-- Dancing");

        System.out.println();
        
    
    }

}
