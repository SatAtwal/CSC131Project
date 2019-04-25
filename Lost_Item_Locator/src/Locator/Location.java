package Locator;
// Don't need ths anymore

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
	 * gets latitude
	 * 
	 * @return latitude
	 */
	public String getLatitude()
	{
		return latitude;
	}
	
	/**
	 * gets longitude
	 * 
	 * @return longitude
	 */
	public String getLongitude()
	{
		return longitude;
	}
	
	/**
	 * gets Location
	 * 
	 * @return Location object
	 */
	public Location getLocation()
	{
		return new Location(latitude, longitude);
	}
}
