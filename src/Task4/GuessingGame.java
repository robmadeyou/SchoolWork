package Task4;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[]args){
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		int tries = 0;
		int random = ran.nextInt(6);
		
		while(scanner.nextInt() != random){
			System.out.println("Sorry, you guessed wrong, try again!");
			tries++;
		}
		tries++;
		System.out.println("Congratulations! The number was: " + random + ". You tried " + tries + " times");
	}
}
