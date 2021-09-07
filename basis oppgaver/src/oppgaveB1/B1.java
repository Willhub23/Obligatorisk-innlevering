package oppgaveB1;


import javax.swing.*;

public class B1 {

	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("Kule radius:");
		double r = Double.parseDouble(in);
		
		double volume = (4.0 / 3.0) * Math.PI * (r*r*r);
		JOptionPane.showMessageDialog(null, "Volume: " + volume);
		
		

		
		
		

	}

}
