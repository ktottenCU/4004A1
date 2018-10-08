package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.PokerGame;

public class SwaplessWinTests {

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
  
}
