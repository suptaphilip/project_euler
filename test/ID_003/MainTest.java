package ID_003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ID_001.Main;

public class MainTest {

	@Test
	public void test() {
		assertEquals("Result", 1, Main.sum(10));
	}

}
