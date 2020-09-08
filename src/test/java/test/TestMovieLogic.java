package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Movie;

//this class uses 2 JUnit tests to test the movie class
public class TestMovieLogic {
	Movie testMovie;
	
	@Before
	public void setUp() throws Exception {
		testMovie = new Movie();
	}

	@Test
	public void testTitleSet() {
		String title = "War Horse";
		testMovie.setTitle(title);
		assertNotNull(testMovie.getTitle());
	}
	
	@Test
	public void testTimeNull() {
		assertNull(testMovie.getRunTime());
	}

}
