package Tests;
////////////////////
//
//Tests for Swapping 2 cards
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.PokerGame;

public class SwapTwoTests {

  @Test
  public void threeKindSwapTwoTest() {
    PokerGame testGame = new PokerGame("src/cardfile", 10);
    assertEquals(testGame.aiHand.hasThreeKind(), true);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  @Test
  public void threeSuitSwapTwoTest() {
    fail();
  }
}
