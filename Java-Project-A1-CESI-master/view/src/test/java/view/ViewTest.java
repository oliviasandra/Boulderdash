package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;

/**
 * The ViewTest class.
 * @author group 12 olivia serge yves-alexis
 * @version 1.0
 *
 */
public class ViewTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	 * Check for each specific touch the player can use that the result is the right one.
	 */
	@Test
	public void testControllerOrderReturn() {
		
		final ControllerOrder expectedA = ControllerOrder.A;
		
		assertEquals(expectedA, View.keyCodeToControllerOrder(KeyEvent.VK_A));
		
		final ControllerOrder expectedB = ControllerOrder.B;
		
		assertEquals(expectedB, View.keyCodeToControllerOrder(KeyEvent.VK_B));
		
		final ControllerOrder expectedC = ControllerOrder.C;
		
		assertEquals(expectedC, View.keyCodeToControllerOrder(KeyEvent.VK_C));
		
		final ControllerOrder expectedD = ControllerOrder.D;
		
		assertEquals(expectedD, View.keyCodeToControllerOrder(KeyEvent.VK_D));
		
		final ControllerOrder expectedNothing = ControllerOrder.nothing;
		
		assertEquals(expectedNothing, View.keyCodeToControllerOrder(KeyEvent.VK_F));
		
	}

}
