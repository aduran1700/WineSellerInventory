import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class AddUserPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public AddUserPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/addUserLogo.jpg");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(10, 11, 664, 119);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setLayout(null);
		panel_1.setBounds(35, 141, 614, 206);
		panel.add(panel_1);
		
		JLabel lblLoginId = new JLabel("Login ID :");
		lblLoginId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoginId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLoginId.setBounds(0, 15, 124, 23);
		panel_1.add(lblLoginId);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(0, 55, 124, 23);
		panel_1.add(lblPassword);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setBounds(0, 95, 124, 23);
		panel_1.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(0, 132, 124, 23);
		panel_1.add(lblLastName);
		
		JLabel lblStreet = new JLabel("Street :");
		lblStreet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStreet.setBounds(307, 15, 96, 23);
		panel_1.add(lblStreet);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCity.setBounds(307, 55, 96, 23);
		panel_1.add(lblCity);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblState.setBounds(316, 95, 87, 23);
		panel_1.add(lblState);
		
		JLabel lblZip = new JLabel("Zip :");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblZip.setBounds(307, 132, 96, 23);
		panel_1.add(lblZip);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(317, 172, 86, 23);
		panel_1.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhone.setBounds(0, 172, 124, 23);
		panel_1.add(lblPhone);
		
		textField = new JTextField();
		textField.setBounds(134, 18, 170, 23);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 52, 169, 23);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 95, 170, 23);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(134, 132, 170, 23);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 172, 170, 23);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(413, 19, 191, 23);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(413, 59, 191, 23);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(413, 99, 191, 23);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(413, 136, 191, 23);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(413, 172, 191, 23);
		panel_1.add(textField_9);
		
		JButton button_4 = new JButton("CANCEL");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(364, 358, 145, 52);
		panel.add(button_4);
		
		JButton button = new JButton("CREATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(174, 358, 145, 52);
		panel.add(button);

	}

}
