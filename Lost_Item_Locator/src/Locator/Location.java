package Locator;

public class Location 
{
	private double latitude;
	private double longitude;
	
	public Location(double latitude, double longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getLocation()
	{
		return latitude + ", " + longitude;
	}
}
