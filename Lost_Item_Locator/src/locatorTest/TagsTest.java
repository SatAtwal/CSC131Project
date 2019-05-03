package locatorTest;
import Locator.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TagsTest {


	@Test
	void testGetId() {
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "Ipad", false);
		assertEquals("getId()", 1234, tag1.getId());
	}

}
