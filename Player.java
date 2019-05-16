/**
 * This class creates a player with a set amount of money to bet and a hand
 * composed of Cards. It has methods to change the amount of money the player has,
 * to place a bet, make moves, display the total point value of the hand, and get
 * and set values. 
 * @author Dana Truempy
 */

import java.util.*;

public class Player{
  private int cash = 100; //Player always starts with $100
  List<Card> hand = new ArrayList<Card>();
 
  /**
   * This method adds the int payout to the player's money, which is the amount of 
   * money returned from the player winning the game.
   * @param payout This is the argument for the amount of money the player gets
   */
 
  public void addCash(int payout){
    this.cash += payout;
  }
  
  /** This method takes the player's bet and subtracts it from their remaining money.
   * If the bet is more than the player has in cash, the method will ask again. 
   * @return bet The bet that the player enters
   */
  
  public int placeBet(){
    System.out.println( "What's your wager?" );
    Scanner input = new Scanner( System.in );
    int bet = input.nextInt();
    
    if (bet > cash){
      bet = placeBet();
    }
    
    cash -= bet;
    return bet;
  }
  
  /**
   * A getter for the cash variable.
   * @return cash
  */
  
  public int getCash(){
    this.cash = cash;
    return cash;
  }  
  
  /**
   * This method tells the player the point value of her hand and asks her to 
   * hit or stay. 
   * @return boolean Returns true as long as the player continues to hit
   */
  
  public boolean move(){
    System.out.println( "Your current hand's value is: " + 
                         Integer.toString(handTotal()) +
                         "\nHit or stay?" );
    
    Scanner input = new Scanner( System.in );
    String move = input.nextLine();
    return move.equalsIgnoreCase("Hit");
  }
  
  /**
   * This returns the total point value of the player's hand.
   * @return total Total is an int representing the point value of the hand
  */
  
  public int handTotal(){
    int total = 0;
    
    for( int i = 0; i < hand.size(); i++ ){
      total += hand.get(i).getValue();
    }     
    return total;
  }
  
  /** This method displays the amount of money the player has remaining and asks
   * if she would like to continue playing.
   * @return boolean Returns true as long as the player agrees to play again
  */
  
  public boolean playContinue(){
    System.out.println( "Your current remaining money is " + Integer.toString(cash) + " dollars. Continue? Type yes or no." );
    Scanner input = new Scanner( System.in );
    String cont = input.nextLine();
    
    return cont.equalsIgnoreCase("Yes");
  }
}