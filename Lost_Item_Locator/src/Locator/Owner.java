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
	
	
	public Owner()
	{
		this.itemLost = false;
		this.itemFound = false;
	}
	
	public void flagLost (boolean itemLost)
	{
		this.itemLost=true;
	}
	
	public boolean getLost (boolean itemLost)
	{
		return this.itemLost;
	}
	
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