package travel.management.system;

import java.sql.*;  


public class connect {
    Connection c;
    Statement s;
    public connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ttms","root","root");
            s=c.createStatement();
        }catch(Exception e){
    }
    }
}
