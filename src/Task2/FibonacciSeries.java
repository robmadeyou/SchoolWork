package Task2;

public class FibonacciSeries {
	
	public static void main(String args[]){
		Integer[] fibNum = new Integer[8];
		fibNum[0] = 0;
		fibNum[1] = 1;
		for(int i = 2; i < fibNum.length; i++){
			fibNum[i] = fibNum[i - 2] + fibNum[i - 1];
		}
		System.out.println("These are the first " + fibNum.length + " numbers of the Fibonacci series:");
		for(int i = 0; i < fibNum.length; i++){
			System.out.print(", " + fibNum[i]);
		}
	}
}
