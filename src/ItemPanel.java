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


public class ItemPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ItemPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/itemLogo.JPG");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(25, 11, 638, 119);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(35, 141, 614, 206);
		panel.add(panel_1);
		
		JButton btnCreateItem = new JButton("CREATE ITEM");
		btnCreateItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCreateItem.setBounds(40, 11, 250, 79);
		panel_1.add(btnCreateItem);
		
		JButton btnUpdateItem = new JButton("UPDATE ITEM");
		btnUpdateItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUpdateItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateItem.setBounds(40, 113, 250, 79);
		panel_1.add(btnUpdateItem);
		
		JButton btnDeleteItem = new JButton("SEARCH ITEM");
		btnDeleteItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteItem.setBounds(337, 11, 250, 79);
		panel_1.add(btnDeleteItem);
		
		JButton btnViewItem = new JButton("VIEW ITEM");
		btnViewItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnViewItem.setBounds(337, 113, 250, 79);
		panel_1.add(btnViewItem);
		
		JButton button_4 = new JButton("RETURN");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(504, 358, 145, 52);
		panel.add(button_4);

	}

}
