package Task2;

public class TriangularNum {
	
	public static void main(String args[]){
		Integer[] triNum = new Integer[8];
		triNum[0] = 1;
		for(int i = 1; i < triNum.length; i++){
			triNum[i] = triNum[i-1] + i + 1;
		}
		System.out.println("The first 6 triangular numbers are:");
		for(int i = 0; i < triNum.length; i++){
			System.out.print(triNum[i] + ", ");
		}
	}
}
