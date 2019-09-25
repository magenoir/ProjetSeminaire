package Modeles;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Map_P {
    private String userName;
    private String password;
    
    public Map_P(){}
    public Map_P(String user, String password){
        this.userName = user;
        this.password = password;
    }

	public String selectIDbyLoginPassword(String user, String password) {
    	String query = "Select * FROM users WHERE username ='" + user
        + "' AND password ='" + password + "'";
		return query;
	}
	
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}
    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName = userName;}
    
    
    
}