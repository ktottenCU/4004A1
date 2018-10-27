
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
  
  public void removeCard(String card) {
    this.hand.remove(this.hand.indexOf(card));
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
  
  //Sorts hand by suit, with spades being a 4 and clubs being a 1 (so spades is highest)
  public int[] sortSuits() {
    int[] values = new int[5];
    
    int i = 0;
    while(i<5) {
      if(this.hand.get(i).charAt(0) == 'S') {
        values[i] = 4;
      }
      else if(this.hand.get(i).charAt(0) == 'H') {
        values[i] = 3;
      }
      else if(this.hand.get(i).charAt(0) == 'D') {
        values[i] = 2;
      }
      else {
        values[i] = 1;
      }
      i++;
    }
    
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
    if(this.hasFlush() && this.hasStraight()) {
      return true;
    }
    else {
      return false;
    }
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
    int[] check = this.sortHand();
    
    //Deal with Aces
    if(this.hand.contains("SA") || this.hand.contains("HA") || this.hand.contains("DA") || this.hand.contains("CA")) {

      //Ace-High
      if(check[0] == 10 && check[1] == 11 && check[2] == 12 && check[3] == 13 && check[4] == 14) {
        return true;
      }
      //Ace low
      else if(check[0] == 2 && check[1] == 3 && check[2] == 4 && check[3] == 5 && check[4] == 14) {
        return true;
      }
      //Ace but no straight
      else {
        return false;
      }
    }
    //Deal without aces
    else {
      if((check[0] == (check[1] - 1)) && (check[1] == (check[2] - 1)) && (check[2] == (check[3] - 1)) && (check[3] == (check[4] - 1))) {
        return true;
      }
      else {
        return false;
      }
    }
  }
  
  //THREE OF A KIND
  public boolean hasThreeKind() {
    int check[] = this.sortHand();
    if(check[0] == check[1] && check[0] == check[2] && check[0] != check[3] && check[0] != check[4]) {
      if(this.hasFullHouse() || this.hasFourOfAKind()) {
        return false;
      }
      return true;
    }
    else if(check[1] == check[2] && check[1] == check[3] && check[1] != check[0] && check[1] != check[4]) {
      if(this.hasFullHouse() || this.hasFourOfAKind()) {
        return false;
      }
      return true;
    }
    else if(check[2] == check[3] && check[2] == check[4] && check[2] != check[0] && check[2] != check[1]) {
      if(this.hasFullHouse() || this.hasFourOfAKind()) {
        return false;
      }
      return true;
    }
    else {
      return false;
    }
  }
  
  //TWO PAIR
  public boolean hasTwoPair() {
    int[] check = this.sortHand();
    if(check[0] == check[1] && check[2] == check[3] && check[0] != check[2]) {
      return true;
    }
    else if(check[1] == check[2] && check[3] == check[4] && check[1] != check[3]) {
      return true;
    }
    else if(check[0] == check[1] && check[3] == check[4] && check[0] != check[3]) {
      return true;
    }
    else {
      return false;
    }
  }
  
  //PAIR
  public boolean hasPair() {
    int[] check = this.sortHand();
    //Ensuring not 3 of a kind
    if((check[0] == check[1] && check[0] != check[2] && check[1] != check[2] && check[0] != check[3] && check[1] != check[3] && check[0] != check[4] && check[1] != check[4])
        || (check[1] == check[2] && check[2] != check[0] && check[1] != check[0] && check[2] != check[3] && check[1] != check[3] && check[2] != check[4] && check[1] != check[4]) 
            || (check[2] == check[3] && check[2] != check[0] && check[3] != check[0] && check[2] != check[1] && check[3] != check[1] && check[2] != check[4] && check[3] != check[4]) 
                || (check[3] == check[4] && check[3] != check[0] && check[4] != check[0] && check[3] != check[1] && check[4] != check[1] && check[3] != check[2] && check[4] != check[2])) {
      //Ensuring no two-pair
      if(this.hasTwoPair()) {
        return false;
      }
      else {
        return true;
      }
    }
    else {
      return false;
    }
  }
  
  //Checking One-Offs
  public int oneOffRoyalFlush() {
    return (-1);
  }
  
  public int oneOffStraightFlush() {
    return (-1);
  }
  
  public int oneOffFlush() {
    int[] suits = this.sortSuits();
    //Different suit is last
    if(suits[0] == suits[1] && suits[0] == suits[2] && suits[0] == suits[3] && suits[0] != suits[4]) {
      int check = suits[4];
      char search;
      if(check == 4) {
        search = 'S'; 
      }
      else if (check ==3) {
        search = 'H';
      }
      else if (check ==2) {
        search = 'D';
      }
      else {
        search = 'C';
      }
      int i = 0;
      while(i<5) {
        if(this.hand.get(i).charAt(0) == search) {
          return i;
        }
        i++;
      }
      return (-1);
    }
    //Different suit first
    else if(suits[4] == suits[1] && suits[4] == suits[2] && suits[4] == suits[3] && suits[4] != suits[0]) {
      int check = suits[0];
      char search;
      if(check == 4) {
        search = 'S'; 
      }
      else if (check ==3) {
        search = 'H';
      }
      else if (check ==2) {
        search = 'D';
      }
      else {
        search = 'C';
      }
      int i = 0;
      while(i<5) {
        if(this.hand.get(i).charAt(0) == search) {
          return i;
        }
        i++;
      }
      return (-1);
    }
    //Not one-off flush
    else {
      return (-1);
    }
  }
  
  public int oneOffStraight() {
    return (-1);
  }
  
  public boolean hasThreeSuit(){
	  return false;
  }
  
  //Returns a value based on what the hand contains (does not take suit or high-card value into account)
  public int handVal() {
    if(this.hasRoyalFlush()) {
      return 10;
    }
    else if(this.hasStraightFlush()) {
      return 9;
    }
    else if(this.hasFourOfAKind()) {
      return 8;
    }
    else if(this.hasFullHouse()) {
      return 7;
    }
    else if(this.hasFlush()) {
      return 6;
    }
    else if(this.hasStraight()) {
      return 5;
    }
    else if(this.hasThreeKind()) {
      return 4;
    }
    else if(this.hasTwoPair()) {
      return 3;
    }
    else if(this.hasPair()) {
      return 2;
    }
    else {
      return 1;
    }
  }
  
}
