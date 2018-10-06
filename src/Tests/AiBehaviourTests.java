package Tests;
////////////////////
//
//Test for the AI behaviour and card swapping
//
////////////////////

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Poker.PokerGame;
<<<<<<< HEAD
  @RunWith(Suite.class)
  @Suite.SuiteClasses({
    SwapZeroTests.class,
    SwapOneTests.class,
    SwapTwoTests.class,
    SwapThreeTests.class
  })
  
public class AiBehaviourTests {
}  
=======

public class AiBehaviourTests {
  
  @Test
  public void testSwapNone() {
    //Tests to make sure AI doesnt swap any cards
    //happens if AI has: Royal Flush, Straight Flush, Four-of-a-Kind, Full House, Flush, Straight
	//Need more swap tests: One for Royal, one for High and low straight (and straight flush), full house with all numbers(?), 4 of a kind for all numbers(?)
	  
	PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 2);
    ArrayList<String> pre = testGame.aiHand.hand;
    testGame.processBehaviour();
    ArrayList<String> post = testGame.aiHand.hand;
	assertEquals(pre.get(0), post.get(0));
	assertEquals(pre.get(1), post.get(1));
	assertEquals(pre.get(2), post.get(2));
	assertEquals(pre.get(3), post.get(3));
	assertEquals(pre.get(4), post.get(4));
  }
  
  @Test
  public void testSwapOne(){
    //Tests to make sure AI swaps cards properly
	//Swapped if 1 away from flush, fullhouse, straight, straightflush, 4 of a kind (tho also check for full house)
	PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile", 1);
	ArrayList<String> pre = testGame.aiHand.hand;
	testGame.processBehaviour();
	ArrayList<String> post = testGame.aiHand.hand;
	assertEquals((post.contains("S8") && post.contains("SA") && post.contains("S4") && post.contains("SJ") && post.contains("S3")), true);
  }
  
  @Test
  public void testSwapTwo(){
    //Tests to make sure AI swaps cards properly
    fail();
  }
  
  @Test
  public void testSwapThree() {
    //Tests to make sure AI swaps cards properly
    fail();
  }
}
>>>>>>> 438ea7c8663b3c481df4a4776d838c3cf91d0c7c
