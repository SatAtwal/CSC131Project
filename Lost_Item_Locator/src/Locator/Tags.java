package Locator;


public class Tags 
{
	private int Id;
	private int x_coord;
	private int y_coord;
	private String name;
	
	protected void setId(int newID)
	{
		this.Id = newID;
	}
	protected void setX(int newX)
	{
		this.x_coord = newX;
	}
	protected void setY(int newY)
	{
		this.y_coord = newY;
	}
	protected void setName(String newName)
	{
		this.name = newName;
	}
}

