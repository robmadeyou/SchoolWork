package Task6;

import javax.swing.JOptionPane;

public class NameInAHat {
	public static void main(String[] args){
		String[] array = {"Michael Kelly", "Robert Ellis", "Michael Mackin", "Aidan McManus", "Timothy Conway"};
		JOptionPane.showMessageDialog(null,array[(int)Math.round(Math.random() * array.length)]);
	}
}
