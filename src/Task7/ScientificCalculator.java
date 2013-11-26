package Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class ScientificCalculator {
	public static double add(double x, double y){
		return x + y;
	}
	public static double subtract(double x, double y){
		return x - y;
	}
	public static double multiply(double x, double y){
		return x * y;
	}
	public static double divide(double x, double y){
		return x / y;
	}
	public static double square(double x){
		return x * x;
	}
	public static double cube(double x){
		return x * x * x;
	}
	
	public static String[] breakString(String string){
		String[] brokenUp = new String[5];
		char[] toArray = string.toCharArray();
		
		ArrayList<Character> temp = new ArrayList<Character>();
		int wordsDone = 0;
		for(int i = 0; i < toArray.length; i++){
			if(toArray[i] != ' '){
				temp.add(toArray[i]);
				if(i == toArray.length -1){
					brokenUp[wordsDone] = joinString(temp);
					wordsDone++;
					temp.clear();
				}
			}else{
				brokenUp[wordsDone] = joinString(temp);
				wordsDone++;
				temp.clear();
			}
		}
		
		return brokenUp;
	}
	
	public static String joinString(ArrayList<Character> c){
		String s = "";
		for(int i = 0; i < c.size(); i++){
			s += c.get(i);
		}
		return s;
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void error(int i){
		String end = "st";
		if(i == 1){
			end = "st";
		}else if(i == 2){
			end = "nd";
		}else if(i == 3){
			end = "rd";
		}else{
			end = "th";
		}
		print("There was an error in the " + i + end + " block");
	}
	
	public static void error(int i, String s){
		String end = "";
		if(i == 1){
			end = "st";
		}else if(i == 2){
			end = "nd";
		}else if(i == 3){
			end = "rd";
		}else{
			end = "th";
		}
		print("There was an error in the " + i + end + " block\n" + s);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			print("Correct usage is [operation] [x value] and [y value]");
			String in = scanner.nextLine();
			String[] commands = breakString(in);
			if (commands[0] != null) {
				if (commands[0].equals("exit")) {
					break;
				}
				if (commands[1] != null) {
					if (commands[2] != null || commands[0].startsWith("cub") || commands[0].startsWith("squ")) {
						if (commands[3] != null || commands[0].startsWith("cub") || commands[0].startsWith("squ")) {
							double x = 0,y = 0;
							try{
								x = Double.parseDouble(commands[1]);
								if(commands[3] != null){
									y = Double.parseDouble(commands[3]);
								}
							}catch(Exception e){
								print("Error parsing numbers... are they actualy numbers?");
							}
							if (commands[0].startsWith("add")) {
								print("The sum of "+x+" and "+y+" is " + add(x,y));
							} else if (commands[0].startsWith("sub")) {
								print("The difference between "+x+" and "+y+" is" + subtract(x, y));
							} else if (commands[0].startsWith("div")) {
								print("The result of "+x+" and "+y+" divided is " + divide(x, y));
							} else if (commands[0].startsWith("mul")) {
								print("The product of "+x+" and " +y+" is " + multiply(x, y));
							} else if (commands[0].startsWith("cub")) {
								print("The cube of " + y + " is " + cube(x));
							} else if (commands[0].startsWith("squ")) {
								print("The square of " + x + " is " + square(x));
							} else {
								error(1, "No known operator: " + commands[0]);
							}
						}else{
							error(4, "MISSING! :(");
						}
					}else{
						error(3, "MISSING! :(");
					}
				}else{
					error(2, "MISSING! :(");
				}
			}else{
				error(1);
			}
		}
	}
}
