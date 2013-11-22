package ManageSales;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;


public class SaleListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SaleListPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/sellingLogo.JPG");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(25, 11, 638, 119);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(35, 141, 614, 206);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 11, 286, 39);
		panel_1.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 286, 184);
		panel_1.add(scrollPane);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBounds(474, 61, 130, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnNewButton);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(318, 61, 130, 50);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnAdd);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setBounds(318, 122, 82, 50);
		panel_1.add(spinner);
		
		JButton button_4 = new JButton("RETURN");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(358, 358, 145, 52);
		panel.add(button_4);
		
		JButton button = new JButton("SELL");
		button.setBounds(142, 358, 157, 52);
		panel.add(button);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));

	}
}
