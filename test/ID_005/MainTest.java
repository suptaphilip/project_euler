package ID_005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		int[] temp = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals("Result", 2520, Main.calculateMin(temp));
	}

	@Test
	public void testPrime() {
		assertEquals("Result", 41, Main.largestPrime(82));
	}
}
