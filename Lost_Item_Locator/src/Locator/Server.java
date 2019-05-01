package Locator;
import java.io.*;
import java.util.Scanner;

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
		
		// take user input to initialize owner and tag
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the User's name: ");
		String userName = input.nextLine();
		
		System.out.print("Enter the tag's ID: ");
		int tagID = input.nextInt();
		
		Owner owner = new Owner();
		User user = new User(userName, tagID, owner);
		user.gotLost();
		
		// Device is lost and tag sends signal
		Tags T1 = new Tags(tagID,"X: 1434, Y: -122, Z: 9844", true);
		
		// send tags to finder
		Finder F1 = new Finder(T1); 
		
		try(FileWriter fileWriter = new FileWriter(absolutePath, true))
	    {
			String fileContent = "Hey you lost device " + T1.getId() +  " at " + F1.getLocation()
								+ System.lineSeparator() + owner.notifyOwner() + System.lineSeparator()
								+ System.lineSeparator();
	        fileWriter.write(fileContent);
	    }
	    catch (IOException e) 
	    {
	        throw e;
	    }
	    
		owner.found();
		T1.setStatus(true);
		
	}

}