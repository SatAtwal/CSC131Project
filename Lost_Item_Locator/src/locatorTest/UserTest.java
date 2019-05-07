package locatorTest;
import Locator.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	public void testGetID() 
	{
		Owner owner1 = new Owner();
		User user1 = new User("Bob", 123, owner1);
		assertEquals("get_id()", 123, user1.get_id());
	}
	
	@Test
	public void testGetName() 
	{
		Owner owner1 = new Owner();
		User user1 = new User("Bob", 123, owner1);
		assertEquals("get_name()", "Bob", User.get_name());
	}
	
	@Test
	public void testGotLost() 
	{
		Owner owner1 = new Owner();
		User user1 = new User("Bob", 123, owner1);
		user1.gotLost();
		assertEquals("getLost()", true, owner1.statusLost());
	}
	
	@Test
	public void testLostStatus() 
	{
		Owner owner1 = new Owner();
		User user1 = new User("Bob", 123, owner1);
		user1.lostStatus();
		assertEquals("lostStatus()", false, user1.lostStatus());
	}
}
	
	

