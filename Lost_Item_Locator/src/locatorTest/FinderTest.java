package locatorTest;

import Locator.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FinderTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		
		
	}


	@Test
	void testGetFinderDeviceID() {
		Tags tag = new Tags(1234, "X: 123 Y: 456 Z: 789", true);
		Finder finder = new Finder(tag);
		assertEquals("getFinderDeviceID()", 1234, finder.getfinderDeviceID());
	}

}
