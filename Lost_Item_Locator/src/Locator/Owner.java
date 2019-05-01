package Locator;

/** 
 * This class simulates the behaviors of the owner of the lost
 * device. It initiates the application events and signals termination
 * after the object is found.
 * @author Tomas Albor
 */
public class Owner
{
	private boolean itemLost;
	private boolean itemFound;
	
	/**
	 * constructor
	 */
	public Owner()
	{
		itemLost = false;
		itemFound = false;
	}
	
	/**
	 * sets item to lost
	 */
	public void flagLost()
	{
		itemLost=true;
	}
	
	/**
	 * Returns if item is lost
	 * @return itemLost
	 */
	public boolean status_Lost()
	{
		return itemLost;
	}
	
	/**
	 * Returns if item is found
	 * @return itemFound
	 */
	public boolean status_Found()
	{
		return itemFound;
	}
	
	/**
	 * Indicates item is found
	 */
	public void found ()
	{
		itemLost = false;
		itemFound = true;
	}
	
	/**
	 * notifies owner that their item is found
	 * @return
	 */
	public String notifyOwner()
	{
		String notification = "My object was found! I just recieved a notification with its coordinates!";
		return notification;
	}
}