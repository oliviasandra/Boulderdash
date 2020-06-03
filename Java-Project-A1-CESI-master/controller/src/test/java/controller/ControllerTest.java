package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The ControllerTest class.
 * @author group 12 olivia serge yves-alexis
 * @version 1.0
 *
 */
public class ControllerTest {
	
	/** The controller for the test */
	private static Controller controller;

	/**
	 * Instantiates a new controller for all tests.
	 * @throws Exception in case of an exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		controller = new Controller();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test to verify the correct message is obtained.
	 */
	@Test
	public void testMessagePrinted() {
		
		final String expectedMessage = "Welcome to BoulderBash ! Press any key to start the game.\n"
				+ " \n Press 1, 2, 3, 4 or 5 to change the map.\n"
				+ " Use A, B, C, D to move the character.";
		
		assertEquals(expectedMessage, controller.getMessageToShow());
		
	}

}
