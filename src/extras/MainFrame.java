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
import java.io.IOException;

import javax.swing.JTextField;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private JPanel mainPanel;
	private JPanel closeoutPanel;
	private JPanel genReportPanel;
	
	private JButton btnRoles;
	private JButton btnUsers;
	private JButton btnItems;
	private JButton btnOrders;
	private JButton btnSales;
	private JButton btnCloseout;
	private JButton btnLogout;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("WineSeller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 470);
		contentPane = new JPanel();
		contentPane.setLocation(0, -25);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.control);
		textPane.setText("01 : 34 AM");
		textPane.setBounds(40, 390, 109, 30);
		contentPane.add(textPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 158, 349);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnRoles = new JButton("Roles");
		btnRoles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRoles.setBounds(10, 11, 138, 45);
		panel.add(btnRoles);
		
		btnUsers = new JButton("Users");
		btnUsers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUsers.setBounds(10, 68, 138, 45);
		panel.add(btnUsers);
		
		btnItems = new JButton("Items");
		btnItems.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnItems.setBounds(10, 124, 138, 45);
		panel.add(btnItems);
		
		btnSales = new JButton("Sales");
		btnSales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSales.setBounds(10, 180, 138, 45);
		panel.add(btnSales);
		
		btnOrders = new JButton("Orders");
		btnOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrders.setBounds(10, 236, 138, 45);
		panel.add(btnOrders);
		
		btnCloseout = new JButton("Closeout");
		btnCloseout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				mainPanel.setVisible(false);
				btnRoles.setEnabled(false);
				btnUsers.setEnabled(false);
				btnItems.setEnabled(false);
				btnOrders.setEnabled(false);
				btnSales.setEnabled(false);
				btnCloseout.setEnabled(false);
				btnLogout.setEnabled(false);
				
				closeoutPanel = new JPanel();
				closeoutPanel.setBackground(Color.WHITE);
				closeoutPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				closeoutPanel.setBounds(178, 11, 686, 349);
				contentPane.add(closeoutPanel);
				closeoutPanel.setLayout(null);
				
				JButton btnOk = new JButton("Ok");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//CloseoutClass closeout = new CloseoutClass();
						
						closeoutPanel.setVisible(false);

						genReportPanel = new JPanel();
						genReportPanel.setBackground(Color.WHITE);
						genReportPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						genReportPanel.setBounds(178, 11, 686, 349);
						genReportPanel.setVisible(true);
						contentPane.add(genReportPanel);
						genReportPanel.setLayout(null);
						
						JLabel generatingRprtLbl = new JLabel("Generating Report...");
						generatingRprtLbl.setHorizontalAlignment(SwingConstants.CENTER);
						generatingRprtLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
						generatingRprtLbl.setBounds(219, 63, 235, 94);
						genReportPanel.add(generatingRprtLbl);						
												
						ImageIcon sandClockImg;
						JLabel imgLabel;
						
						//**************************MAKE IMG ROTATE WHILE GENERATE REPORT*************************//
						sandClockImg = new ImageIcon("C:\\Users\\admin\\Documents\\Fall_2013\\CEN4010\\img\\T1.png");
						imgLabel = new JLabel(sandClockImg);
						imgLabel.setBounds(268, 147, 128, 104);
						imgLabel.setVisible(true);
						genReportPanel.add(imgLabel);
						
						//**************************PRINT AND SAVE CLOSEOUT****************************************//
					//	try {
							//closeout.generateCloseout();
					//	} catch (IOException e) {
					//		e.printStackTrace();
					//	}
						
						
					}
				});
				btnOk.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnOk.setBounds(215, 186, 102, 52);
				btnOk.setVisible(true);
				closeoutPanel.add(btnOk);
				
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						closeoutPanel.setVisible(false);
						mainPanel.setVisible(true);
						btnRoles.setEnabled(true);
						btnUsers.setEnabled(true);
						btnItems.setEnabled(true);
						btnOrders.setEnabled(true);
						btnSales.setEnabled(true);
						btnCloseout.setEnabled(true);
						btnLogout.setEnabled(true);
					}
				});
				btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnCancel.setBounds(369, 186, 102, 52);
				btnCancel.setVisible(true);
				closeoutPanel.add(btnCancel);
				
				JLabel lblAreYouSure = new JLabel("Confirm generate Closeout Report?");
				lblAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
				lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblAreYouSure.setBounds(131, 88, 403, 58);
				closeoutPanel.add(lblAreYouSure);
			}
		});
		btnCloseout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCloseout.setBounds(10, 292, 138, 45);
		panel.add(btnCloseout);
		
		btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogout.setBounds(724, 371, 138, 45);
		contentPane.add(btnLogout);

		
		
		
		//get access to user (role, name) 
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mainPanel.setBounds(178, 11, 684, 349);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		//************************
		ImageIcon wineIcon = new ImageIcon("C:/Users/admin/Google Drive/img/wineIcon.jpg");
		JLabel wineLabel = new JLabel(wineIcon);
		wineLabel.setBounds(22, 24, 105, 106);
		mainPanel.add(wineLabel);
		
		ImageIcon vodkaIcon = new ImageIcon("C:/Users/admin/Google Drive/img/vodkaIcon.jpg");
		JLabel vodkaLabel = new JLabel(vodkaIcon);
		vodkaLabel.setBounds(424, 24, 115, 106);
		mainPanel.add(vodkaLabel);
		
		ImageIcon whiskyIcon = new ImageIcon("C:/Users/admin/Google Drive/img/whiskyIcon.jpg");
		JLabel whiskyLabel = new JLabel(whiskyIcon);
		whiskyLabel.setBounds(151, 24, 105, 106);
		mainPanel.add(whiskyLabel);
		
		ImageIcon rumIcon = new ImageIcon("C:/Users/admin/Google Drive/img/rumIc.jpg");
		JLabel rumLabel = new JLabel(rumIcon);
		rumLabel.setBounds(549, 24, 115, 106);
		mainPanel.add(rumLabel);
		
		
		ImageIcon tequilaIcon = new ImageIcon("C:/Users/admin/Google Drive/img/tequilaIcon.jpg");
		JLabel tequilaLabel = new JLabel(tequilaIcon);
		tequilaLabel.setBounds(287, 24, 115, 106);
		mainPanel.add(tequilaLabel);
		
		JLabel lblWine = new JLabel("Wine");
		lblWine.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWine.setBounds(60, 139, 67, 14);
		mainPanel.add(lblWine);
		
		JLabel lblWhisky = new JLabel("Whisky");
		lblWhisky.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhisky.setBounds(178, 139, 70, 14);
		mainPanel.add(lblWhisky);
		
		JLabel lblTequila = new JLabel("Tequila");
		lblTequila.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTequila.setBounds(316, 139, 70, 14);
		mainPanel.add(lblTequila);
		
		JLabel lblVodka = new JLabel("Vodka");
		lblVodka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVodka.setBounds(458, 141, 81, 14);
		mainPanel.add(lblVodka);
		
		JLabel lblRum = new JLabel("Rum");
		lblRum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRum.setBounds(586, 141, 46, 14);
		mainPanel.add(lblRum);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(10, 164, 664, 174);
		mainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnScanItem = new JButton("Scan Item");
		btnScanItem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnScanItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnScanItem.setBounds(25, 11, 191, 65);
		panel_2.add(btnScanItem);
		
		textField = new JTextField();
		textField.setBounds(383, 11, 271, 26);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchLiquor = new JLabel("Search Liquor :");
		lblSearchLiquor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchLiquor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchLiquor.setBounds(224, 11, 149, 26);
		panel_2.add(lblSearchLiquor);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearch.setBounds(565, 48, 89, 43);
		panel_2.add(btnSearch);
		
		JLabel lblPromotionOfDay = new JLabel("Promotion of Day : Buy 2 x 1 Pinot Grigio Ca'Bolani");
		lblPromotionOfDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromotionOfDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPromotionOfDay.setBounds(10, 110, 644, 43);
		panel_2.add(lblPromotionOfDay);
		//**********************
		
		JLabel lblNewLabel = new JLabel("Manager: Jose Garcia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(516, 375, 179, 41);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(178, 371, 2, 54);
		contentPane.add(separator);
		
		JLabel label = new JLabel("10/06/2013");
		label.setBounds(10, 7, 158, 30);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}
