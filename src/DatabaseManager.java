
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.ObjectInputStream;  
import java.security.PublicKey;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;  
import java.util.Date;  
    
public class DatabaseManager {  
	
    private Connection connection = null;  
    private Statement st1 = null;  
    private Statement st2 = null;  
    private ResultSet resultSet = null;   
    
    
    public DatabaseManager(String user, String pass) {  
       try {  
           Class.forName("com.mysql.jdbc.Driver");  
           connection = DriverManager.getConnection("jdbc:mysql://107.206.138.187/mysql", user, pass); 
           st1 = connection.createStatement();  
           st2 = connection.createStatement();  
       } catch (ClassNotFoundException e) {  
           e.printStackTrace();  
       } catch (SQLException e) {  
           e.printStackTrace();  
       }  
    }     
    
    public DatabaseManager() {  
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection("jdbc:mysql://107.206.138.187/mysql", "root", "root");   
            st1 = connection.createStatement();  
            st2 = connection.createStatement();  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
     }  
        

    public Sale[] getSalesByItems() {
    	String query;
//    	int i = 0;
    	Sale[] sales = new Sale[1000];
//    	Sale s;
    			
    	try {
    		query = "SELECT ID FROM telebotcc.session";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
//    			s = new Sale(0, 0, 0, resultSet.getString(1));
//    			sales[i++] = s;
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    	return sales;
    }
    
    public String[][] getWhites() {
    	String query;
    	double price;
    	int qty;
    	int i = 0;
    	String[][] items = new String[1000][4];
    			
    	try {
    		query = "SELECT itemID, name, salePrice, qty " +
    				"FROM wineSeller.item" +
    				"WHERE color = 'white'";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
    			items[i++][0] = resultSet.getString(1); 
    			items[i++][1] = resultSet.getString(2);
    			price = resultSet.getDouble(3);
    			items[i++][2] = Double.toString(price);
    			qty = resultSet.getInt(4);
    			items[i++][3] = Integer.toString(qty);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    	return items;
    }
    
    public String[][] getReds() {
    	String query;
    	double price;
    	int qty;
    	int i = 0;
    	String[][] items = new String[1000][4];
    			
    	try {
    		query = "SELECT itemID, name, salePrice, qty " +
    				"FROM wineSeller.item" +
    				"WHERE color = 'red'";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
    			items[i++][0] = resultSet.getString(1); 
    			items[i++][1] = resultSet.getString(2);
    			price = resultSet.getDouble(3);
    			items[i++][2] = Double.toString(price);
    			qty = resultSet.getInt(4);
    			items[i++][3] = Integer.toString(qty);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}    	
    	return items;
    }
    
    public String[][] getPinks() {
    	String query;
    	double price;
    	int qty;
    	int i = 0;
    	String[][] items = new String[1000][4];
    			
    	try {
    		query = "SELECT itemID, name, salePrice, qty " +
    				"FROM wineSeller.item" +
    				"WHERE color = 'rose'";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
    			items[i++][0] = resultSet.getString(1); 
    			items[i++][1] = resultSet.getString(2);
    			price = resultSet.getDouble(3);
    			items[i++][2] = Double.toString(price);
    			qty = resultSet.getInt(4);
    			items[i++][3] = Integer.toString(qty);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}    	
    	return items;
    }
    
    
    public void close() {  
        try {  
            connection.close();  
            st1.close();  
            st2.close();  
            if (resultSet != null)   
                resultSet.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }    
    
}
