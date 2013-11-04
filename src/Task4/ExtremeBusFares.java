package Task4;

import javax.swing.JOptionPane;

public class ExtremeBusFares {
	public static void main(String[]args){
		double price = 10.50;
		double discount = 3.50;
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		String name = JOptionPane.showInputDialog("What is your name?");
		if(age > 10 && age <= 18){
			price -= discount;
		}else if(age <= 5 || age > 75){
			price = 0;
		}else if(age > 5 && age <= 10 || age >= 60 && age < 75){
			price *= 0.5;
		}else{
			System.out.println("YOU'RE TOO OLD FOR CHEAP STUFF, PAY THE FULL PRICE NOW (it's £" + price + ") HA!");
		}
		JOptionPane.showMessageDialog(null, name+ " enjoy your journey!\nThe ticket price is: £" + price);
	}
}
