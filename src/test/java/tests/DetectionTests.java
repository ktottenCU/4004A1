package tests;

////////////////////
//
//Tests to see if card hands detect what they have
//
////////////////////

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import poker.PokerGame;

public class DetectionTests {

  //AI Hand Tests
  
  @Test
  public void inOrderRoyalFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasRoyalFlush(), true);
  }
  
  @Test
  public void outOrderRoyalFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 2);
    assertEquals(testGame.aiHand.hasRoyalFlush(), true);
  }
  
  @Test
  public void failRoyalFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 3);
    assertEquals(testGame.aiHand.hasRoyalFlush(), false);
  }
  
  @Test
  public void inOrderStraightFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasStraightFlush(), true);
  }
  
  @Test
  public void outOrderStraightFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 2);
    assertEquals(testGame.aiHand.hasStraightFlush(), true);
  }
  
  @Test
  public void failStraightFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 3);
    assertEquals(testGame.aiHand.hasStraightFlush(), false);
  }
  
  @Test
  public void inOrderFourKindTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 3);
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  @Test
  public void outOrderFourKindTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 3);
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  @Test
  public void failFourKindTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasFourOfAKind(), false);
  }
  
  @Test
  public void inOrderFullHouseTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 4);
    assertEquals(testGame.aiHand.hasFullHouse(), true);
  }
  
  @Test
  public void outOrderFullHouseTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 4);
    assertEquals(testGame.aiHand.hasFullHouse(), true);
  }
  
  @Test
  public void failFullHouseTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasFullHouse(), false);
  }
  
  @Test
  public void inOrderFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void outOrderFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 2);
    assertEquals(testGame.aiHand.hasFlush(), true);
  }
  
  @Test
  public void failFlushTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 4);
    assertEquals(testGame.aiHand.hasFlush(), false);
  }
  
  @Test
  public void inOrderStraightTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 1);
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
  @Test
  public void outOrderStraightTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 2);
    assertEquals(testGame.aiHand.hasStraight(), true);
  }
  
  @Test
  public void failStraightTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 4);
    assertEquals(testGame.aiHand.hasStraight(), false);
  }
  
  @Test
  public void threeKindTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 10);
    assertEquals(testGame.aiHand.hasThreeKind(), true);
  }
  
  @Test
  public void twoPairTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 6);
    assertEquals(testGame.aiHand.hasTwoPair(), true);
  }
  
  @Test
  public void pairTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 11);
    assertEquals(testGame.opponentHand.hasPair(), true);
  }
  
  //Independence Tests for hands
  
  @Test
  public void bothStraightTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 0);
    assertEquals(testGame.aiHand.hasStraight(), true);
    assertEquals(testGame.opponentHand.hasStraight(), true);

  }
  
  @Test
  public void neitherStraightTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 3);
    assertEquals(testGame.aiHand.hasStraight(), false);
    assertEquals(testGame.opponentHand.hasStraight(), false);
  }
  
  @Test
  public void oppStraightAiNoTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 5);
    assertEquals(testGame.aiHand.hasStraight(), false);
    assertEquals(testGame.opponentHand.hasStraight(), true);
  }
  
  @Test
  public void independenceDetectionTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 10);
    assertEquals(testGame.aiHand.hasThreeKind(), true);
    testGame.processBehaviour();
    assertEquals(testGame.aiHand.hasFourOfAKind(), true);
  }
  
  //Part Hand Tests
  
  @Test
  public void threeSuitTest() {
    PokerGame testGame = new PokerGame("src/test/java/cardfile", 65);
    assertEquals(testGame.aiHand.hasThreeSuit(), true);
  }
  
  @Test
  public void oneOffRoyalTest(){
	PokerGame testGame = new PokerGame("src/test/java/cardfile", 66);
	int val = testGame.aiHand.oneOffRoyalFlush();
    assertEquals(val >= 0, true);
  }
  
}
