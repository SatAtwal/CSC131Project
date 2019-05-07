package locatorTest;
import Locator.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TagsTest {

	

	@Test
	public void testGetId() 
	{
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "IPad", false);
		assertEquals("getId()", 1234, tag1.getId());
	}
	
	@Test
	public void testGetLocation()
	{
		assertEquals("getLocation()", "12.34° N, 456.78° W", Tags.getLocation());
	}

	@Test
	public void testGetDeviceName()
	{
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "IPad", false);
		assertEquals("getDeviceName()", "IPad", tag1.getDeviceName());
	}
	
	@Test
	public void testSetId()
	{
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "IPad", false);
		tag1.setId(4567);
		assertEquals("getId()", 4567, tag1.getId());
	}
	
	@Test
	public void testGetStatus()
	{
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "IPad", true);
		assertEquals("getStatus()", true, tag1.getStatus());
	}
	
	@Test
	public void testSetStatus()
	{
		Tags tag1 = new Tags(1234, "12.34° N, 456.78° W", "IPad", true);
		Owner owner1 = new Owner();
		tag1.setStatus();
		assertEquals("getStatus()", false, tag1.getStatus());
	}
	
}
