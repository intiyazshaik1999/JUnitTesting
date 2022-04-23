package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrings {

	@Test
	public void test() {
		String result = JUnitFunctions.AddStrings("Shaik ", "Intiyaz");
		assertEquals("Shaik Intiyaz", result);
	}

}
