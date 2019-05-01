package Locator;

/**
 * The person who uses the application
 * @author 
 */
public class User 
{
	private Owner O1;
	private int id;
	private String name;
	
	/**
	 * Creates a user
	 * @param x
	 * @param id_user
	 * @param O
	 */
	public User(String x,int id_user, Owner O) 
	{
		this.name = x;
		this.id = id_user;
		this.O1 = O;
	}
	
	/**
	 * gets ID
	 * @return id
	 */
	public int get_id()
	{
		return this.id;
	}
	
	/**
	 * gets name
	 * @return name
	 */
	public String get_name()
	{
		return this.name;
	}
	
	/**
	 * sets owner's item to lost
	 */
	public void gotLost()
	{
		O1.flagLost();
	}
	
	/**
	 * returns status of owner's item
	 * @return O1.status_Lost()
	 */
	public boolean lostStatus()
	{
		return O1.status_Lost();
	}
	
	/**
	 * returns found status of owner's item
	 * @return O1.status_Found()
	 */
	public boolean foundStatus()
	{
		return O1.status_Found();
	}
	
	/**
	 * calls found on owner
	 */
	public void FOUND()
	{
		O1.found();
	}
}

