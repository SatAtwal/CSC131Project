package Locator;

/**
 * Class that represents the tag on a device that sends the signal. 
 * @author Daniel and Louis
 */
public class Tags 
{
	private static int Id;
	static String location = "38.5461° N, 121.4509° W";
	static String deviceName = "Iphone";
	static boolean lostStatus;
	
	/**
	 * Constructs a tag
	 * @param finderDeviceID
	 * @param location
	 */
	public Tags(int finderDeviceID, String location, String deviceName, boolean lostStatus)
	{
		Id = finderDeviceID;
		Tags.location = location;
		lostStatus = Owner.getStatus();			// false means don't run finder 
		Tags.deviceName = deviceName;
	}
	
	/**
	 * gets ID
	 * @return Id
	 */
	public static int getId()
	{
		return Id;
	}
	
	/**
	 * gets ID
	 * @return deviceName
	 */
	public static String getdeviceName()
	{
		return deviceName;
	}
	
	/**
	 * gets location
	 * @return location
	 */
	public static String getLocation()
	{
		return location;
	}
	
	/**
	 * changes the ID of the Tag
	 * @param newID
	 */
	public void setId(int newID)
	{
		Id = newID;
	}
	
	
	/**
	 * changes the status of the tag
	 * @param newStatus
	 */
	public void setStatus ()
	{
		lostStatus = Owner.getStatus();
	}
}

