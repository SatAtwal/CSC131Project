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
	
	public void Finder(String finderName, int finderDeviceID)
	{
		this.finderName = finderName;
		this.finderDeviceID = finderDeviceID;
		location = Tags.getLocation(); 
	}
	
	public String getFinderName()
	{
		return finderName;
	}
	
	public int getfinderDeviceID()
	{
		return finderDeviceID;
	}
}
