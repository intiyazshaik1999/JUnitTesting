package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumbers {

	@Test
	public void test() {
		int result = JUnitFunctions.AddNumbers(56, 12);
		assertEquals(68, result);
	}

}
