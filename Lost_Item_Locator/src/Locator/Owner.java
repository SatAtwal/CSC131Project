package Locator;

/** 
 * This class simulates the behaviors of the owner of the lost
 * device. It initiates the application events and signals termination
 * after the object is found.
 * @author Tomas Albor
 */
public class Owner
{
	private static boolean itemLost;
	
	/**
	 * constructor
	 */
	public Owner()
	{
		itemLost = false;
	}
	
	/**
	 * sets item to lost
	 */
	public void flagLost()
	{
		itemLost=true;
	}
	
	public static boolean getStatus()
	{
		return itemLost;
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
	 * Indicates item is found
	 */
	public static void found ()
	{
		itemLost = false;
	}
	
	/**
	 * notifies owner that their item is found
	 * @return
	 */
	public String notifyOwner()
	{
		String notification = "The object was found! The owner has been notified of its coordinates!";
		return notification;
	}
}