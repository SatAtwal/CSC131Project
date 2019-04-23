package Locator;

/**
 * 
 * @author Daniel and Louis
 *
 */
public class Tags 
{
	private int Id;
	private String name;
	private static String location;
	private boolean status;
	
	public static String getLocation()
	{
		return location;
	}
	
	public void setId(int newID)
	{
		Id = newID;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setStatus (boolean newStatus)
	{
		status = newStatus;
	}
}

