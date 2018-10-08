package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.PokerGame;

public class SwaplessWinTests {

  //AIP loses all games due to no swap and cardfile setup
  
  @Test
  public void pairOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 11);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void twoPairOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 12);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void twoPairOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 13);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 14);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 15);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 16);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverThreeKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 17);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 18);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 19);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 20);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverStraight() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 21);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverThreeKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 22);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 23);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 24);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 25);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverFlush() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 26);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverStraight() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 27);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverThreeKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 28);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 29);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 30);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 31);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverFull() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 32);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverFlush() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 33);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverStraight() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 34);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverThreeKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 35);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 36);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 37);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 38);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFourKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 39);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFullHouse() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 40);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFlush() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 41);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverStraight() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 42);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverThreeKind() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 43);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverTwoPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 44);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverPair() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 45);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverHigh() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 46);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
}
