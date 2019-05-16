/**
 * This is the main method for the blackjack game.
 * It implements the actual algorithm of the game.
 * @author Dana Truempy
 */

public class BlackjackGameSimulator{
  public static void main( String[] args ){
    Player player = new Player();
    Dealer dealer = new Dealer();
    Deck deck = new Deck();
    
    do{
      int bet = player.placeBet();
      deck.shuffleDeck();
      
      player.hand.clear();
      dealer.hand.clear();
    
      player.hand.add( deck.dealCard() );
      dealer.hand.add( deck.dealCard() );
      player.hand.add( deck.dealCard() );
      dealer.hand.add( deck.dealCard() );
    
    boolean boolMove = false;
    boolean dealMove = false;
    
      do{
        boolMove = player.move();
        if (boolMove && player.handTotal() <= 21) {
          player.hand.add(deck.dealCard());
        }
      } while( boolMove && player.handTotal() <= 21 );
    
      if( player.handTotal() == 21 ){
        System.out.println( "You win!" );
        player.addCash(bet * 2);
        
        continue;
      }
      
      else if( player.handTotal() > 21 ){
        System.out.println( "Player bust!" );
        
        continue;
      }
      
      do{
        dealMove = dealer.move();
        if (dealMove && dealer.handTotal() <= 21) {
          dealer.hand.add(deck.dealCard());
        }
      } while( dealMove && dealer.handTotal() <= 21 );
      
      if( dealer.handTotal() == 21 ){
        System.out.println( "Dealer wins!" );
        
        continue;
      }
      
      else if( dealer.handTotal() > 21 ){
        System.out.println( "Dealer bust! You win!");
        player.addCash(bet * 2);
        
        continue;
      }
      
      else if( player.handTotal() > dealer.handTotal() ){
        System.out.println( "You win!" );
        player.addCash(bet * 2);
        
        continue;
      }
      
      else if( dealer.handTotal() > player.handTotal() ){
        System.out.println( "Dealer wins!" );
        
        continue;
      }
      
      else if( dealer.handTotal() == player.handTotal() ){
        System.out.println( "It's a tie!" );
        player.addCash(bet);
        
        continue;
        }
      }
      while( player.getCash() > 0 && player.playContinue() );
      
      System.out.println( "Game over!" );
  }
} 
