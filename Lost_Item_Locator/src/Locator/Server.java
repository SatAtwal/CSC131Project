package Locator;
import java.io.*;
import javax.swing.*; 


/**
 * Instantiates other classes and Runs application
 * Does the file reads and writes
 * @author
 */
public class Server
{

	protected static int tagID;

	public static void main(String[] args) throws IOException
	{
		// sets path where file will be created to user home directory
		String directory = System.getProperty("user.home");  
		String fileName = "Server.txt";
		String absolutePath = directory + File.separator + fileName;
		
		String userName = JOptionPane.showInputDialog("Enter you name:");
		String tag = JOptionPane.showInputDialog("Enter your tag ID:");
		
		int tagID = Integer.parseInt(tag);
		
		
		
		
		Owner owner = new Owner();
		User user = new User(userName, tagID, owner);
		user.gotLost();
		
		GUI g = new GUI();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(400, 400);
		g.setVisible(true);
		
		// Device is lost and tag sends signal
		Tags T1 = new Tags(tagID, Tags.location, false);
		
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