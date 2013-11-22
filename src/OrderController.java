import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JPanel;


/**
 * In charge of manipulating closeout reports. This class calls the 
 * CloseOutReport class to generate a new report if necessary. 
 * @author Cynthia Tope
 *
 */
public class OrderController {
//	private DatabaseManager db;
	private Date today;			
	public JPanel buttonsPanel;
	public JPanel mainPanel;	
	
	/**
	 * Constructor
	 */
	public OrderController (JPanel buttonsPanel, JPanel mainPanel) {
		today = new Date();		
		this.buttonsPanel = buttonsPanel;
		this.mainPanel = mainPanel;
	}
	
	public JComponent sendMessage() {
		OrderPanel panel = new OrderPanel(buttonsPanel, mainPanel);
		return panel.getGUI();
	}
	
	
	/**
	 * This method request data from databaseManager and generates a close out report
	 * @throws IOException
	 */
	public void generateCloseout() throws IOException {
		
    	//*******************NEED THIS DATABASE METHODS******************************
		
//    	ArrayList<user> usersProfile = new ArrayList<user>();
//    	ArrayList<item> itemsInStock = new ArrayList<item>();
//    	ArrayList<sale> sales = new ArrayList<sale>();
    	
    	
//    	usersProfile =  db.getUsersProfile();
//    	itemsInStock = db.getItemsInStock();
//    	sales = db.getSales(today);
    	
		
      	//*************************For testing without DB***************************  	
		
    	ArrayList<String[]> usersProfile = new ArrayList<String[]>();
    	ArrayList<String[]> itemsInStock = new ArrayList<String[]>();
    	ArrayList<String[]> sales = new ArrayList<String[]>();

    	String [] user1 = {"Cynthia", "Tope", "1619 Penn Ave", "(305)222-2222"};
    	String [] user2 = {"Maria", "Cardenas", "333 Lincoln Rd", "(305)442-4442"};
    	String [] items1 = {"Vodka", "GreyGoose", "2011", null, null, null};
    	String [] items2 = {"Wine", "Red", "Spain", "Montes", "2003", "Cabernet Sauvignon"};
    	String [] sales1 = {"21980", "Wine", "Red", "Spain", "Montes", "2003", "Cabernet Sauvignon"};
    	String [] sales2 = {"00012", "Vodka", "GreyGoose", "2011", null, null, null};
    	
    	usersProfile.add(user1);
    	usersProfile.add(user2);
    	itemsInStock.add(items1);
    	itemsInStock.add(items2);
    	sales.add(sales1);
    	sales.add(sales2);
    	
    //*******************************************************************************

    	String [] temp; 
    	BufferedWriter bw = null;

  	  	try {

	    	File file = new File("C:\\Users\\admin\\Documents\\Fall_2013\\CEN4010\\closeoutReports\\today.txt");
	    	if (!file.exists()) {
	    		file.createNewFile();
	    	}
	    	
	    	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    	bw = new BufferedWriter(fw);
	    	String what = null;
//	    	bw.
	    	bw.write("Date: " + today.getMonth() + "/" + today.getDate() + "/" + (today.getYear() + 1900) + "\r\n");
	    	
	    	bw.write("\r\nUSERS:\r\n");
	    	for (int i = 0; i < usersProfile.size(); i++){
	    		temp = usersProfile.get(i);
	    		for (int j= 0; j < temp.length; j++){    			
	    			if (temp[j] != null) {
//	    				"%-10s %-10s %-10s\n", "osne", "two", "thredsfe"
	    				//what = "%-10s"
	    				bw.write(temp[j]);
	    				bw.write("\15");
	    			}
	    		}
	    		bw.write("\r\n");
	    	}
	    	
	    	bw.write("\r\nINVENTORY:\r\n");
	    	for (int i = 0; i < itemsInStock.size(); i++){
	    		temp = itemsInStock.get(i);
	    		for (int j= 0; j < temp.length; j++){    			
	    			if (temp[j] != null) {
	    				bw.write(temp[j]);
	    				bw.write("\r\t");
	    			}
	    		}
	    		bw.write("\r\n");
	    	}
	    	
	    	bw.write("\r\nSALES:\r\n");
	    	for (int i = 0; i < sales.size(); i++){
	    		temp = sales.get(i);
	    		for (int j= 0; j < temp.length; j++){    	
	    			if (temp[j] != null) {
	    				bw.write(temp[j]);
	    				bw.write("\r\t");
	    			}
	    		}
	    		bw.write("\n");
	    	}
    	  } catch (IOException e) {
    		  
    		  e.printStackTrace();
    	  } finally {
    	     
    		  if (bw != null)
    			  bw.close();
    	  }
	}
	
//	public static void main (String[] args) throws IOException {
//		CloseOutController out = new CloseOutController();
//		out.generateCloseout();
//	}
}
