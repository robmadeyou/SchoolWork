package Task3;

public class InTheRed {
	public static void main(String[] args){
		int savings = 700, month = 0, danger = 32, spend = 32;
		while(savings >= danger){
			month++;
			savings -= spend;
			System.out.println("Month: " + month + "  Savings: £" + savings + "  You still have enough");
		}
		System.out.println("Whooops! No more. You have £"  + savings + " left, need £" + (spend - savings) + " to pay again");
	}
}
