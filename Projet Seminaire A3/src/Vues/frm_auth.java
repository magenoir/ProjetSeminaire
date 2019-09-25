package Vues;

//http://coderandcode.blogspot.com/2013/08/mvc-model-example-with-login-application.html
/*
 * 
 * DONE
 *
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Modeles.Map_P;

public class frm_auth extends JFrame implements ActionListener{
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
  
    public frm_auth(){
        super("Login MVC Projet Seminaire");
      
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        txtPassword.setEchoChar('*');
        btnLogin = new JButton("Login");
      
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Username :"));
        content.add(txtUsername);
        content.add(new JLabel("Password :"));
        content.add(txtPassword);
        content.add(btnLogin);
        
        btnLogin.addActionListener(this);
      
        this.setContentPane(content);
        this.pack();
      
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
    public JTextField getTxtUsername(){return txtUsername;}
	public void setTxtUsername(JTextField txtUsername){this.txtUsername = txtUsername;}
	public JPasswordField getTxtPassword(){return txtPassword;}
	public void setTxtPassword(JPasswordField txtPassword){this.txtPassword = txtPassword;}

	public void showMessage(String msg){JOptionPane.showMessageDialog(this, msg);}
    public void addLoginListener(ActionListener log){btnLogin.addActionListener(log);}
	
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}