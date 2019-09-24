package Modeles;

public class Map_P {
	/*public String selectIDbyLoginPassword(String login, String password) {
		
		return password;
	}*/

    private String userName;
    private String password;
  
    public Map_P(){
      
    }
  
    public Map_P(String username, String password){
        this.userName = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
