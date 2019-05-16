/**
 * This class extends Player, and ovverrides the Player.move() method.
 * @author Dana Truempy
*/

public class Dealer extends Player{
  
  /** 
   * Since dealer has different rules than player, Dealer.move() overrides Player.move().
   * This move method returns "hit" until the total point value of the hand is 17 or higher.
   * @return boolean Returns true until handTotal is 17 or more
  */
  
  public boolean move(){
    return (handTotal() < 17);
  }
}