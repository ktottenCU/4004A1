package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import main.PokerGame;

public class SwappedWinTests {

//Complex Wins here. This is where suit and highcard matters
  @Test
  public void spadeRFvsHeartRF() {
    PokerGame testGame = new PokerGame("src/cardfile", 56);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void heartRFvsDiamondRF() {
    PokerGame testGame = new PokerGame("src/cardfile", 57);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void diamondRFvsClubRF() {
    PokerGame testGame = new PokerGame("src/cardfile", 58);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void spadeRFvsClubRF() {
    PokerGame testGame = new PokerGame("src/cardfile", 59);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.aiHand);
  }
  
  @Test
  public void spadeSFvsHeartSF(){
    PokerGame testGame = new PokerGame("src/cardfile", 60);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);
  }
  
  @Test
  public void spadeSFvsHigherSF(){
    PokerGame testGame = new PokerGame("src/cardfile", 61);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.aiHand);
  }
  
  @Test
  public void higherFourKind(){
    PokerGame testGame = new PokerGame("src/cardfile", 62);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);  
  }
  
  @Test
  public void higherFullHouse(){
    PokerGame testGame = new PokerGame("src/cardfile", 63);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);  
  }
  
  @Test
  public void higherStraight(){
    PokerGame testGame = new PokerGame("src/cardfile", 64);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.aiHand);  
  }
  
  @Test
  public void higherStraightSuit(){
    PokerGame testGame = new PokerGame("src/cardfile", 65);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);  
  }
  
  @Test
  public void highestCard(){
    PokerGame testGame = new PokerGame("src/cardfile", 66);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);  
  }
  
  @Test
  public void highestCardSuit(){
    PokerGame testGame = new PokerGame("src/cardfile", 67);
    testGame.processBehaviour();
    assertEquals(testGame.determineWinner(), testGame.opponentHand);  
  }
  
}
