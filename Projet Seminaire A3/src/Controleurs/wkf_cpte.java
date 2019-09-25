package Controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modeles.CAD;
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
                if(checkUser(view.getTxtUsername().getText(), view.getTxtPassword().getText())){view.showMessage("Combinaison valide");}
                else{view.showMessage("Combinaison incorrect");}               
            } catch (Exception ex) {view.showMessage(ex.getStackTrace().toString());}
        }
    }
   
    public boolean checkUser(String user, String password) throws Exception {
    	System.out.println(user + password);
    	model = new Map_P();
    	String query = model.selectIDbyLoginPassword(user, password);
        CAD bddConnect = new CAD();
    	System.out.println(query);
    	if(bddConnect.GetRow(query)){return true;}
    	else {return false;}
      }
}
