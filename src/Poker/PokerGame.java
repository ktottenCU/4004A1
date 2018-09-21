package Poker;
import java.io.IOException;
import java.util.ArrayList;

////////////////////
//
//Class for the Poker Game. Checks who won.
//
////////////////////


public class PokerGame {
  public CardHand playerHand = new CardHand();
  public CardHand aiHand = new CardHand();
  public ArrayList<String> deck;
  
  public PokerGame(String deckLocation){
    //Creating new poker game
    //First get cards, then get hand
    Parser getCards = new Parser();
    try {
      //Getting Cards from Parser
      this.deck = getCards.getCards(deckLocation);
      //Create 2 hands from deck
      int i = 0;
      while (i<5) {
        playerHand.addCard(deck.get(0));
        deck.remove(0);
        i++;
      }
      i = 0;
      while (i<5) {
        aiHand.addCard(deck.get(0));
        deck.remove(0);
        i++;
      }
      
      
      
      
      
    } catch (IOException e) {
      //Error
      System.out.println("CANNOT GET DECK, UNABLE TO PLAY POKER WITHOUT CARDS!");
    }
    
  }
  
}
