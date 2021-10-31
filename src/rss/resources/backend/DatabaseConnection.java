package rss.resources.backend;

import java.sql.Connection;
import java.sql.DriverManager;

/**
*
*@author Keanu Johnston
*/
public class DatabaseConnection{

    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://"
                + "localhost:3306/retailsurveyorsystem?zeroDateTimeBehaviour="
                + "convertToNull","root","99KJ@PROm");
            return con;

        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}