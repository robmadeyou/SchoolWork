package Task5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What year where you born in? (Be honest)");
		int yb = scanner.nextInt();
		if(yb % 4 == 0){
			System.out.println("Congratulations, you where born in a leap year");
		}
	}
}
