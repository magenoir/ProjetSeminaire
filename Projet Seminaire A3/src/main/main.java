package main;

import Controleurs.wkf_cpte;
import Modeles.Map_P;
import Vues.frm_auth;

public class main {

	public static void main(String[] args) {
		frm_auth theView = new frm_auth();
		Map_P theModel = new Map_P();
		wkf_cpte theController = new wkf_cpte(theView);
		theView.setVisible(true);
	}

}
