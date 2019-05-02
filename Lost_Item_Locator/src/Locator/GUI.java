package Locator;
import javax.swing.*;       // JButton, JTextField, Jwhatever
import java.awt.event.*;    // Event
import java.util.concurrent.TimeUnit;
import java.awt.*;          // Font, colors



public class GUI extends JFrame
{
	
	 

	private JLabel name;
	private JButton lostButton;
	private JLabel searching;
	private JLabel found;
	
	public GUI()
	{
	 super("The Dream Team's Awesome Item Locator");	
	 setLayout(new FlowLayout());
	 
	 name = new JLabel("Hello " + User.get_name() + ", did you lose your device?");
	 add(name);
	 
	 lostButton = new JButton("Yep, I lost it");
	 lostButton.setBounds(200, 200, 40, 20);
	 add(lostButton);
	 
	 searching = new JLabel("Other devices are looking for your device");
	 
	 lostButton.addActionListener(new ActionListener()
			 {
		 		public void actionPerformed(ActionEvent e)
		 		{
		 			Tags T1 = new Tags(Server.tagID, Tags.location, false);
		 			lostButton.setVisible(false);
		 			name.setVisible(false);
		 			add(searching);
		 			
		 		   
		 			found = new JLabel("Your device has been found at " + T1.getLocation());
		 			searching.setVisible(false);
		 			add(found);
		 			}
			 
	}); 
	}
	
}//end GUI
