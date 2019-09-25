package Controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Modeles.Map_P;
import Vues.frm_auth;


public class wkf_cpte {

	/*public Boolean pcs_authentifier(String login, String password) {
		
		return null;
	}*/
	
	private Map_P model;
    private frm_auth view;
   
    public wkf_cpte(frm_auth view){
        this.view = view;
       
        view.addLoginListener(new LoginListener());
    }
   
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getUser();
                if(checkUser(model)){
                    view.showMessage("Login succesfully!");
                }else{
                    view.showMessage("Invalid username and/or password!");
                }               
            } catch (Exception ex) {
                view.showMessage(ex.getStackTrace().toString());
            }
        }
    }
   
    public boolean checkUser(Map_P user) throws Exception {
       
        String dbClass = "com.mysql.jdbc.Driver";
        String query = "Select * FROM users WHERE username ='" + user.getUserName()
                + "' AND password ='" + user.getPassword() + "'";

        try {
            Class.forName(dbClass);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users" ,"root","");;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
              return true;
            }
           
            con.close();
        }catch(Exception e) {
        	System.out.println(e);
            throw e;
        }
        return false;
      }
}
