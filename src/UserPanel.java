import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UserPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/userLogo.JPG");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(25, 11, 638, 119);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(35, 141, 614, 206);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddUser = new JButton("ADD USER");
		btnAddUser.setBounds(40, 11, 250, 79);
		panel_1.add(btnAddUser);
		btnAddUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnUpdateUser = new JButton("UPDATE USER");
		btnUpdateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdateUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateUser.setBounds(40, 113, 250, 79);
		panel_1.add(btnUpdateUser);
		
		JButton btnDeleteUser = new JButton("DELETE USER");
		btnDeleteUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteUser.setBounds(337, 11, 250, 79);
		panel_1.add(btnDeleteUser);
		
		JButton btnViewUser = new JButton("VIEW USER");
		btnViewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnViewUser.setBounds(337, 113, 250, 79);
		panel_1.add(btnViewUser);
		
		JButton btnReturn = new JButton("RETURN");
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBounds(504, 358, 145, 52);
		panel.add(btnReturn);

	}
}
