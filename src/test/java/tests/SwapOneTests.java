package tests;

////////////////////
//
//Tests for Swapping 1 card
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import poker.PokerGame;


public class SwapOneTests {

  @Test
  public void royalFlushOneSwapTest() {
    fail();
  }
  
  @Test
  public void straightFlushOneSwapTest() {
    fail();
  }
  
  @Test
  public void flushOneSwapTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 8);
    assertEquals(testGame.aiHand.hasFlush(), false);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void straightOneSwapTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 9);
    assertEquals(testGame.aiHand.hasStraight(), false);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
  @Test
  public void twoPairOneSwapTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 6);
    assertEquals(testGame.aiHand.hasTwoPair(), true);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasFullHouse(), true);
  }
  
}
