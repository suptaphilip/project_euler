package ID_007;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("Result", true, Main.isPrime(199));
	}

}
