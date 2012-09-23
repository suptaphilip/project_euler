package ID_003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("Result", 31, Main.getPrimeFact(62));
	}

}
