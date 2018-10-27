package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import poker.PokerGame;


public class SwaplessWinTests {

  //AIP loses all games due to no swap and cardfile setup
  
  @Test
  public void pairOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 11);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void twoPairOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 12);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void twoPairOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 13);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 14);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 15);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void threeKindOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 16);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 17);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 18);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 19);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 20);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverStraight() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 21);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 22);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 23);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 24);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void flushOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 25);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverFlush() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 26);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverStraight() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 27);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 28);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 29);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 30);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fullOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 31);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverFull() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 32);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverFlush() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 33);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverStraight() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 34);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 35);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 36);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 37);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void fourKindOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 38);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFourKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 39);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFullHouse() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 40);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverFlush() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 41);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverStraight() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 42);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 43);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 44);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 45);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void straightFlushOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 46);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverStraightFlush() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 47);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverFourKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 48);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverFullHouse() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 49);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverFlush() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 50);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverStraight() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 51);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverThreeKind() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 52);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverTwoPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 53);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverPair() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 54);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void royalFlushOverHigh() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 55);
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  
}
