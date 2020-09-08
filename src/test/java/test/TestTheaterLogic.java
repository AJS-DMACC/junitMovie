package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.*;

//this class uses 2 JUnit testMethods to test the theater class
public class TestTheaterLogic {
	Theater testTheater;
	Movie testMovie;
	
	@Before
	public void setUp() throws Exception {
		testTheater = new Theater(100);
		testMovie = new Movie("Avengers:Endgame", "181 minuets", 135);
	}

	@Test
	public void testRunMovie() {
		String message = "Now Playing Avengers:Endgame";
		assertEquals(message, testTheater.RunMovie(testMovie));
	}
	
	@Test
	public void testEnoughSeats() {
		assertFalse(testTheater.isEnoughSeats(testMovie));		
	}
}
