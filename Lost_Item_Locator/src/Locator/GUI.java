package Locator;
import javax.swing.*;       // JButton, JTextField, Jwhatever
import java.awt.event.*;    // Event
import java.awt.*;          // Font, colors






/**
 * Creates interface to input from user and output to user
 * @author Curtis
 */
public class GUI extends JFrame

{
	
	private static final long serialVersionUID = 1L;

	
	private JLabel name;
	private JButton lostButton;
	private JButton foundButton;
	private JLabel found;
	
	// creates user interface
	public GUI()
	{
	 super("The Dream Team's Awesome Item Locator");	
	 setLayout(new FlowLayout());
	 
	 name = new JLabel("Hello " + User.get_name() + ", did you lose your device?");
	 add(name);
	 
	 lostButton = new JButton("Yep, Search for my device");
	 add(lostButton);
	 
	foundButton = new JButton("I have recovered my device");
	 
	 
	  
	 // listens for the search button to be pressed
	 lostButton.addActionListener(new ActionListener()
			 {
		 		public void actionPerformed(ActionEvent e)
		 		{
		 			User.gotLost();
		 			lostButton.setVisible(false);
		 			name.setVisible(false);
		 			
		 			try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		 			
		 			found = new JLabel("Your device has been found at " + Finder.getLocation());
		 			add(found);
		 			add(foundButton);
		 			}
		 		
			 
	}); 
	 foundButton.addActionListener(new ActionListener()
	 {
 		public void actionPerformed(ActionEvent e)
 		{
 			System.exit(0);
 			}
 		
	 
}); 
	 
	 
	 
	 
	}
	
}//end GUI
