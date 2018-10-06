package Poker;
import java.io.IOException;
import java.util.ArrayList;

////////////////////
//
//Class for the Poker Game. Checks who won.
//
////////////////////


public class PokerGame {
  public CardHand opponentHand = new CardHand();
  public CardHand aiHand = new CardHand();
  public ArrayList<String> deck;
  public AiController controller = new AiController();
  
  public PokerGame(String deckLocation, int line){
    //Creating new poker game
    //First get cards, then get hand
    Parser theParser = new Parser();
    try {
      //Getting Cards from Parser
      this.deck = theParser.getCards(deckLocation).get(line);
      //Create 2 hands from deck
      int i = 0;
      while (i<5) {
        opponentHand.addCard(deck.get(0));
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
  
  public void processBehaviour(){
	//processes the AIP's behaviour
	
  }
  
}
