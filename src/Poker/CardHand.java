package Poker;
////////////////////
//
//Class for the Card Hand, stores 5 cards
//
////////////////////

import java.util.ArrayList;
import java.util.Arrays;


public class CardHand {
  public ArrayList<String> hand = new ArrayList<String>();
  
  public CardHand() {
  }
  
  public void addCard(String newCard) {
    this.hand.add(newCard);
  }
  
  //Sorts card hand by values
  public int[] sortHand() {
    int[] values = new int[5];
    String[] cards = new String[5];
    //Values into array so sorting can happen
    int i = 0;
    while(i<5) {
      if(this.hand.get(i).charAt(1) == 'K') {
        values[i] = 13;  
      }
      else if (this.hand.get(i).charAt(1) == 'Q') {
        values[i] = 12;
      }
      else if (this.hand.get(i).charAt(1) == 'J') {
        values[i] = 11;
      }
      else if (this.hand.get(i).charAt(1) == 'A') {
        values[i] = 14;
      }
      else if (this.hand.get(i).length() == 3) {
        values[i] = 10;
      }
      else {
        values[i] = Character.getNumericValue(this.hand.get(i).charAt(1));
      }
      cards[i] = this.hand.get(i);
      i++;
    }
    
    //With card values in the array, the array can now be sorted. Make sure to flip the original cards as well to keep track; 
    Arrays.sort(values);
    return values;
    
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
    int[] check = this.sortHand();
    if((check[0] == check[1] && check[0] == check[2]) && (check[3] == check[4])) {
      return true;
    }
    else if((check[4] == check[3] && check[4] == check[2]) && (check[0] == check[1])) {
      return true;
    }
    else {
      return false;
    }
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
