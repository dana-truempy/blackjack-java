/**
 * This class initializes an array of 52 cards and then shuffles 
 * them using the shuffleDeck method.
 * It also deals one card at a time using the dealCard method.
 * @author Dana Truempy
*/

import java.util.*;

public class Deck
{
  Card cardArray[] = { new Card("2", 2), new Card("2", 2), new Card("2", 2), new Card("2", 2), 
                       new Card("3", 3), new Card("3", 3), new Card("3", 3), new Card("3", 3), 
                       new Card("4", 4), new Card("4", 4), new Card("4", 4), new Card("4", 4), 
                       new Card("5", 5), new Card("5", 5), new Card("5", 5), new Card("5", 5), 
                       new Card("6", 6), new Card("6", 6), new Card("6", 6), new Card("6", 6), 
                       new Card("7", 7), new Card("7", 7), new Card("7", 7), new Card("7", 7), 
                       new Card("8", 8), new Card("8", 8), new Card("8", 8), new Card("8", 8), 
                       new Card("9", 9), new Card("9", 9), new Card("9", 9), new Card("9", 9), 
                       new Card("10", 10), new Card("10", 10), new Card("10", 10), new Card("10", 10),
                       new Card("Jack", 10), new Card("Jack", 10), new Card("Jack", 10), new Card("Jack", 10),
                       new Card("Queen", 10), new Card("Queen", 10), new Card("Queen", 10), new Card("Queen", 10), 
                       new Card("King", 10), new Card("King", 10), new Card("King", 10), new Card("King", 10),
                       new Card("Ace", 1), new Card("Ace", 1), new Card("Ace", 1), new Card("Ace", 1) }; 
  
  List<Card> shuffledCards;
   
    /**
     * This method uses Collections.shuffle to create a shuffled list of type Card.
     */
   
    public void shuffleDeck(){
      shuffledCards = new LinkedList<Card>(Arrays.asList(cardArray));
      Collections.shuffle(shuffledCards); 
    }
    
    /**
     * This method uses the remove() method from List to return a Card from the top of the deck,
     * which it then removes from the deck until a new deck is made and shuffled.
     * @return Card The remove method returns the type that the list is composed of
    */
    
    public Card dealCard(){
      return shuffledCards.remove(0);
    }
}