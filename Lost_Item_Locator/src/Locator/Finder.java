package Locator;

/**
 * The device that finds the lost object
 * @author Satjyot and Curtis
 */
public class Finder
{
	private int finderDeviceID;
	private static String location;
	
	/**
	 * Constructs using Tags Object
	 * @param X
	 */
	public Finder(Tags X)
	{
		finderDeviceID = Tags.getId();
		location = Tags.getLocation(); 
	}
	
	/**
	 * Returns ID
	 * @return finderDeviceID
	 */
	public int getfinderDeviceID()
	{
		return finderDeviceID;
	}
	
	/**
	 * Returns location
	 * @return location
	 */
	public static String getLocation()
	{
		return location;
	}
}
