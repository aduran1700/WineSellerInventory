import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


public class WineSellerFrame extends JFrame {

	/**
	 * @author Cynthia Tope 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;	
	private JPanel mainPanel;
	private JPanel buttonsPanel;
	private JButton btnUsers;
	private JButton btnItems;
	private JButton btnOrders;
	private JButton btnSales;
	private JButton btnCloseOut;
	private JButton btnLogout;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WineSellerFrame frame = new WineSellerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame for entire application.
	 */
	public WineSellerFrame() {
		setTitle("WineSeller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 549);
		contentPane = new JPanel();
		contentPane.setLocation(0, -25);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		setContentPane(contentPane);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.control);
		textPane.setText("01 : 34 AM");
		textPane.setBounds(35, 454, 109, 30);
		textPane.setName("textPane");
		contentPane.add(textPane);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setBounds(13, 11, 158, 429);		
		buttonsPanel.setLayout(null);
		
		btnUsers = new JButton("Users");
		btnUsers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUsers.setBounds(9, 13, 138, 68);
		buttonsPanel.add(btnUsers);
		
		btnItems = new JButton("Items");
		btnItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(false);				
	
			}
		});
		btnItems.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnItems.setBounds(11, 97, 138, 68);
		buttonsPanel.add(btnItems);
		
		btnSales = new JButton("Sales");
		btnSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSales.setBounds(11, 179, 138, 68);
		buttonsPanel.add(btnSales);
		
		btnOrders = new JButton("Orders");
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				mainPanel.setVisible(false);				
				for (Component c : buttonsPanel.getComponents()) {
					c.setEnabled(false);
				}
				
				OrderController control = new OrderController(buttonsPanel, mainPanel);
				contentPane.add(control.sendMessage());

			}
		});
		btnOrders.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOrders.setBounds(11, 261, 138, 68);
		buttonsPanel.add(btnOrders);
		
		btnCloseOut = new JButton("Closeout");
		btnCloseOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				mainPanel.setVisible(false);	
				for (Component c : buttonsPanel.getComponents()) {
					c.setEnabled(false);
				}				
				CloseOutController control = new CloseOutController(buttonsPanel, mainPanel);
				contentPane.add(control.confirmMessage());
			}
			
		});
		btnCloseOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCloseOut.setBounds(10, 340, 138, 68);
		buttonsPanel.add(btnCloseOut);
		buttonsPanel.setName("buttonsPanel");
		contentPane.add(buttonsPanel);
		
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(713, 454, 138, 45);
		btnLogout.setName("btnLogout");
		contentPane.add(btnLogout);

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mainPanel.setBounds(180, 14, 684, 429);
		mainPanel.setLayout(null);

		ImageIcon wineIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/redWine.jpg");
		JLabel wineLabel = new JLabel(wineIcon);
		wineLabel.setBounds(30, 13, 135, 138);
		mainPanel.add(wineLabel);
		
		ImageIcon vodkaIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/roseWine.jpg");
		JLabel vodkaLabel = new JLabel(vodkaIcon);
		vodkaLabel.setBounds(193, 13, 135, 138);
		mainPanel.add(vodkaLabel);
		
		ImageIcon whiskyIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/whiteWine.jpg");
		JLabel whiskyLabel = new JLabel(whiskyIcon);
		whiskyLabel.setBounds(516, 13, 135, 138);
		mainPanel.add(whiskyLabel);
		
		ImageIcon tequilaIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/sparklingWine.jpg");
		JLabel tequilaLabel = new JLabel(tequilaIcon);
		tequilaLabel.setBounds(355, 13, 135, 138);
		mainPanel.add(tequilaLabel);
		
		JLabel lblWine = new JLabel("RED");
		lblWine.setHorizontalAlignment(SwingConstants.CENTER);
		lblWine.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWine.setBounds(51, 160, 95, 14);
		mainPanel.add(lblWine);
		
		JLabel lblWhisky = new JLabel("WHITE");
		lblWhisky.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhisky.setBounds(563, 160, 70, 14);
		mainPanel.add(lblWhisky);
		
		JLabel lblTequila = new JLabel("SPARKLING");
		lblTequila.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTequila.setBounds(385, 160, 95, 14);
		mainPanel.add(lblTequila);
		
		JLabel lblVodka = new JLabel("ROSE");
		lblVodka.setHorizontalAlignment(SwingConstants.CENTER);
		lblVodka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVodka.setBounds(203, 160, 115, 14);
		mainPanel.add(lblVodka);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(25, 11, 143, 169);
		panel_1.setLayout(null);
		mainPanel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(10, 205, 664, 213);
		panel_2.setLayout(null);		
		
		JButton btnScanItem = new JButton("Scan Item");
		btnScanItem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnScanItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnScanItem.setBounds(25, 11, 191, 65);
		panel_2.add(btnScanItem);
		
		JTextField textField = new JTextField();
		textField.setBounds(383, 11, 271, 26);
		textField.setColumns(10);
		panel_2.add(textField);
		
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
		mainPanel.add(panel_2);				
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(187, 11, 143, 169);
		panel_3.setLayout(null);
		mainPanel.add(panel_3);
				
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(350, 11, 143, 169);
		panel_4.setLayout(null);
		mainPanel.add(panel_4);
				
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(511, 11, 143, 169);
		panel_5.setLayout(null);
		mainPanel.add(panel_5);
		mainPanel.setName("mainPanel");
		contentPane.add(mainPanel);
				
		JLabel lblNewLabel = new JLabel("Manager: Jose Garcia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(524, 457, 179, 41);
		lblNewLabel.setName("lblNewLabel");
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(169, 460, 2, 45);
		separator.setName("separator");
		contentPane.add(separator);	
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
