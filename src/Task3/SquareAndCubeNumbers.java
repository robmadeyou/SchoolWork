package Task3;

import java.util.Scanner;

public class SquareAndCubeNumbers {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean correctInput = false;
		while(!correctInput){
			System.out.print("Enter 1 for squared numbers and 2 for cubed: ");
			String input = scanner.nextLine();
			correctInput = input.equals("1") || input.equals("2");
			for(int i = 0; i < 20; i++){
				if(input.equals("1")){
					System.out.print(i * i + ", ");
				}else if(input.equals("2")){
					System.out.print(i*i*i + ", ");
				}
			}
		}
	}
}
