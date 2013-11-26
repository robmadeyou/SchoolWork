package Task7;

import java.util.Random;

public class MagicCards {
	
	static String[][] cards = new String[4][13];
	
	
	public static void main(String[] args){
		//cards[0] = "spades";
		//cards[1] = "hearts";
		//cards[2] = "diamonds";
		//cards[3] = "clubs";
		
		for(int i = 0; i < cards.length; i++){
			cards[i][0] = "2";
			cards[i][1] = "3";
			cards[i][2] = "4";
			cards[i][3] = "5";
			cards[i][4] = "6";
			cards[i][5] = "7";
			cards[i][6] = "8";
			cards[i][7] = "9";
			cards[i][8] = "10";
			cards[i][9] = "jack";
			cards[i][10] = "queen";
			cards[i][11] = "king";
			cards[i][12] = "ace";
		}
		Random random = new Random();
		int type = random.nextInt(4);
		int actual = random.nextInt(13);
		
		if(type == 0){
			System.out.println("Spades " + cards[type][actual]);
		}else if(type == 1){
			System.out.println("Hearts " + cards[type][actual]);
		}else if(type == 2){
			System.out.println("Diamonds " + cards[type][actual]);
		}else if(type == 3){
			System.out.println("Clubs " + cards[type][actual]);
		}
	}
}
