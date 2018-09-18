import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;
import junit.*;

//Class for all the tests
public class TestSuite{
  
  @Test
  public void testInitialCards() {
     
  }
  
  @Test
  public void testAiInitialCards() {
     
  }
  
  @Test
  public void testParser(){
	  //Test to make sure the parser works
	  Parser parse = new Parser();
	  ArrayList<String> cards = parse.getCards("cardfile");
	  assertEquals(cards.size(), 13);
	  	   
  }
  
}
