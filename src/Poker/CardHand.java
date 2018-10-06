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
    //Checking if there is a value
    if((this.hand.get(0).charAt(1) == this.hand.get(1).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(2).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(3).charAt(1))) {
      return true;
    }
    else if((this.hand.get(0).charAt(1) == this.hand.get(1).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(2).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(4).charAt(1))) {
      return true;
    }
    else if((this.hand.get(0).charAt(1) == this.hand.get(1).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(3).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(4).charAt(1))) {
      return true;
    }
    else if((this.hand.get(0).charAt(1) == this.hand.get(2).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(3).charAt(1)) && (this.hand.get(0).charAt(1) == this.hand.get(4).charAt(1))) {
      return true;
    }
    else if((this.hand.get(1).charAt(1) == this.hand.get(2).charAt(1)) && (this.hand.get(1).charAt(1) == this.hand.get(3).charAt(1)) && (this.hand.get(1).charAt(1) == this.hand.get(4).charAt(1))) {
      return true;
    }
    else {
      return false;
    }
  }
  
  //FULL HOUSE
  public boolean hasFullHouse() {
    return false;
  }
  
  //FLUSH
  public boolean hasFlush() {
    //Checking for each card to start with the same suit
    char suit = this.hand.get(0).charAt(0);
    
    
    int i = 0;
    while(i<5) {
      if(this.hand.get(i).charAt(0) != suit) {
        return false;
      }
      i++;
    }
    return true;
  }
  
  //STRAIGHT
  public boolean hasStraight() {
    return false;
  }
  
}
