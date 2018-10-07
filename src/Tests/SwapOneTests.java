package Tests;
////////////////////
//
//Tests for Swapping 1 card
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.PokerGame;

public class SwapOneTests {

  @Test
  public void royalFlushOneSwapTest() {
    fail();
  }
  
  @Test
  public void straightFlushOneSwapTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 7);
    assertEquals(testGame.aiHand.hand.get(0), "S6");
    assertEquals(testGame.aiHand.hand.get(1), "S7");
    assertEquals(testGame.aiHand.hand.get(2), "H2");
    assertEquals(testGame.aiHand.hand.get(3), "S9");
    assertEquals(testGame.aiHand.hand.get(4), "S10");
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hand.get(0), "S6");
    assertEquals(testGame.aiHand.hand.get(1), "S7");
    assertEquals(testGame.aiHand.hand.get(2), "S8");
    assertEquals(testGame.aiHand.hand.get(3), "S9");
    assertEquals(testGame.aiHand.hand.get(4), "S10");
  }
  
  @Test
  public void flushOneSwapTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 8);
    assertEquals(testGame.aiHand.hasFlush(), false);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void straightOneSwapTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 9);
    assertEquals(testGame.aiHand.hasStraight(), false);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
}
