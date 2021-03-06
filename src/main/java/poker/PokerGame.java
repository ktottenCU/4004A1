package poker;

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
      System.out.println("AIP Has: Royal Flush - Stay");
      return;
    }
    else if(aiHand.hasStraightFlush()) {
      System.out.println("AIP Has: Straight Flush - Stay");
      return;
    }
    else if(aiHand.hasFourOfAKind()) {
      System.out.println("AIP Has: Four of a Kind - Stay");
      return;
    }
    else if(aiHand.hasFullHouse()) {
      System.out.println("AIP Has: Full House - Stay");
      return;
    }
    else if(aiHand.hasFlush()) {
      System.out.println("AIP Has: Flush - Stay");
      return;
    }
    else if(aiHand.hasStraight()) {
      System.out.println("AIP Has: Straight - Stay");
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
        int val = aiHand.oneOffFlush();
        System.out.println("AIP Swapping: " + aiHand.hand.get(val) + " for " + deck.get(0));
        aiHand.removeCard(aiHand.hand.get(val));
        aiHand.addCard(deck.get(0));
        deck.remove(0);
      }
      //Straight
      else if(aiHand.oneOffStraight() != (-1)) {
        
      }
      //Not one-away
      else {
        //two-away sets
        //3 same suit
        if(false) {

        }
        //3 OF A KIND
        else if (aiHand.hasThreeKind()) {
          int check[] = aiHand.sortHand();
          int[] val = new int[2];
          char[] card = new char[2];
          //first 3
          if(check[0] == check[1] && check[0] == check[2]) {
            val[0] = check[3]; 
            val[1] = check[4];
          }
          //Middle 3
          else if(check[1] == check[2] && check[1] == check[3]) {
            val[0] = check[0]; 
            val[1] = check[4];
          }
          //last 3
          else{
            val[0] = check[0]; 
            val[1] = check[1];
          }
          
          int i = 0;
          while(i<2) {
            if(val[i] == 14) {
              card[i] = 'A';
            }
            else if(val[i] == 13) {
              card[i] = 'K';
            }
            else if(val[i] == 12) {
              card[i] = 'Q';
            }
            else if(val[i] == 11) {
              card[i] = 'J';
            }
            else if(val[i] == 10){
              card[i] = '1';
            }
            else {
              
              card[i] = Character.forDigit(val[i], 10);
            }
            i++;
          }
          //Found cards, now remove them
          
          int k = 0;
          while(k<2) {
            int j = 0;
            while(j < 5) {
              if(aiHand.hand.get(j).charAt(1) == card[k]) {
                System.out.println("AIP Swapping: " + aiHand.hand.get(j) + " for " + deck.get(0));
                aiHand.removeCard(aiHand.hand.get(j));
                aiHand.addCard(deck.get(0));
                deck.remove(0);
              }
              j++;
            }
            k++;
          }
          System.out.println("AIP'S CARDS: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));

          
        }
        //3 in-sequence
        else if (false) {
          
        }
        //Not 2-away from majours
        else {
          //2-pair
          if(this.aiHand.hasTwoPair()) {
            //Find which card
            int[] values = this.aiHand.sortHand();
            int val = -1;
            if(values[0] == values[1] && values[2] == values[3]) {
              //Get value at 4
              val = values[4];
            }
            else if(values[1] == values[2] && values[3] == values[4]) {
              //Get value at 0
              val = values[0];
            }
            else if(values[0] == values[1] && values[3] == values[4]) {
              //get value at 2
              val = values[2];
            } 
            //dealing with face cards and 10
            char card;
            if(val == 14) {
              card = 'A';
            }
            else if(val == 13) {
              card = 'K';
            }
            else if(val == 12) {
              card = 'Q';
            }
            else if(val == 11) {
              card = 'J';
            }
            else if(val == 10){
              card = '1';
            }
            else {
              card = Character.forDigit(val, 10);
            }
            
            //find which card to swap, and swap it
            int i = 0;
            while(i < 5) {
              if(aiHand.hand.get(i).charAt(1) == card) {
                System.out.println("AIP Swapping: " + aiHand.hand.get(i) + " for " + deck.get(0));
                aiHand.removeCard(aiHand.hand.get(i));
                aiHand.addCard(deck.get(0));
                deck.remove(0);
                i = 5;
              }
              i++;
            }
          }
          //Not 2-pair
          else {

          }
        }
      }
      return;
    }
  }
  
  //Check Winner
  public CardHand determineWinner() {
    CardHand winner = new CardHand();
    //Determine winner based on an int score
    int aip = 0;
    int opp = 0;
    
    //Setting the int val for both aip and opp
    aip = aiHand.handVal();
    opp = opponentHand.handVal();
    
    //AIP wins
    if(aip > opp) {
      System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
      winner = aiHand;
    }
    //Opponent Wins
    else if (opp > aip) {
      System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
      winner = opponentHand;
    }
    //Both hands contain the same-valued hand, so now check suits and high-card values here
    else {
//----- ROYAL FLUSH -----//
      if(aip == 10) {
        int aipval = aiHand.sortSuits()[0];
        int oppval = opponentHand.sortSuits()[0];
        if(aipval>oppval) {
          System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;
        }
        else {
          System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
        }
      }
//----- STRAIGHT FLUSH -----//
      else if(aip == 9){
    	//Check high card, then check suit
    	int[] aipvals, oppvals;
    	int highaip, highopp;
    	aipvals = aiHand.sortHand();
    	oppvals = opponentHand.sortHand();
    	highaip = aipvals[4];
    	highopp = oppvals[4];
    	//checking ace
    	if(highaip == 14){
    	  highaip = aipvals[3];
    	}
    	if(highopp == 14){
    	  highopp = oppvals[3];
    	}
    	//Checking if same or not
    	if(highopp > highaip){
    	  System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
    	}
    	else if(highaip > highopp){
    	  System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;
    	}
    	//Same, check suit
    	else{
    	  highopp = opponentHand.sortSuits()[0];
    	  highaip = aiHand.sortSuits()[0];
    	  if(highopp > highaip){
        	System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
            winner = opponentHand;
          }
          else {
            System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
            winner = aiHand;
    	  }
    	}
      }
//----- FOUR OF A KIND -----//
      else if(aip == 8){
        //Checking for highest four of a kind
    	int[] aipvals, oppvals;
    	aipvals = aiHand.sortHand();
    	oppvals = opponentHand.sortHand();
    	int highopp, highaip;
    	
    	//Find which is the 4 in the hand
    	if(aipvals[0] == aipvals[1]){
    	  highaip = aipvals[0];
    	}
    	else{
          highaip = aipvals[4];
    	}
    	if(oppvals[0] == oppvals[1]){
      	  highopp = oppvals[0];
      	}
      	else{
            highopp = oppvals[4];
      	}
    	//Check winner
    	if(highopp > highaip){
    	  System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
    	}
    	else{
    	  System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;
    	}	
      }
//----- FULL HOUSE -----//
      else if(aip == 7){
    	int[] aipvals, oppvals;
      	aipvals = aiHand.sortHand();
      	oppvals = opponentHand.sortHand();
      	int highopp, highaip;
      	//Finding which of the 5 cards is the triple
      	if(aipvals[0] == aipvals[1] && aipvals[0] == aipvals[2]){
      	  highaip = aipvals[0];
      	}
      	else{
      	  highaip = aipvals[4];
      	}
      	if(oppvals[0] == oppvals[1] && oppvals[0] == oppvals[2]){
          highopp = oppvals[0];
        }
        else{
          highopp = oppvals[4];
        }
      	//Get the winner
      	if(highopp > highaip){
      	  System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
      	}
      	else{
      	  System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;
      	}
      }
      else if(aip == 5){
    	//Check high card
      	int[] aipvals, oppvals;
      	int highaip, highopp;
      	aipvals = aiHand.sortHand();
      	oppvals = opponentHand.sortHand();
      	highaip = aipvals[4];
      	highopp = oppvals[4];
      	//checking ace
      	if(highaip == 14){
      	  highaip = aipvals[3];
      	}
      	if(highopp == 14){
      	  highopp = oppvals[3];
      	}
      	//Checking if same or not
      	if(highopp > highaip){
      	  System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
      	}
      	else if (highaip > highopp){
      	  System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;
      	}
      	//Same high card
      	else{
      	  //Get suit of AIP and Opp based on highest card value
          //AIP first
      	  
      	  if(aip == 14){
      	  
      	  }
      	  else if(aip == 13){
      		  
      	  }
      	  else if(aip == 12){
      		  
      	  }
      	  else if(aip == 11){
      		  
      	  }
      	  else if(aip == 10){
      		  
      	  }
      	  else{
      		  
      	  }
      	  //Opponent
      	}
      }
//----- HIGH CARD -----//
      else {
        int[] aipvals, oppvals;
        int highaip, highopp;
        aipvals = aiHand.sortHand();
        oppvals = opponentHand.sortHand();
        highaip = aipvals[4];
        highopp = oppvals[4];
        if(highopp > highaip){
          System.out.println("WINNER: OPPONENT! The cards are: " + this.opponentHand.hand.get(0) + ", " + this.opponentHand.hand.get(1) + ", " + this.opponentHand.hand.get(2) + ", " + this.opponentHand.hand.get(3) + ", " + this.opponentHand.hand.get(4));
          winner = opponentHand;
        }
        else if (highaip > highopp){
          System.out.println("WINNER: AIP! The cards are: " + this.aiHand.hand.get(0) + ", " + this.aiHand.hand.get(1) + ", " + this.aiHand.hand.get(2) + ", " + this.aiHand.hand.get(3) + ", " + this.aiHand.hand.get(4));
          winner = aiHand;	
        }
        //Same Card, Check Suit
        else{
          
        }
      }
    }
    return winner;
  }
  
}
