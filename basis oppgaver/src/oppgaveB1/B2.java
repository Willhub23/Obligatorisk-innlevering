package oppgaveB1;

import javax.swing.*;

public class B2 {

	public static void main(String[] args) {

	
	
	String bel�pStr = JOptionPane.showInputDialog("Bel�p: ");
	String prisStr = JOptionPane.showInputDialog("Pris: ");	
	
	 int bel�p = Integer.parseInt(bel�pStr);
     int pris = Integer.parseInt(prisStr);
     int veksel = bel�p - pris;
     int ant10kr = veksel/10;
 	 int ant1kr = veksel%10;
	
	JOptionPane.showMessageDialog(null, "10kr: " + ant10kr + "\n1kr: " + ant1kr);
	
	
	
	
	
	
	
	
	
	
			
	}

}
