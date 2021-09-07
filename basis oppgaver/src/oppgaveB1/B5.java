package oppgaveB1;

import javax.swing.*;

public class B5 {

	public static void main(String[] args) {
		String poeng = JOptionPane.showInputDialog("Poeng: ");
		
		String Karakter = ""; {
		
		int i = Integer.parseInt(poeng);
		
	 if (i >= 90 && i <= 100) {
		Karakter = "Karakter: A";
		
	 } else if (i >= 80 && i <= 89) {
		 Karakter = "Karakter: B";
		 
	 } else if (i >= 60 && i <= 79) {
		 Karakter = "Karakter: C";
		 
	 } else if (i >= 50 && i <= 59) {
		 Karakter = "Karakter: Maren er homo";
		 
	 } else if (i >= 40 && i <= 49) {
		 Karakter = "Karakter: E";
		 
	 } else if (i >= 39 && i <= 0) {
		 Karakter = "Karakter: F";
		 
	 }
	 JOptionPane.showMessageDialog(null, Karakter);
	 
	 
	
		}

	}
}


