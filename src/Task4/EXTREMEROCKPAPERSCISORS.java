package Task4;

import java.util.Random;
import java.util.Scanner;


public class EXTREMEROCKPAPERSCISORS {
	
	static Rule[] rules = {new Scissors(0), new Paper(1), new Rock(2), new Lizard(3), new Spock(4)};
	public static void main(String[]args){
		Random ran = new Random();
		int cpuChoice = ran.nextInt(5);
		Scanner in = new Scanner(System.in);
		String choice = "";
		boolean inValid = false;
		while(!inValid){
			System.out.println("Please make your choice. Scissors, Paper, Rock, Lizard or Spock");
			choice = in.nextLine();
			for(Rule r : rules){
				if(r.getName().toLowerCase().equals(choice)){
					inValid = true;
				}
			}
		}
		System.out.println("Your choice is: " + choice);
		System.out.println("Computer's choice is: " + getRuleByID(cpuChoice).getName());
		String winner = "";
		
		if(getRuleByID(cpuChoice).checkIfBreaksFrom(choice)){
			winner = "You are the winner!";
		}else if(getRuleByName(choice).checkIfBreaksFrom(getRuleByID(cpuChoice).getName())){
			winner = "CPU wins!";
		}else{
			winner = "It's a draw!";
		}
		System.out.println(winner);
	}
	
	public static Rule getRuleByID(int id){
		for(Rule r : rules){
			if(r.getID() == id){
				return r;
			}
		}
		return null;
	}
	public static Rule getRuleByName(String name){
		for(Rule r : rules){
			if(r.getName().equals(name)){
				return r;
			}
		}
		return null;
	}
	
	
	
	
	
}
