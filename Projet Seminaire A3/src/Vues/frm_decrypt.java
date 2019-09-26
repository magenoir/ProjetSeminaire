package Vues;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class frm_decrypt extends JFrame implements ActionListener{

	JButton open = new JButton("Selectionner un fichier à Decrypter");
	private String path;
	public frm_decrypt() {
		super("Explorateur de fichier");
		setSize(450,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		open.addActionListener(this);
		JPanel pane = new JPanel();
		BorderLayout bord = new BorderLayout();
		pane.setLayout(bord);
		pane.add("Center", open);
		setContentPane(pane);
		setVisible(true);
	}
	
	public String GetPath() {
		return this.path;
	}
	
	public void SetPath(String path) {
		this.path = path;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		
		 this.path = chooser.getSelectedFile().getAbsolutePath();  
		 System.out.println(this.path);
		 
		
	}

	
}
