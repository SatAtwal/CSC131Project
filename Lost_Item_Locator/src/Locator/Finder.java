package Locator;

/**
 * 
 * @author Satjyot and Curtis
 *
 */
public class Finder
{
	private String finderName;
	private int finderDeviceID;
	private String location;
	
	/**
	 * Constructor to create a Finder
	 * 
	 * @param finderName
	 * @param finderDeviceID
	 */
	public void Finder(String finderName, int finderDeviceID)
	{
		this.finderName = finderName;
		this.finderDeviceID = finderDeviceID;
		location = Tags.getLocation(); 
	}
	
	/**
	 * gets finderName
	 * 
	 * @return finderName
	 */
	public String getFinderName()
	{
		return finderName;
	}
	
	/**
	 * gets finderDeviceID
	 * 
	 * @return finderDeviceID
	 */
	public int getfinderDeviceID()
	{
		return finderDeviceID;
	}
	
	/**
	 * gets Location
	 * 
	 * @return location
	 */
	public String getLocation()
	{
		return location;
	}
}
