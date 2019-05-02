package Locator;

/**
 * Class that represents the tag on a device that sends the signal. 
 * @author Daniel and Louis
 */
public class Tags 
{
	private int Id;
	static String location = "38.5461° N, 121.4509° W";
	private boolean status = false;
	
	/**
	 * Constructs a tag
	 * @param finderDeviceID
	 * @param location
	 */
	public Tags(int finderDeviceID, String location, boolean status)
	{
		Id = finderDeviceID;
		Tags.location = location;
		this.status = status;			// false means don't run finder 
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
	 * gets location
	 * @return location
	 */
	public String getLocation()
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
	public void setStatus (boolean newStatus)
	{
		status = newStatus;
	}
}

