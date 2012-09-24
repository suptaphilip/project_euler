package ID_002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("Result", 21, Main.fib(8));
	}

}
