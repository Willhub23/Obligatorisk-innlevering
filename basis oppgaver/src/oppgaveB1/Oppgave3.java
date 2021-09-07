package oppgaveB1;

import javax.swing.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String nummer = JOptionPane.showInputDialog("Sett in verdi for n");
		
		int n = Integer.parseInt(nummer);
		long fakultet = 1;
			
				while(n <= 0){
					JOptionPane.showMessageDialog(null, "Tallet kan ikkje være 0 eller mindre");
					nummer = JOptionPane.showInputDialog("Skriv inn tall");
					n = Integer.parseInt(nummer);
					
				}
				
				while (n > 1) {
					fakultet *= n;
					n--;
					 
				}
				
				
				System.out.println(nummer + "!= " + fakultet);
	
		

	}

}
