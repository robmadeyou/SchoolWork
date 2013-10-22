package Task4;

import javax.swing.JOptionPane;

public class BusFare {
	public static void main(String[] args){
		double price = 10.50;
		double discount = 3.50;
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		String name = JOptionPane.showInputDialog("What is your name?");
		if(age <= 10){
			price -= discount;
		}
		JOptionPane.showMessageDialog(null, name+ " enjoy your journey!\nThe ticket price is: £" + price);
	}
}
