package MangeDatabase;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  

import wineseller.Item;
import ManageSales.Sale;
    
public class DatabaseManager {  
	
    private Connection connection = null;  
    private Statement st1 = null;  
    private Statement st2 = null;  
    private ResultSet resultSet = null;   
    
    
    public DatabaseManager(String user, String pass) {  
       try {  
           Class.forName("com.mysql.jdbc.Driver");  
           connection = DriverManager.getConnection("jdbc:mysql://131.94.132.54/mysql", user, pass); 
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
            connection = DriverManager.getConnection("jdbc:mysql://131.94.132.54/mysql", "root", "root");   
            st1 = connection.createStatement();  
            st2 = connection.createStatement();  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
     }  
        
    

 
    
    public Sale[] getSales() {
    	String query;
    	int i = 0;
    	Sale[] sales = new Sale[100];
    	Sale s;
    			
    	try {
    		query = "SELECT ID FROM telebotcc.session";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
    			s = new Sale("", "", 0, resultSet.getString(1));
    			sales[i++] = s;
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    	return sales;
    }
    
    public Item[] getItems() {
    	String query;
    	int i = 0;
    	Item[] items = new Item[100];
    	Item s;
    			
    	try {
    		query = "SELECT ID FROM telebotcc.session";
    		resultSet = st1.executeQuery(query);
    		while (resultSet.next()) {
    			s = new Item("", "", "", "", "", "", 0, 0, 0);
    			items[i++] = s;
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
