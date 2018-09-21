package Poker;
////////////////////
//
//Class for the Card Hand, stores 5 cards
//
////////////////////

import java.util.ArrayList;

public class CardHand {
  public ArrayList<String> hand = new ArrayList<String>();
  
  public CardHand() {
  }
  
  public void addCard(String newCard) {
    this.hand.add(newCard);
  }
}
