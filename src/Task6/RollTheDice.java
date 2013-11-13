package Task6;

public class RollTheDice {
	public static void main(String[] args){
		Integer[] diceTimes = {0,0,0,0,0,0};
		for(int i = 0; i < 100; i++){
			diceTimes[(int) (Math.random() * diceTimes.length)]++;
		}
		System.out.println("Index\tSizes");
		for(int i = 0; i < diceTimes.length; i++){
			System.out.println(i + 1 +"\t"+ diceTimes[i]);
		}
	}
}