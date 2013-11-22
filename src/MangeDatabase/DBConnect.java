package MangeDatabase;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fafi
 */
public class DBConnect
{
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private Statement update;
    private Statement delete;
    private int i;
    
    private static DBConnect instance;
    
    
    private DBConnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/WineSeller","root","zzgl0123"
                    );
            st = con.createStatement();
            update = con.createStatement();
            delete = con.createStatement();
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
    }
    
    /**
     * Singleton global access point to instance.
     * @return The instance of the object.
     */
    public static DBConnect getInstance()
    {
    	if(instance == null)
    		instance = new DBConnect();
    	
    	return instance;
    }
    
    /***
 *          ___           ___           ___           ___     
 *         /\__\         /\  \         /\  \         /\  \    
 *        /:/  /        /::\  \       /::\  \       /::\  \   
 *       /:/  /        /:/\ \  \     /:/\:\  \     /:/\:\  \  
 *      /:/  /  ___   _\:\~\ \  \   /::\~\:\  \   /::\~\:\  \ 
 *     /:/__/  /\__\ /\ \:\ \ \__\ /:/\:\ \:\__\ /:/\:\ \:\__\
 *     \:\  \ /:/  / \:\ \:\ \/__/ \:\~\:\ \/__/ \/_|::\/:/  /
 *      \:\  /:/  /   \:\ \:\__\    \:\ \:\__\      |:|::/  / 
 *       \:\/:/  /     \:\/:/  /     \:\ \/__/      |:|\/__/  
 *        \::/  /       \::/  /       \:\__\        |:|  |    
 *         \/__/         \/__/         \/__/         \|__|    
 */
    
    /**
     * Gets a user by id.
     * @param id The user's id.
     * @return 
     */
    public int getUser(int id){
        try{

           /*
            get user by id
            */
           String q = "select * from user where `login_id`="+id;

           int i = update.executeUpdate(q);

        }catch(Exception ex){

            System.err.println(ex);

        }

        return i;
    }

     
    public int searchUser(String st){

        try{

           String q = "select * from user where "+st;

           /*

           make where string specify search parameters

           i.e.

           SELECT * FROM  `user` WHERE state =  'FL' 

           */

           int i = update.executeUpdate(q);

        }catch(Exception ex){

            System.err.println(ex);
        }

        return i;
    }
    
    
    public ResultSet getUsers(){
        try{
          
            String q = "select * from user";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    
    public int createUser(String st){
        try{
/*
INSERT INTO `user`(`login_id`, `password`, `first_name`, `last_name`, `street`,
`city`, `state`, `zip`, `phone`, `email`) 
VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10])
            */
           String q =   "INSERT INTO `user`(`login_id`, `password`, `first_name`, `last_name`, `street`,\n" +
                        "`city`, `state`, `zip`, `phone`, `email`)"+"VALUES ("+st+")";
           int i = update.executeUpdate(st);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteUser(int id){
        try{
           String q = "delete from user where login_id="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int editUser(String st, int id){
        try{
            /*         
 UPDATE  `wineseller`.`reports` SET  `report_id` =  '2',
`report_name` =  'Cloe Out 11/3/2013',
`report_type` =  'Clse Out',
`report_description` =  'An End of day close ot report for WineSeller',
`report_date` =  '2013-11-04' WHERE  `reports`.`report_id` =1;
*/
           String q = " UPDATE  `wineseller`.`user`"+
                      st+" WHERE `user`.`login_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    /***
 *                      ___           ___           ___           ___           ___           ___           ___           ___     
 *          ___        /\__\         /\__\         /\  \         /\__\         /\  \         /\  \         /\  \         |\__\    
 *         /\  \      /::|  |       /:/  /        /::\  \       /::|  |        \:\  \       /::\  \       /::\  \        |:|  |   
 *         \:\  \    /:|:|  |      /:/  /        /:/\:\  \     /:|:|  |         \:\  \     /:/\:\  \     /:/\:\  \       |:|  |   
 *         /::\__\  /:/|:|  |__   /:/__/  ___   /::\~\:\  \   /:/|:|  |__       /::\  \   /:/  \:\  \   /::\~\:\  \      |:|__|__ 
 *      __/:/\/__/ /:/ |:| /\__\  |:|  | /\__\ /:/\:\ \:\__\ /:/ |:| /\__\     /:/\:\__\ /:/__/ \:\__\ /:/\:\ \:\__\     /::::\__\
 *     /\/:/  /    \/__|:|/:/  /  |:|  |/:/  / \:\~\:\ \/__/ \/__|:|/:/  /    /:/  \/__/ \:\  \ /:/  / \/_|::\/:/  /    /:/~~/~   
 *     \::/__/         |:/:/  /   |:|__/:/  /   \:\ \:\__\       |:/:/  /    /:/  /       \:\  /:/  /     |:|::/  /    /:/  /     
 *      \:\__\         |::/  /     \::::/__/     \:\ \/__/       |::/  /     \/__/         \:\/:/  /      |:|\/__/     \/__/      
 *       \/__/         /:/  /       ~~~~          \:\__\         /:/  /                     \::/  /       |:|  |                  
 *                     \/__/                       \/__/         \/__/                       \/__/         \|__|                  
 */

    public ResultSet getInventory() {
        try{
            String q = "select * from inventory";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public int createItem(String st){
        try{
/*
INSERT INTO `inventory`(`inventory_id`, `item_name`, `item_description`, `upc`, 
`qty`, `date_added`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],
     [value-6])
            */
           String q =  " INSERT INTRO `inventory`"+
                       "(`inventory_id`, `item_name`, `item_description`, `upc`," +
                       "`qty`, `date_added`)"+"VALUES ("+st+")";
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteItem(int id){
        try{
           String q = "delete from user where item_id="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    } 
    
    public int editItem(String st, int id){
        try{
          String q = " UPDATE  `wineseller`.`inventory` SET "+
                      st+" WHERE `inventory`.`inventory_id`="+id;
          System.out.println(q);
           int i = update.executeUpdate(q);
           
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
/***
 *          ___           ___           ___       ___           ___     
 *         /\  \         /\  \         /\__\     /\  \         /\  \    
 *        /::\  \       /::\  \       /:/  /    /::\  \       /::\  \   
 *       /:/\ \  \     /:/\:\  \     /:/  /    /:/\:\  \     /:/\ \  \  
 *      _\:\~\ \  \   /::\~\:\  \   /:/  /    /::\~\:\  \   _\:\~\ \  \ 
 *     /\ \:\ \ \__\ /:/\:\ \:\__\ /:/__/    /:/\:\ \:\__\ /\ \:\ \ \__\
 *     \:\ \:\ \/__/ \/__\:\/:/  / \:\  \    \:\~\:\ \/__/ \:\ \:\ \/__/
 *      \:\ \:\__\        \::/  /   \:\  \    \:\ \:\__\    \:\ \:\__\  
 *       \:\/:/  /        /:/  /     \:\  \    \:\ \/__/     \:\/:/  /  
 *        \::/  /        /:/  /       \:\__\    \:\__\        \::/  /   
 *         \/__/         \/__/         \/__/     \/__/         \/__/    
 */
    public ResultSet getSales() {
        try{
            String q = "select * from sales";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public int createSale(String st){
        try{
/*
INSERT INTO `sales`(`sales_id`, `user_id`, `total`, `date`) 
            VALUES ([value-1],[value-2],[value-3],[value-4])
            */
           String q =  " INSERT INTO `sales`"+
                       "(`sales_id`, `user_id`, `total`, `date`)"+"VALUES ("+st+")";
           
           System.out.println(st);
           int i = update.executeUpdate(st);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteSale(int id){
        try{
           String q = "delete from sales where sales_id="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int editSale(String st, int id){
        try{
           String q = " UPDATE  `wineseller`.`sale`"+
                      st+" WHERE `sale`.`sale_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
/***
 *      _____ _                        _____       _     _ 
 *     |_   _| |                      / ____|     | |   | |
 *       | | | |_ ___ _ __ ___  ___  | (___   ___ | | __| |
 *       | | | __/ _ \ '_ ` _ \/ __|  \___ \ / _ \| |/ _` |
 *      _| |_| ||  __/ | | | | \__ \  ____) | (_) | | (_| |
 *     |_____|\__\___|_| |_| |_|___/ |_____/ \___/|_|\__,_|
 *                                  
 */
    public ResultSet getItemsSold() {
        try{
            String q = "SELECT * FROM `items_sold`";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public ResultSet getItemsSold(int salesId) {
        try{
            String q = "SELECT * FROM `items_sold` where sales_id = " + salesId ;
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public ResultSet getItem(int inventoryId) {
         try{
            String q = "SELECT * FROM `inventory` where inventory_id = " +   inventoryId;
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public int createItemsSold(String st){
        try{
/*
INSERT INTO `items_sold`(`items_sold_id`, `item_id`, `qty_sold`, 
            `sales_person_id`, `sale_price`)
            VALUES ([value-1],[value-2],[value-3],[value-4],[value-5])
            */
           String q =  "INSERT INTO `items_sold`(`items_sold_id`, `item_id`, `line_item_number`, `qty_sold`,"
                   + "`sales_person_id`, `sale_price`)"+"VALUES ("+st+")";
           
           System.out.println(st);
           int i = update.executeUpdate(st);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteItemsSold(int id){
        try{
           String q = "DELETE FROM `items_sold` WHERE `items_sold_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int editItemsSold(String st, int id){
        try{
/*
UPDATE `items_sold` SET `items_sold_id`=[value-1],`item_id`=[value-2],
`qty_sold`=[value-3],`sales_person_id`=[value-4],`sale_price`=[value-5] WHERE 1
            */
           String q = "UPDATE `items_sold` SET "+st+" WHERE `items_sold`="+id;
           
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    /***
 *      _____       __                 _ 
 *     |  __ \     / _|               | |
 *     | |__) |___| |_ _   _ _ __   __| |
 *     |  _  // _ \  _| | | | '_ \ / _` |
 *     | | \ \  __/ | | |_| | | | | (_| |
 *     |_|  \_\___|_|  \__,_|_| |_|\__,_|
 *                                       
 *                                       
 */
    public ResultSet getRefund() {
        try{
            String q = "SELECT * FROM `refund`";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    
    public int createRefund(String st){
        try{
/*
INSERT INTO `refund`(`refund_id`, `sale_id`, `refund_amount`, `line_item_number`)
            VALUES ([value-1],[value-2],[value-3],[value-4],[value-5])
            */
           String q =  "INSERT INTO `refund`(`refund_id`, `sale_id`, `refund_amount`, `line_item_number`) "
                        +"VALUES ("+st+")";
           int i = update.executeUpdate(st);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteRefund(int id){
        try{
           String q = "DELETE FROM `refund` WHERE `refund_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int editRefund(String st, int id){
        try{
/*
UPDATE `refund` SET
`refund_id`=[value-1],`sale_id`=[value-2],`refund_amount`=[value-3],`line_item_number`=[value-4]
            */
           String q = "UPDATE `refund` SET "+st+" WHERE `refund_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
   
    /***
 *          ___           ___           ___           ___           ___           ___           ___     
 *         /\  \         /\  \         /\  \         /\  \         /\  \         /\  \         /\  \    
 *        /::\  \       /::\  \       /::\  \       /::\  \       /::\  \        \:\  \       /::\  \   
 *       /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \     /:/\:\  \        \:\  \     /:/\ \  \  
 *      /::\~\:\  \   /::\~\:\  \   /::\~\:\  \   /:/  \:\  \   /::\~\:\  \       /::\  \   _\:\~\ \  \ 
 *     /:/\:\ \:\__\ /:/\:\ \:\__\ /:/\:\ \:\__\ /:/__/ \:\__\ /:/\:\ \:\__\     /:/\:\__\ /\ \:\ \ \__\
 *     \/_|::\/:/  / \:\~\:\ \/__/ \/__\:\/:/  / \:\  \ /:/  / \/_|::\/:/  /    /:/  \/__/ \:\ \:\ \/__/
 *        |:|::/  /   \:\ \:\__\        \::/  /   \:\  /:/  /     |:|::/  /    /:/  /       \:\ \:\__\  
 *        |:|\/__/     \:\ \/__/         \/__/     \:\/:/  /      |:|\/__/     \/__/         \:\/:/  /  
 *        |:|  |        \:\__\                      \::/  /       |:|  |                      \::/  /   
 *         \|__|         \/__/                       \/__/         \|__|                       \/__/    
 */
    
    public ResultSet getReports() {
        try{
            String q = "select * from report";
            rs = st.executeQuery(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return rs;
    }
    

    public int createReport(String st){
        try{
/*
INSERT INTO `reports`(`report_id`, `report_name`, `report_type`, 
            `report_description`, `path`, `report_date`) 
            VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6])
            */
           String q = "INSERT INTO `reports`(`report_id`, `report_name`,"
                      + "`report_type`,`report_description`, `path`, `report_date`)"
                      +"VALUES ("+st+")";
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int deleteReport(int id){
        try{
           String q = "delete from report where report_id="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
    public int editReport(String st, int id){
        try{
 /*         
 UPDATE  `wineseller`.`reports` SET  `report_id` =  '2',
`report_name` =  'Cloe Out 11/3/2013',
`report_type` =  'Clse Out',
`report_description` =  'An End of day close ot report for WineSeller',
`report_date` =  '2013-11-04' WHERE  `reports`.`report_id` =1;
*/
           String q = " UPDATE  `wineseller`.`reports`"+
                      st+" WHERE `reports`.`report_id`="+id;
           int i = update.executeUpdate(q);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return i;
    }
    
}
