package Task7;

import java.util.Scanner;

public class FibsAAAAAAAAAAAGANI {
	
	static Integer[] fibArray;
	public static void fib(int i){
		fibArray=new Integer[i+2];
		print("The first "+i+" numbers in a fib array are: ");
		fibArray[0] = 0;
		fibArray[1] = 1;
		for(int j = 2; j < i + 2; j++){
			fibArray[j] = fibArray[j - 2] + fibArray[j - 1];
			print(fibArray[j] + "");
		}
		
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		fib(scanner.nextInt());
	}
	
	
}
