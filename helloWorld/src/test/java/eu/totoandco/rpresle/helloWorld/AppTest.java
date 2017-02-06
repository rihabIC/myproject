package eu.totoandco.rpresle.helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	/**
	 * Example of a working test
	 */
	@Test
	public void should_work () {
		assertTrue(true);
	}
	
	/**
	 * Example of a  failing test
	 */
	@Test
	public void should_not_work () {
		assertTrue(false);
	}
	
	/**
	 * Example of Coverage test
	 */
	@Test
	public void should_return_true () {
		assertTrue(App.coverageMethod(true));
	}
}
