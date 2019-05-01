package Locator;

/**
 * Instantiates other classes and Runs application
 * Does the file reads and writes
 * @author
 */
public class Server
{

	public static void main(String[] args) 
	{
		Owner Daniel1 = new Owner();
		User Daniel = new User("Daniel",1234,Daniel1);
		Daniel.gotLost();
		
		//Device found
		Tags T1 = new Tags(1234,"X: 1434, Y:-122, Z:-9844");
		
		//send tags to finder
		Finder F1 = new Finder(T1); 			// "FINDER WILL EMAIL"
		System.out.println("Hey you lost ur phone at "+F1.getLocation());
		Daniel.FOUND();
		
	}

}