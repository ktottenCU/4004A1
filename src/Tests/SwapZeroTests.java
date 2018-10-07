package Tests;
////////////////////
//
//Tests for Swapping 0 Cards
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Poker.CardHand;
import Poker.PokerGame;

public class SwapZeroTests {
  //Detecting Royal Flush, Straight Flush, Four of a Kind, Full House, Flush and Straight
  
  @Test
  public void RoyalFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
  
  @Test
  public void straightFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
  
  @Test
  public void fourKindTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 3);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
  
  @Test
  public void fullHouseTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 4);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
  
  @Test
  public void flushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
  
  @Test
  public void straightTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    CardHand pre = testGame.aiHand;
    testGame.processBehaviour();
    CardHand post = testGame.aiHand;
    assertEquals((pre.hand.get(0) == post.hand.get(0) && pre.hand.get(1) == post.hand.get(1) && pre.hand.get(2) == post.hand.get(2) && pre.hand.get(3) == post.hand.get(3)&& pre.hand.get(4) == post.hand.get(4)), true);
  }
}
