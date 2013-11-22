import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginPanel extends JPanel {
	private JTextField textField;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.control);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/wineSellerLogo.jpg");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(36, 11, 614, 222);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(36, 244, 614, 159);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
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
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(46, 98, 123, 38);
		panel_1.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(424, 65, 145, 44);
		panel_1.add(btnSubmit);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
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
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	

	}
}
