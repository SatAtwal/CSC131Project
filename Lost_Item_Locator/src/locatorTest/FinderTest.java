package locatorTest;

import Locator.*;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FinderTest {


	@Test
	void testGetFinderDeviceID()
	{
		Tags tag = new Tags(1234, "X: 123 Y: 456 Z: 789", "Iphone", true);
		Finder finder = new Finder(tag);
		assertEquals("getFinderDeviceID()", 1234, finder.getfinderDeviceID());
	}
	
	@Test
	void testGetLocation()
	{
		Tags tag = new Tags(1234, "X: 123 Y: 456 Z: 789", "Iphone", true);
		Finder finder = new Finder(tag);
		assertEquals("getLocation()", "X: 123 Y: 456 Z: 789", Tags.getLocation());
	}
}
