//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
//import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * This class represents the GUI to interact with the user 
 * when generating a order report.  
 * @author Cynthia Tope
 *
 */
public class OrderPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JPanel orderPanel;
	private JPanel genReportPanel;
	
	/**
	 * Create the order panel
	 */
	public OrderPanel(final JPanel buttonsPanel, final JPanel mainPanel) {
		setLayout(null);
		
		orderPanel = new JPanel();
		orderPanel.setBackground(Color.WHITE);
		orderPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		orderPanel.setBounds(180, 14, 684, 427);
		orderPanel.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				orderPanel.setVisible(false);

				genReportPanel = new JPanel();
				genReportPanel.setBackground(Color.WHITE);
				genReportPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				genReportPanel.setBounds(178, 11, 686, 349);
				genReportPanel.setVisible(true);
				add(genReportPanel);
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
				
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(167, 222, 165, 69);
		btnOk.setVisible(true);
		orderPanel.add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				orderPanel.setVisible(false);
				mainPanel.setVisible(true);
				for (Component c : buttonsPanel.getComponents()) {
					c.setEnabled(true);
				}								
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(369, 222, 165, 69);
		btnCancel.setVisible(true);
		orderPanel.add(btnCancel);
		
		JLabel lblAreYouSure = new JLabel("Confirm To Generate Order Report?");
		lblAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAreYouSure.setBounds(88, 153, 520, 58);
		orderPanel.add(lblAreYouSure);
		
		ImageIcon closeoutLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/orderLogo.jpg");
		JLabel closeoutLabel = new JLabel(closeoutLogo);
		closeoutLabel.setBounds(10, 11, 664, 120);
		orderPanel.add(closeoutLabel);

		ImageIcon grapeLinesLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/grapeLinesLogo.jpg");
		JLabel grapeLinesLabel = new JLabel(grapeLinesLogo);
		grapeLinesLabel.setBounds(10, 349, 664, 69);
		orderPanel.add(grapeLinesLabel);
					
//		add(orderPanel);
	}
	
	public JComponent getGUI() {
		return orderPanel;
	}

}
