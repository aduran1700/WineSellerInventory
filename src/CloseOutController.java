import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Create interface to generate close out report. 
 * It displays a confirmation panel before generating a report. 
 * @author Cynthia Tope
 *
 */
public class CloseOutController extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
//	DatabaseManager db;

	public JPanel btnPanel;
	public JPanel mainPanel;

	
	/**
	 * Creates the confirmation panel 
	 */
	public CloseOutController(final JPanel btnPanel, final JPanel mainPanel) {
		
//		db = new DatabaseManager();

		this.btnPanel = btnPanel;
		this.mainPanel = mainPanel;
		
		setBackground(Color.WHITE);
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBounds(180, 14, 684, 429);
		setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(137, 224, 165, 69);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CloseOutPanel closeOutPanel = new CloseOutPanel();
				removeAll();
				add(closeOutPanel.generateReport());
				revalidate();
				repaint();
//				String [][] whites = db.getWhites();
//				String [][] reds = db.getReds();
//				String [][] pinks = db.getPinks();
			}
		});
		add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);		
				mainPanel.setVisible(true);
				for (Component c : btnPanel.getComponents()) {
					c.setEnabled(true);
				}	
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(361, 224, 165, 69);
		add(btnCancel);
		
		JLabel lblAreYouSure = new JLabel("Do you want to generate a close out report?");
		lblAreYouSure.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAreYouSure.setBounds(88, 142, 520, 58);
		add(lblAreYouSure);
		
		ImageIcon closeoutLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/closeoutLogo.jpg");
		JLabel closeoutLabel = new JLabel(closeoutLogo);
		closeoutLabel.setBounds(10, 1, 664, 120);
		add(closeoutLabel);

		ImageIcon grapeLinesLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/grapeLinesLogo.jpg");
		JLabel grapeLinesLabel = new JLabel(grapeLinesLogo);
		grapeLinesLabel.setBounds(10, 349, 664, 69);
		add(grapeLinesLabel);
		
		setVisible(true);
	}
	
	public JComponent confirmMessage() {
		return this;
	}
}
