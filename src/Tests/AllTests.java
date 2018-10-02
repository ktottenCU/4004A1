package Tests;
////////////////////
//
//Runs all the tests
//
////////////////////

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.*;
import Poker.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  InitialTests.class,
  AiBehaviourTests.class,
  WinTests.class
})

public class AllTests {
}