package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("How tall are you in inches?");
	int xN = Integer.parseInt(x);
	if(xN > 48 || xN == 48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
	}
	else if(xN < 48) {
		JOptionPane.showMessageDialog(null, "You need to grow a little taller.");
	}
	
}
}
