package Locator;

public class Finder 
{
	private String finderName;
	private int finderDeviceID;
	private Location location;
	
	public void Finder(String finderName, int finderDeviceID)
	{
		this.finderName = finderName;
		this.finderDeviceID = finderDeviceID;
	}
	
	public String getFinderName()
	{
		return finderName;
	}
	
	public int getfinderDeviceID()
	{
		return finderDeviceID;
	}
	
	public double getLongitude()
	{
		return longitude;
	}
	
	public double getLatitude()
	{
		return latitude;
	}
}
