package util;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

	
	@Test
	public void testPowerOperator() {
//		assertEquals( 8, 2 ^ 3);
		assertEquals( 8, Math.pow(2,3), 0);
	}
	
	@Test
	public void testIntegerDvision() {
//		assertEquals( 0.8, 4 / 5, 0);
		assertEquals( 0.8, 4.0 / 5, 0);
	}
	
	@Test
	public void testStringComparison() {
//		assertTrue("dmit2015" == "DMIT2015");
		assertTrue("dmit2015" == "dmit2015");
	}

// running this without an exception checker will fail.
	@Test(expected=ArithmeticException.class)
	public void testForException() {
		assertEquals( 0, 3 / 0 );
	}
}
