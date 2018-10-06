package Tests;
////////////////////
//
//Tests to see if card hands detect what they have
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.PokerGame;

public class DetectionTests {

  @Test
  public void inOrderRoyalFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    assertEquals(testGame.aiHand.hasRoyalFlush(), true);
  }
  
  @Test
  public void outOrderRoyalFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 2);
    assertEquals(testGame.aiHand.hasRoyalFlush(), true);
  }
  
  @Test
  public void inOrderStraightFlushTest() {
    fail();
  }
  
  @Test
  public void outOrderStraightFlushTest() {
    fail();
  }
  
  @Test
  public void inOrderFourKindTest() {
    fail();
  }
  
  @Test
  public void outOrderFourKindTest() {
    fail();
  }
  
  @Test
  public void inOrderFullHouseTest() {
    fail();
  }
  
  @Test
  public void outOrderFullHouseTest() {
    fail();
  }
  
  @Test
  public void inOrderFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void outOrderFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 2);
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void inOrderStraightTest() {
    fail();
  }
  
  @Test
  public void outOrderStraightTest() {
    fail();
  }
  
}
