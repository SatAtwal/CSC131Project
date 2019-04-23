package Locator;

/**
 * Creates a Location class to store coordinates
 * 
 * @author Satjyot and Curtis
 */
public class Location 
{
	private String latitude;
	private String longitude;
	
	/**
	 * Constructor to create location object
	 * 
	 * @param latitude
	 * @param longitude
	 */
	public Location(String latitude, String longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Returns latitude and longitude in String format
	 * 
	 * @return latitude, longitude
	 */
	public String getLocation()
	{
		return latitude + ", " + longitude;
	}
}
