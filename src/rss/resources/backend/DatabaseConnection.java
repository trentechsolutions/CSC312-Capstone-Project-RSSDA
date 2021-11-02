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
                + "localhost:3306/rss?zeroDateTimeBehaviour="
                + "convertToNull","root","Douw1998");
            return con;

        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}