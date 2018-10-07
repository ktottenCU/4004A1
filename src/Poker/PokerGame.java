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
    
    //Printing out the first set of cards
    System.out.println("----- NEW POKER GAME! -----");
    System.out.println("OPPONENT'S CARDS: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
    System.out.println("AIP'S CARDS: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
  }
  
  public void processBehaviour(){
	//processes the AIP's behaviour
	//If structure to check if hand contains certain stuff
    if(aiHand.hasRoyalFlush()) {
      //Royal Flush
      System.out.println("Royal Flush - Stay");
      return;
    }
    else if(aiHand.hasStraightFlush()) {
      System.out.println("Straight Flush - Stay");
      return;
    }
    else if(aiHand.hasFourOfAKind()) {
      System.out.println("Four of a Kind - Stay");
      return;
    }
    else if(aiHand.hasFullHouse()) {
      System.out.println("Full House - Stay");
      return;
    }
    else if(aiHand.hasFlush()) {
      System.out.println("Flush - Stay");
      return;
    }
    else if(aiHand.hasStraight()) {
      System.out.println("Straight - Stay");
      return;
    }
    //None of the majour hands
    else {
      //Another if structure here for 1-swap hands, all of these should swap 1 card
      //The functions return either -1 for "not this issue", or the index that needs be swapped
      //Royal Flush
      if(aiHand.oneOffRoyalFlush() != (-1)) {
        
      }
      //Straight Flush
      else if(aiHand.oneOffStraightFlush() != (-1)) {
        
      }
      //Flush
      else if(aiHand.oneOffFlush() != (-1)) {
        aiHand.removeCard(aiHand.hand.get(aiHand.oneOffFlush()));
        aiHand.addCard(deck.get(0));
        deck.remove(0);
      }
      //Straight
      else if(aiHand.oneOffStraight() != (-1)) {
        
      }
      //Not one-away
      else {
        
      }
      
      return;
    }
  }
  
}
