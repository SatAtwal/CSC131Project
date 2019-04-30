package Locator;

/**
 * Class that represents the tag on a device that sends the signal. 
 * 
 * @author Daniel and Louis
 */
public class Tags 
{
	private int Id;
	private String name;
	private static String location;
	private boolean status;
	
	/**
	 * gets location
	 * 
	 * @return location
	 */
	public static String getLocation()
	{
		return location;
	}
	
	/**
	 * changes the ID of the Tag
	 * 
	 * @param newID
	 */
	public void setId(int newID)
	{
		Id = newID;
	}
	
	/**
	 * changes the name registered with the tag
	 * 
	 * @param newName
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	
	/**
	 * changes the status of the tag
	 * 
	 * @param newStatus
	 */
	public void setStatus (boolean newStatus)
	{
		status = newStatus;
	}
}

