import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;


public class CreateItemPane extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public CreateItemPane() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 11, 647, 316);
		panel.add(panel_1);
		
		JLabel lblItemId = new JLabel("Item ID:");
		lblItemId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItemId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblItemId.setBounds(0, 15, 124, 23);
		panel_1.add(lblItemId);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItemName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblItemName.setBounds(0, 55, 124, 23);
		panel_1.add(lblItemName);
		
		JLabel lblWineColor = new JLabel("Wine Color:");
		lblWineColor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWineColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWineColor.setBounds(0, 95, 124, 23);
		panel_1.add(lblWineColor);
		
		JLabel lblWineVintage = new JLabel("Wine Vintage:");
		lblWineVintage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWineVintage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWineVintage.setBounds(0, 132, 124, 23);
		panel_1.add(lblWineVintage);
		
		JLabel lblLocationOfOrigin = new JLabel("Location of Origin:");
		lblLocationOfOrigin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocationOfOrigin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLocationOfOrigin.setBounds(418, 15, 154, 23);
		panel_1.add(lblLocationOfOrigin);
		
		JLabel lblStateprovince = new JLabel("State:");
		lblStateprovince.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStateprovince.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStateprovince.setBounds(307, 55, 96, 23);
		panel_1.add(lblStateprovince);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCountry.setBounds(316, 95, 87, 23);
		panel_1.add(lblCountry);
		
		JLabel lblPurchasePrice = new JLabel("Purchase Price:");
		lblPurchasePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPurchasePrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPurchasePrice.setBounds(0, 206, 124, 23);
		panel_1.add(lblPurchasePrice);
		
		JLabel lblSalePrice = new JLabel("Sale Price:");
		lblSalePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalePrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalePrice.setBounds(38, 240, 86, 23);
		panel_1.add(lblSalePrice);
		
		JLabel lblVineyard = new JLabel("Vineyard:");
		lblVineyard.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVineyard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVineyard.setBounds(0, 172, 124, 23);
		panel_1.add(lblVineyard);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(134, 18, 170, 23);
		panel_1.add(textField);
		
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
		textField_8.setBounds(134, 209, 169, 23);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(134, 243, 170, 23);
		panel_1.add(textField_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(417, 151, 170, 143);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/createItemLogo.JPG");		
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(12, 11, 145, 119);
		panel_2.add(wineSellerLabel);
		
		JButton btnReturn = new JButton("RETURN");
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBounds(364, 358, 145, 52);
		panel.add(btnReturn);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConfirm.setBounds(174, 358, 145, 52);
		panel.add(btnConfirm);
		

	}

}
