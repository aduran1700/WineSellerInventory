/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import AccessPoint.AccessPointManager;

import wineseller.DBConnect;
import wineseller.Item;

/**
 *
 * @author aduran1700
 */
public class Sale {

    private ArrayList<Item> items;
    private String saleID;
    private DBConnect dbo;
    public String loginID;
    public double sumTotal;
    public String date;
    private ResultSet rs;

    public Sale() {
        dbo = DBConnect.getInstance();
        this.loginID = AccessPointManager.getInstance().getUser().getUserID();
        this.sumTotal = 0;
        this.items = new ArrayList<>();
    }

    public Sale(String saleID, String userID, double sumTotal, String date) {
        this.saleID = saleID;
        this.loginID = userID;
        this.sumTotal = sumTotal;
        this.date = date;
    }

    public ArrayList<Item> addItemToSale(int itemId, int quntity) {
        try {
            rs = dbo.getItem(itemId);
            if (rs.next()) {
                if (quntity <= rs.getInt(6)) {
                    items.add(new Item(rs.getInt(1) + "", rs.getString(2), rs.getString(3), "", "", "", 0, rs.getDouble(4), quntity));
                    sumTotal += rs.getDouble(4) * quntity;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return items;

    }

    public boolean sellItems() {
        int i = 0;
        int itemsSize = items.size();

        if (itemsSize > 0) {
            String qry = "INSERT INTO `sales` (`user_id`, `total`)  values (" + loginID + ", " + sumTotal + ")";
            dbo.createSale(qry);

            while (i < itemsSize) {
                Item item = items.get(i);
                qry = "INSERT INTO `items_sold`(`item_id`, `line_item_number`, `qty_sold`,`sales_person_id`, `sale_price`) "
                        + "VALUES (" + item.getItemID() + ", " + 0 + ", " + item.getQty() + ", " + loginID + "," + item.getSalePrice() + ")";
                
                
                dbo.createItemsSold(qry);
                rs = dbo.getItem(Integer.parseInt(item.getItemID()));
                try {
                    rs.next();
                    qry = "qty = " + (item.getQty() - rs.getInt(6));
                    dbo.editItem(qry, rs.getInt(1));
                } catch (SQLException ex) {
                    Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }

                i++;

            }
        }
        
        return true;
    }
    
    public ArrayList<Item> getItemsToRefund(int salesId) {
        try {
            rs = dbo.getItemsSold(salesId);
            while (rs.next()) {
                    
                ResultSet rs2 = dbo.getItem(rs.getInt(1));
                
                if(rs2.next())
                    items.add(new Item(rs2.getInt(1) + "", rs2.getString(2), rs2.getString(3), "", "", "", 0, rs2.getDouble(4), rs.getInt(4)));
                    
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return items;

    }
    
    public boolean refund(int itemId) {
        
        String qry = "INSERT INTO `refund`(`sale_id`, `refund_amount`, `line_item_number`) "
                + "VALUES ([value-2],[value-3],[value-4],[value-5])";
        
        dbo.createRefund(date);
        return true;
    } 

    public String getSaleID() {
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

    public String getUserID() {
        return loginID;
    }

    public void setUserID(String userID) {
        this.loginID = userID;
    }

    public double getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(double sumTotal) {
        this.sumTotal = sumTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Sale s = new Sale();

        s.addItemToSale(124, 3);
        s.sellItems();

    }
}
