package tests;

////////////////////
//
//Runs all the tests
//
////////////////////

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({
  InitialTests.class,
  DetectionTests.class,
  AiBehaviourTests.class,
  WinTests.class
})

public class AllTests {
}