package extras;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JSeparator;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WineSellerReportsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WineSellerReportsFrame frame = new WineSellerReportsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WineSellerReportsFrame() {
		setTitle("WineSeller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 46, 158, 349);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Roles");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 11, 138, 45);
		panel.add(btnNewButton);
		
		JButton btnUsers = new JButton("Users");
		btnUsers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUsers.setEnabled(false);
		btnUsers.setBounds(10, 68, 138, 45);
		panel.add(btnUsers);
		
		JButton btnItems = new JButton("Items");
		btnItems.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnItems.setEnabled(false);
		btnItems.setBounds(10, 124, 138, 45);
		panel.add(btnItems);
		
		JButton btnSales = new JButton("Sales");
		btnSales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSales.setEnabled(false);
		btnSales.setBounds(10, 180, 138, 45);
		panel.add(btnSales);
		
		JButton btnOrders = new JButton("Orders");
		btnOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrders.setEnabled(false);
		btnOrders.setBounds(10, 236, 138, 45);
		panel.add(btnOrders);
		
		JButton btnCloseout = new JButton("CloseOut");
		btnCloseout.setEnabled(false);
		btnCloseout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCloseout.setBounds(10, 292, 138, 45);
		panel.add(btnCloseout);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setEnabled(false);
		btnLogout.setBounds(726, 374, 138, 45);
		contentPane.add(btnLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(178, 11, 686, 349);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		ImageIcon img = new ImageIcon("C:/Users/admin/Google Drive/img/sand-clock4.png");
		
		JLabel lblAreYouSure = new JLabel("Estimates :");
		lblAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAreYouSure.setBounds(10, 11, 200, 52);
		panel_1.add(lblAreYouSure);
		
		JButton button = new JButton("CloseOut");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(272, 293, 138, 45);
		panel_1.add(button);
		
		JLabel lblToday = new JLabel("Today :");
		lblToday.setHorizontalAlignment(SwingConstants.CENTER);
		lblToday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblToday.setBounds(362, 11, 200, 52);
		panel_1.add(lblToday);
		
		JLabel lblNewLabel = new JLabel("Manager: Jose Garcia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(518, 378, 179, 41);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(32, 389, 109, 30);
		contentPane.add(textPane);
		textPane.setText("01 : 34 AM");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.menu);
		
		JLabel label = new JLabel("10/06/2013");
		label.setBounds(10, 11, 158, 30);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(178, 371, 2, 54);
		contentPane.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
	}
}
