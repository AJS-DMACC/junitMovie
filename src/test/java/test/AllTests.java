package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//this class is used to test all JUnit test classes
@RunWith(Suite.class)
@SuiteClasses({ TestMovieLogic.class, TestTheaterLogic.class })
public class AllTests {

}
