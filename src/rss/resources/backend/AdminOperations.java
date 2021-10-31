/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.resources.backend;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import rss.resources.backend.DatabaseConnection;

/**
 *
 * @author Keanu
 */
public class AdminOperations {
    
    public static void addProduct(int productID_add, String productName_add,String productDesc_add, double price_add, int stock_add){
        //open connection
        Connection con = DatabaseConnection.getCon();
        
        //Assigning the product name, description, price, stock
        int productID = productID_add;
        String productName = productName_add;
        String productDesc = productDesc_add;
        double priceAdd = price_add;
        int stockAdd = stock_add;

        //Connection connection = connect();
        try{
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO PRODUCT(PRODUCT_ID, PRODUCT_NAME,PRODUCT_DESC, PRICE, STOCK) VALUES('" + productID + "','" + productName + "','" + productDesc + "','" + priceAdd + "','" + stockAdd + "')");
            JOptionPane.showMessageDialog(null, "product added!");
        }
        catch (SQLException e1){
            JOptionPane.showMessageDialog(null, e1);
        }
    }
}
