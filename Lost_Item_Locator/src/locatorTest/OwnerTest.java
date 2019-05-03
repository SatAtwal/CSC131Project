package locatorTest;
import Locator.*;


import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class OwnerTest {

	
	@Test
	void testFlagLost() 
	{
		Owner owner1 = new Owner();
		owner1.flagLost();
		assertEquals("flagLost()", true, Owner.getStatus());
	}
	
	@Test
	void testGetStatus()
	{
		Owner owner1 = new Owner();
		assertEquals("getStatus()", false, Owner.getStatus());
	}
	
	@Test
	void testFound()
	{
		Owner owner1 = new Owner();
		owner1.flagLost();
		Owner.found();
		assertEquals("getStatus()", false, Owner.getStatus());
	}
	
	@Test
	void testNotifyOwner() 
	{
		Owner owner1 = new Owner();
		assertEquals("notifyOwner()", "The object was found! The owner has been notified of its coordinates!", owner1.notifyOwner());
	}

}
