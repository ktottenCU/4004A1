package Tests;
////////////////////
//
//Tests for Initial State
//
////////////////////

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;

import Poker.*;
import junit.*;

//Class for all the tests
public class InitialTests{
  
  @Test
  public void testParser(){
  //Test to make sure the parser works
    Parser parse = new Parser();
    ArrayList<ArrayList<String>> cards;
    try {
      cards = parse.getCards("C:/Users/ktotten/workspace/4004A1/src/cardfile");
      assertEquals(cards.get(0).size(), 52);
    } 
    catch (IOException e) {
      fail("Read Failed: " + e);
    }          
  }
    
  @Test
  public void testInitialCards() {
    //Tests to make sure proper cards grabbed for AI and Player hands
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 0);
    assertEquals(testGame.aiHand.hand.size(), 5);
    assertEquals(testGame.playerHand.hand.size(), 5);
    assertEquals(testGame.playerHand.hand.get(0), "SA");
    assertEquals(testGame.playerHand.hand.get(1), "S2");
    assertEquals(testGame.playerHand.hand.get(2), "S3");
    assertEquals(testGame.playerHand.hand.get(3), "S4");
    assertEquals(testGame.playerHand.hand.get(4), "S5");
    assertEquals(testGame.aiHand.hand.get(0), "S6");
    assertEquals(testGame.aiHand.hand.get(1), "S7");
    assertEquals(testGame.aiHand.hand.get(2), "S8");
    assertEquals(testGame.aiHand.hand.get(3), "S9");
    assertEquals(testGame.aiHand.hand.get(4), "S10");

  }
  
  

  

  
}
