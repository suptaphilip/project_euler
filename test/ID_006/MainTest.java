package ID_006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("Result", 385, Main.SumofSquares(10));
	}

	@Test
	public void testTwo() {
		assertEquals("Result", 3025, Main.SquareofSum(10));
	}

}
