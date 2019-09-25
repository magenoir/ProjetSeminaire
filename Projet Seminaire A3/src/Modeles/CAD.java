package Modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CAD {
	 public boolean GetRow(String rq_sql) throws Exception {

        String dbClass = "com.mysql.jdbc.Driver";
        
        try {
            Class.forName(dbClass);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users" ,"root","");;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(rq_sql);

            if (!rs.next()){return false;}
            con.close();
            
        }catch(Exception e) {
        	System.out.println(e);
            throw e;
        }
        return true;
	 }
	 
	 
	 /*public void ActionRows(String rq_sql) {
		 
	 }*/

	 
	 
	
}
