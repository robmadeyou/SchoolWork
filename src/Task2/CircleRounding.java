package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleRounding {
	
	static float Pi;
	static double diameter;
	static double radius;
	static double area;
	static double circumference;
	
	public static void main(String args[]){
		boolean state = false;
		
		while(!state){
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			try{
				diameter = scanner.nextDouble();
				Pi = 3.1415926535897923846264338f;
				radius = diameter / 2;
				area = (radius * radius) * Pi;
				circumference = diameter * Pi;
				state = true;
			}catch(InputMismatchException e){
				System.out.println("Prease enter only enter numbers");
			}
		}
		System.out.printf("Diameter: %1$.2f8" ,diameter);
		System.out.printf("\nArea: %1$.2f" ,area);
		System.out.printf("\nCircumference: %1$.2f" , circumference);
	}
}
