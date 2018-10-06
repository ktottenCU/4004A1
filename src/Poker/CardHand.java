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
  
  //FUNCTIONS TO CHECK CERTAIN ITEMS IN THE HAND
  
  //ROYAL FLUSH CHECK
  public boolean hasRoyalFlush() {
    if(this.hand.contains("SA") && this.hand.contains("SK") && this.hand.contains("SQ") && this.hand.contains("SJ") && this.hand.contains("S10")) {
      return true;
    }
    else if(this.hand.contains("HA") && this.hand.contains("HK") && this.hand.contains("HQ") && this.hand.contains("HJ") && this.hand.contains("H10")) {
      return true;
    }
    else if(this.hand.contains("DA") && this.hand.contains("DK") && this.hand.contains("DQ") && this.hand.contains("DJ") && this.hand.contains("D10")) {
      return true;
    }
    else if(this.hand.contains("CA") && this.hand.contains("CK") && this.hand.contains("CQ") && this.hand.contains("CJ") && this.hand.contains("C10")) {
      return true;
    }
    else {
      return false;
    }
  }
  
  //STRAIGHT FLUSH
  public boolean hasStraightFlush() {
    return false;
  }
  
  //FOUR OF A KIND
  public boolean hasFourOfAKind() {
    return false;
  }
  
  //FULL HOUSE
  public boolean hasFullHouse() {
    return false;
  }
  
  //FLUSH
  public boolean hasFlush() {
    return false;
  }
  
  //STRAIGHT
  public boolean hasStraight() {
    return false;
  }
  
}
