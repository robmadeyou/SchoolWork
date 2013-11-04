package Task2;

public class EquationSolver {
	public static void main(String args[]){
		int a=3,b=4,c=5,d=6,
				y = a*b + b*c,
				x =a *(b+c) - 2 * (a+d),
				z = (a^2 + b^2) / c;
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		System.out.println("z: " + z);
	}
}
