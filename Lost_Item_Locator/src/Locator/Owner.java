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
	
<<<<<<< HEAD
	public void flagLost (boolean itemLost)
=======
	/**
	 * sets item to lost
	 */
	public void flagLost()
>>>>>>> branch 'master' of https://github.com/SatAtwal/CSC131Project.git
	{
		this.itemLost=true;
	}
	
<<<<<<< HEAD
	public boolean getLost (boolean itemLost)
=======
	/**
	 * 
	 * @param itemLost
	 * @return boolean itemLost
	 */
	public boolean getLost()
>>>>>>> branch 'master' of https://github.com/SatAtwal/CSC131Project.git
	{
		return this.itemLost;
<<<<<<< HEAD
=======
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
		
		
	
>>>>>>> branch 'master' of https://github.com/SatAtwal/CSC131Project.git
	}
}