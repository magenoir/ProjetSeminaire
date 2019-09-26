package Modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CAD {
	public String returnResult;
	public Connection con;
	
	public CAD() throws Exception {
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass);
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users" ,"root","");;

	}
	 public ResultSet GetRow(String rq_sql) throws Exception {
        try {
            Statement stmt = this.con.createStatement();
            ResultSet rs = stmt.executeQuery(rq_sql);
            if(rs.next()) {setReturnResult(rs.getString(2));}
            return rs;
        }catch(Exception e) {
        	System.out.println(e);
            throw e;
        }
	 }

	public String getReturnResult(){return returnResult;}
	public void setReturnResult(String returnResult){this.returnResult = returnResult;}
	
}
