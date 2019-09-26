package Controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modeles.CAD;
import Modeles.Map_P;
import Vues.frm_auth;


public class wkf_cpte {
	private Map_P model;
    private frm_auth view;
    private CAD bddConnect;
   
    public wkf_cpte(frm_auth view){
        this.view = view;
        view.addLoginListener(new LoginListener());
    }
   
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if(pcs_authentifier(view.getTxtUsername().getText(), view.getTxtPassword().getText())){view.showMessage("Combinaison valide");}
                else{view.showMessage("Combinaison incorrect");}               
            } catch (Exception ex) {view.showMessage(ex.getStackTrace().toString());}
        }
    }
   
    public boolean pcs_authentifier(String login, String password) throws Exception {
    	model = new Map_P();
        bddConnect = new CAD();
    	
        String query = model.selectIDbyLoginPassword(login, password);
        bddConnect.GetRow(query);
        
    	if(bddConnect.getReturnResult() != null){return true;}
    	else {return false;}
      }
}
