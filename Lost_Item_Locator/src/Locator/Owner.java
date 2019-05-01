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
	 * Returns status as lost
	 * @return itemLost
	 */
	public boolean status_Lost()
	{
		return itemLost;
	}
	
	/**
	 * Returns status as found
	 * @return itemFound
	 */
	public boolean status_Found()
	{
		return itemFound;
	}
	
	/**
	 * Indicates item is found, runs when found
	 */
	public void found ()
	{
		System.out.println("\nMy object was found!"
				+ " I just received a notification with"
				+ "its coordinates!");
		
		itemLost = false;
		itemFound = true;
		
		System.out.println("\nitemLost="+ itemLost
							+ "\nitemFound="+ itemFound);
	}
}