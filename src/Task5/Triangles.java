package Task5;

import java.util.Scanner;

public class Triangles {
	public static void main(String args[]){
		Integer n[] = new Integer[3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i ++){
			System.out.println("Please input a nubmer followed by enter");
			n[i] = scanner.nextInt();
		}
		if(n[0] + n[1] + n[2] == 180){
			System.out.println("That is in fact a real triangle.");
			if(n[0] == n[1] && n[1] == n[2] && n[0] == n[2]){
				System.out.println("It is in fact an Equilateral triangle");
			}else if(n[0] == n[1] || n[1] == n[2] || n[2] == n[0]){
				System.out.println("It is in fact an isosceles triangle");
			}else if(n[0] == 90 || n[1] == 90 || n[2] == 90){
				System.out.println("It is in fact a right angled triangle");
			}else{
				System.out.println("I have no idea what triangle it is so it's probably going to be a scalene triangle");
			}
		}else{
			System.out.println("That's not a real triangle!");
		}
	}
}
