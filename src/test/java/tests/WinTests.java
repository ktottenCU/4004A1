package tests;

////////////////////
//
//The Tests for who wins
//
////////////////////

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  SwaplessWinTests.class,
  SwappedWinTests.class
})

public class WinTests {

}
