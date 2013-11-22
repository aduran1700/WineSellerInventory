package Sales;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;


public class SalePane extends JPanel {

	/**
	 * Create the panel.
	 */
	public SalePane() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 684, 429);
		add(panel);
		
		ImageIcon wineSellerIcon = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/saleLogo.JPG");
		JLabel wineSellerLabel = new JLabel(wineSellerIcon);
		wineSellerLabel.setBounds(25, 11, 638, 119);
		panel.add(wineSellerLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(35, 141, 614, 206);
		panel.add(panel_1);
		
		JButton btnSell = new JButton("SELL");
		btnSell.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSell.setBounds(40, 11, 250, 79);
		panel_1.add(btnSell);
		
		JButton btnDiscount = new JButton("DISCOUNT");
		btnDiscount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiscount.setBounds(40, 113, 250, 79);
		panel_1.add(btnDiscount);
		
		JButton btnRefund = new JButton("REFUND");
		btnRefund.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRefund.setBounds(337, 11, 250, 79);
		panel_1.add(btnRefund);
		
		JButton btnPromotion = new JButton("PROMOTION");
		btnPromotion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPromotion.setBounds(337, 113, 250, 79);
		panel_1.add(btnPromotion);
		
		JButton button_4 = new JButton("RETURN");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(504, 358, 145, 52);
		panel.add(button_4);

	}
}
