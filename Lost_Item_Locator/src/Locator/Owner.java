package Locator;

public class Owner
{
	private boolean itemLost;
	private boolean itemFound;
	
	
	public Owner()
	{
		this.itemLost = false;
		this.itemFound = false;
	}
	
	public void flagLost (itemLost)
	{
		this.itemLost=true;
	}
	
	public boolean getLost (itemLost)
	{
		return this.itemLost
	}
}