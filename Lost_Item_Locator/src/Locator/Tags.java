package Locator;

/**
 * Class that represents the tag on a device that sends the signal. 
 * @author Daniel and Louis
 */
public class Tags 
{
	private int Id;
	private static String location = "38.5461° N, 121.4509° W";
	private String deviceName = "Iphone";
	private boolean lostStatus;
	
	/**
	 * Constructs a tag
	 * @param finderDeviceID
	 * @param location
	 */
	public Tags(int finderDeviceID, String location, String deviceName, boolean lostStatus)
	{
		Id = finderDeviceID;
		Tags.location = location;
		this.lostStatus = lostStatus;
		this.deviceName = deviceName;
	}
	
	/**
	 * gets ID
	 * @return Id
	 */
	public int getId()
	{
		return Id;
	}
	
	/**
	 * gets ID
	 * @return deviceName
	 */
	public String getDeviceName()
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
	 * returns status of tag
	 * @return lostStatus
	 */
	public boolean getStatus()
	{
		return lostStatus;
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

