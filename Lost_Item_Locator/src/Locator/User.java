package Locator;

/**
 * The person who uses the application
 * @author 
 */
public class User 
{
	private Owner O1;
	private int id;
	private static String name;
	
	/**
	 * Creates a user
	 * @param x
	 * @param id_user
	 * @param O
	 */
	public User(String x, int id_user, Owner O) 
	{
		name = x;
		id = id_user;
		O1 = O;
	}
	
	/**
	 * gets ID
	 * @return id
	 */
	public int get_id()
	{
		return id;
	}
	
	/**
	 * gets name
	 * @return name
	 */
	public static String get_name()
	{
		return name;
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
	
}

