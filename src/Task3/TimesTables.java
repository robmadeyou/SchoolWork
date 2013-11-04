package Task3;

import java.util.Scanner;

public class TimesTables {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean correctIn = false;
		
		while(!correctIn){
			System.out.println("Please enter 6, 7 or 8 to get the times tables for the number selected");
			String input = scanner.nextLine();
			correctIn = input.equals("6") || input.equals("7") || input.equals(8);
			if(correctIn){
				System.out.println("The six timestables are");
				int number = Integer.parseInt(input);
				for(int i = 0; i < 13; i++){
					System.out.println(number + " x " + i + " = " + (number * i));
				}
			}
		}
		
	}
}
