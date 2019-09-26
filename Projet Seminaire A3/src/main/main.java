package main;

import Controleurs.wkf_cpte;
import Vues.frm_auth;

public class main {

	public static void main(String[] args) {
		frm_auth theView = new frm_auth();
		wkf_cpte theController = new wkf_cpte(theView);
		
		theView.setVisible(true);
	}

}
