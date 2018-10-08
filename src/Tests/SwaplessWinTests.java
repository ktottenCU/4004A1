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
}
