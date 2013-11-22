import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
//import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JButton;


public class CloseOutPanel extends JPanel {

	/**
	 * @author Cynthia Tope
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the panel to display the close out report.
	 */
	public CloseOutPanel() {

		setBackground(Color.WHITE);
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));		
		setBounds(0, 0, 684, 429);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 684, 429);
		scrollPane.setVisible(true);
//		scrollPane.setLayout(null);		
		
		ImageIcon closeoutLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/closeoutLogo.jpg");
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(500, 25, 135, 53);
		add(btnNewButton);
		
		JLabel closeoutLabel = new JLabel(closeoutLogo);
//		scrollPane.add(closeoutLabel);
		scrollPane.setColumnHeaderView(closeoutLabel);
		
				
		JTextArea scroller = new JTextArea();
		scrollPane.setViewportView(scroller);
		scroller.setEditable(false);
		scroller.setText("HOla adfskljdaklsjf\nadeef\nsafasdg\nsagfsad\nadsfa\naff\n" +
								"ardg\nsfg\nsdfga\nuih\nafgn\neatrfaw\nrgta\nafasd\nadgfa\nsagfdag\narga\n" +
								"daf\nafdaf\naHOla adfskljdaklsjf\nadeef\nsafasdg\nsagfsad\nadsfa\naff\n" +
								"ardg\nsfg\nsdfga\nuih\nafgn\neatrfaw\nrgta\nafasd\nadgfa\nsagfdag\narga\n" +
								"daf\nafdaf\nHOla adfskljdaklsjf\nadeef\nsafasdg\nsagfsad\nadsfa\naff\n" +
								"ardg\nsfg\nsdfga\nuih\nafgn\neatrfaw\nrgta\nafasd\nadgfa\nsagfdag\narga\n" +
								"daf\nafdaf\nHOla adfskljdaklsjf\nadeef\nsafasdg\nsagfsad\nadsfa\naff\n" +
								"ardg\nsfg\nsdfga\nuih\nafgn\neatrfaw\nrgta\nafasd\nadgfa\nsagfdag\narga\n" +
								"daf\nafdaf\nHOla adfskljdaklsjf\nadeef\nsafasdg\nsagfsad\nadsfa\naff\n" +
								"ardg\nsfg\nsdfga\nuih\nafgn\neatrfaw\nrgta\nafasd\nadgfa\nsagfdag\narga\n" +
								"daf\nafdaf\n");
//		scroller.setVisible(true);
		
		add(scrollPane);

//		ImageIcon grapeLinesLogo = new ImageIcon("C:/Users/admin/Documents/Fall_2013/CEN4010/img/grapeLinesLogo.jpg");

		setVisible(true);
	}
	
	public JComponent generateReport() {
		return this;
	}
}
