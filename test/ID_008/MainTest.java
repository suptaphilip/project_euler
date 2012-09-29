package ID_008;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		int[] test = new int[] { 9, 9, 9, 9, 9, 1, 1, 1, 1, 1 };
		assertEquals("Result", 59049, Main.MultiplyRuns(test));
	}

}
