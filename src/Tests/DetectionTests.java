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
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    assertEquals(testGame.aiHand.hasStraightFlush(), true);
  }
  
  @Test
  public void outOrderStraightFlushTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 2);
    assertEquals(testGame.aiHand.hasStraightFlush(), true);
  }
  
  @Test
  public void inOrderFourKindTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 3);
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  @Test
  public void outOrderFourKindTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 3);
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  @Test
  public void inOrderFullHouseTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 4);
    assertEquals(testGame.aiHand.hasFullHouse(), true);
  }
  
  @Test
  public void outOrderFullHouseTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 4);
    assertEquals(testGame.aiHand.hasFullHouse(), true);
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
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
  @Test
  public void outOrderStraightTest() {
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 2);
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
}
