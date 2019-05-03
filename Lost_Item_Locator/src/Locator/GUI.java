package Locator;
import javax.swing.*;       // JButton, JTextField, Jwhatever
import java.awt.event.*;    // Event
import java.awt.*;          // Font, colors



public class GUI extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int timeKiller(int n)
	{
	  if (n <= 2) return 1;
	  else return timeKiller(n - 1) * timeKiller(n - 2);
	}
	 

	private JLabel name;
	private JButton lostButton;
	private JLabel found;
	
	public GUI()
	{
	 super("The Dream Team's Awesome Item Locator");	
	 setLayout(new FlowLayout());
	 
	 name = new JLabel("Hello " + User.get_name() + ", did you lose your device?");
	 add(name);
	 
	 lostButton = new JButton("Yep, Search for my device");
	 add(lostButton);
	 
	
	 
	 
	 lostButton.addActionListener(new ActionListener()
			 {
		 		public void actionPerformed(ActionEvent e)
		 		{
		 			
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
		 			}
		 		
			 
	}); 
	 
	 
	}
	
}//end GUI
