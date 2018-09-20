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
    //Tests to make sure proper cards grabbed
	fail();
  }
  
  @Test
  public void testAiInitialCards() {
    //Tests to make sure AI gets proper first cards  
	fail();
  }
  
  @Test
  public void testAiSwapCards(){
    //Tests to make sure AI swaps cards properly
	fail();
  }
  

  
}
