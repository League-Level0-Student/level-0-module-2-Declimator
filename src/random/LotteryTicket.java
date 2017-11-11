package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {

	public static void main(String[] args) {
		int x;
		String ax = "";

		for(int i = 0; i < 5; i ++) {

			 x = new Random().nextInt(60);
			 ax = ax + Integer.toString(x);


		}

JOptionPane.showMessageDialog(null, "Your lottery ticket is " + ax);
}
}
