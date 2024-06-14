package contronller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



import View.Register;
import View.Login;

public class Controrller implements ActionListener{
	 
      private Register register ;
      private Login sanBong;
      
      
     
  
	public Controrller(Register register) {
		this.register = register;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Register")) {
			register = new Register();
			register.setVisible(true);
			
		}
		

}
}
