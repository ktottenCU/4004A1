import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;
import junit.*;

//Class for all the tests
public class TestSuite{
  
  @Test
  public void testParser(){
  //Test to make sure the parser works
	Parser parse = new Parser();
	ArrayList<String> cards;
	try {
	  cards = parse.getCards("C:/Users/ktotten/workspace/4004A1/src/cardfile");
	  assertEquals(cards.size(), 52);
	} 
	catch (IOException e) {
	  fail("Read Failed: " + e);
	}	  	   
  }
	
  @Test
  public void testInitialCards() {
    //Tests to make sure proper cards grabbed for AI and Player hands
    PokerGame testGame = new PokerGame("C:/Users/ktotten/workspace/4004A1/src/cardfile");
    assertEquals(testGame.aiHand.hand.size(), 5);
    assertEquals(testGame.playerHand.hand.size(), 5);
    assertEquals(testGame.playerHand.hand.get(0), "SA");
    assertEquals(testGame.playerHand.hand.get(1), "S2");
    assertEquals(testGame.playerHand.hand.get(2), "S3");
    assertEquals(testGame.playerHand.hand.get(3), "S4");
    assertEquals(testGame.playerHand.hand.get(4), "S5");
    assertEquals(testGame.aiHand.hand.get(0), "S6");
    assertEquals(testGame.aiHand.hand.get(1), "S7");
    assertEquals(testGame.aiHand.hand.get(2), "S8");
    assertEquals(testGame.aiHand.hand.get(3), "S9");
    assertEquals(testGame.aiHand.hand.get(4), "S10");

  }
  
  
  @Test
  public void testAiSwapCards(){
    //Tests to make sure AI swaps cards properly
	fail();
  }
  

  
}
