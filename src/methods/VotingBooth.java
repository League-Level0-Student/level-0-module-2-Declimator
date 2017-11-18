package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("How old are you?");
		int xN = Integer.parseInt(x);
		if(xN > 18 || xN == 18) {
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
		}
		else if(xN < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares about what you think");
		}

	}
}
