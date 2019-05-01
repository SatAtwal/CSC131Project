package Locator;
import java.io.*;

/**
 * Instantiates other classes and Runs application
 * Does the file reads and writes
 * @author
 */
public class Server
{

	public static void main(String[] args) throws IOException
	{
		// sets path where file will be created to user home directory
		String directory = System.getProperty("user.home");  
		String fileName = "Server.txt";
		String absolutePath = directory + File.separator + fileName;
		
		Owner Bob = new Owner();
		User Daniel = new User("Daniel", 1234, Bob);
		Daniel.gotLost();
		
		// Device is lost and tag sends signal
		Tags T1 = new Tags(1234,"X: 1434, Y:-122, Z:9844", true);
		
		// send tags to finder
		Finder F1 = new Finder(T1); 
		
		try(FileWriter fileWriter = new FileWriter(absolutePath, true))
	    {
			String fileContent = "Hey you lost device " + T1.getId() +  " at " + F1.getLocation()
								+ System.lineSeparator() + Bob.notifyOwner() + System.lineSeparator()
								+ System.lineSeparator();
	        fileWriter.write(fileContent);
	    }
	    catch (IOException e) 
	    {
	        throw e;
	    }
	    
		Bob.found();
		T1.setStatus(true);
		
	}

}