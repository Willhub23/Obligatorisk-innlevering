package oppgaveB1;

import javax.swing.*;

public class B2 {

	public static void main(String[] args) {

	
	
	String beløpStr = JOptionPane.showInputDialog("Beløp: ");
	String prisStr = JOptionPane.showInputDialog("Pris: ");	
	
	 int beløp = Integer.parseInt(beløpStr);
     int pris = Integer.parseInt(prisStr);
     int veksel = beløp - pris;
     int ant10kr = veksel/10;
 	 int ant1kr = veksel%10;
	
	JOptionPane.showMessageDialog(null, "10kr: " + ant10kr + "\n1kr: " + ant1kr);
	
	
	
	
	
	
	
	
	
	
			
	}

}
