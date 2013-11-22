package AccessPoint;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The Panel that helps users login. It is a GUI. It provides the user
 * with two text fields to enter the user name and password.
 * @authors Cynthia Tope and Rene Alfonso
 */
public class LoginPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	// The fields.
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Creates a LoginPanel.
	 */
	public LoginPanel() 
	{
		setLayout(null);
		
		// Create the panel.
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.control);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		// Find the image and add it.
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/R/Desktop/wineSellerLogo.jpg");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(36, 11, 614, 222);
		panel.add(wineSellerLabel);
		
		// Create panel.
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(36, 244, 614, 159);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		// label user name. 
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(46, 51, 123, 35);
		panel_1.add(lblUsername);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtUsername = new JTextField();
		txtUsername.setBounds(179, 52, 195, 30);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(179, 101, 195, 30);
		panel_1.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(46, 98, 123, 38);
		panel_1.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// The Submit button.
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(424, 65, 145, 44);
		panel_1.add(btnSubmit);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// Prompt
		JLabel lblPleaseEnterYour = new JLabel("Please enter your username and password:");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPleaseEnterYour.setBounds(45, 9, 485, 23);
		panel_1.add(lblPleaseEnterYour);
		
		JLabel lblNewLabel = new JLabel("* Please enter a valid username");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(179, 37, 195, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("* Please enter a valid password");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(179, 83, 195, 23);
		panel_1.add(lblNewLabel_1);
		
		/**
		 * Listen for action on the Submit button.
		 */
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// Create a temporary String to hold the userName.
				String id = txtUsername.getText();
				
				// Create a temporary String to hold the password.
				String p = txtPassword.getText();
				
				if(checkForValidFormat(id, p))
					System.out.println("fail");

				Authenticator a = new Authenticator();
				a.authenticate(id, p);
				
				System.out.println(id);
				System.out.println(p);
				
				
				// Check if user credentials have valid format.
				
				
				// Call Authenticator to validate credentials. 
			}
		});
	}
	
	private boolean checkForValidFormat(String id, String p)
	{
		System.out.println("Testing");
		
		// Check for null.
		if(id == null || p == null)
			return false;
		
		// Not needed.
		else if(id.isEmpty() || p.isEmpty())
			return false;
		
		// Not needed.
		else if(id.equals("") || p.equals(""))
			return false;
			
		return true;
	}
}