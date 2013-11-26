package Task7;

public class CalculatorMethods {
	
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
	
	public static void main(String[]args){
		double x = 1234.5, y = 25.5, sum = add(x,y), difference = subtract(x, y), product = multiply(x, y), division = divide(x, y);
		System.out.println("The sum of "+x+" and "+y+" is " + sum +
							"\nThe difference between "+x+" and "+y+" is " + difference +
							"\nThe product of "+x+" and "+y+" is " + product +
							"\nThe result of "+x+" and "+y+" divided is " + division);
	}
}
