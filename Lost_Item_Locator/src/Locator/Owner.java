package Locator;

/** 
 * 
 * This class simulates the behaviors of the owner of the lost
 * device.  It initiates the application events and signals termination
 * after the object is found.
 * 
 * @author Tomas Albor
 * 
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
		this.itemLost = false;
		this.itemFound = false;
	}
	
	/**
	 * sets item to lost
	 */
	public void flagLost()
	{
		this.itemLost=true;
	}
	
	/**
	 * 
	 * @param itemLost
	 * @return boolean itemLost
	 */
	public boolean getLost()
	{
		return this.itemLost;
	}
	
	/**
	 * Indicates item is found
	 */
	public void found ()
	{
		System.out.println("\nMy object was found!"
				+ " I just received a notification with"
				+ "its coordinates!");
		
		this.itemLost = false;
		this.itemFound = true;
		
		System.out.println("\nitemLost="+this.itemLost
							+ "\nitemFound="+this.itemFound);
		
		
	
	}
}