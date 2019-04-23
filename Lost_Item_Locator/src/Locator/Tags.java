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
}

