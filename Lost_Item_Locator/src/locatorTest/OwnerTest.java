package locatorTest;
import Locator.*;


import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class OwnerTest {

	
	@Test
	public void testFlagLost() 
	{
		Owner owner1 = new Owner();
		owner1.flagLost();
		assertEquals("flagLost()", true, Owner.getStatus());
	}
	
	@Test
	public void testGetStatus()
	{
		Owner owner1 = new Owner();
		assertEquals("getStatus()", false, Owner.getStatus());
	}
	
	@Test
	public void testFound()
	{
		Owner owner1 = new Owner();
		owner1.flagLost();
		Owner.found();
		assertEquals("getStatus()", false, Owner.getStatus());
	}
	
	@Test
	public void testNotifyOwner() 
	{
		Owner owner1 = new Owner();
		assertEquals("notifyOwner()", "The object was found! The owner has been notified of its coordinates!", owner1.notifyOwner());
	}

}
