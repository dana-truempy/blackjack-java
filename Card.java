/**
 * This class creates a Card object that has the characteristics name and value.
 * @author Dana Truempy
 */

import java.lang.Integer;

public class Card {
  
  private String name;
  private int value;
  
  /**
   * This is a constructor for the Card class.
   * @param name A string of the card name from the Deck class
   * @param value An int of the point value of the card
   */  
  public Card( String name, int value ){
    this.name = name;
    this.value = value;
  }
  
  /**
   * A getter for name.
   * @return name Returns the card name as a string
  */
  
  public String getName(){
    return name;
  }
  
  /**
   * A getter for value.
   * @return value Returns the int value of the card
  */
  
  public int getValue(){
    return value;
  }
  
  /**
   * Returns a string of the card's name and value
   * @return aCard String of the card's name and value
  */
  
  public String cardString(){
    String aCard = name + "(" + Integer.toString(value) + ")";
    return aCard;
  }
}
