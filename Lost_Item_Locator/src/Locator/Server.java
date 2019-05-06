package Locator;
import java.io.*;
import javax.swing.*; 


/**
 * Instantiates other classes and Runs application
 * Does the file reads and writes
 * @author Curtis and Satjyot
 */
public class Server
{

	public static void main(String[] args) throws IOException
	{
		// sets path where file will be created to user home directory
		String directory = System.getProperty("user.home");  
		String fileName = "Server.txt";
		String absolutePath = directory + File.separator + fileName;
		
		// asks user for input
		String userName = JOptionPane.showInputDialog("Enter you name:");
		String tag = JOptionPane.showInputDialog("Enter your tag ID:");
		String device = JOptionPane.showInputDialog("Enter your device:");
		
		
		int tagID = Integer.parseInt(tag);
		
		Tags T1 = new Tags(tagID, Tags.getLocation(), device, false);
		
		Finder F1 = new Finder(T1); 
		Owner owner = new Owner();
		User user = new User(userName, tagID, owner);
		user.gotLost();
		
		GUI g = new GUI();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    g.setSize(400, 200);
		g.setVisible(true);
		

		
		
		/**
		 * writes details of lost item into file which represents the database
		 */
		try(FileWriter fileWriter = new FileWriter(absolutePath, true))
	    {
			String fileContent = "The user " + User.get_name() + " lost their " + T1.getDeviceName() + 
	     " with ID number " + T1.getId() + " at " + Finder.getLocation()
								+ System.lineSeparator() + owner.notifyOwner() + System.lineSeparator()
								+ System.lineSeparator();
	        fileWriter.write(fileContent);
	    }
	    catch (IOException e) 
	    {
	        throw e;
	    }
	    
		// sets item to found
		Owner.found();
		
	}

}