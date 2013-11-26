package Task7;

import java.util.Arrays;
import java.util.Random;

public class DOUBLETROUBLEDIEROLL {
	
	static Roll[] list = new Roll[6]; 
	
	public static void dieOne(int i, Random r){
		list[i].set(1+r.nextInt(6), -1);
	}
	public static void dieTwo(int i, Random r){
		list[i].set(-1, 7+r.nextInt(6));
	}
	public static void main(String args[]){
		Random r = new Random();
		for(int i = 0; i < list.length; i++){
			list[i] = new Roll(i);
			dieOne(i, r);
			dieTwo(i, r);
			System.out.println("1st number is: " + list[i].getSt() + " 2nd nubmer is: " + list[i].getNd());
		}
		Arrays.sort(list);
		System.out.println("The highest player is with id: " + list[5].getID()+ " their total was: " + list[5].getTot() + "\nThis was " + (list[5].getTot() - list[4].getTot())+" ahead of the 2nd place");
		
	}
	
	public static class Roll implements Comparable{
		private int id, st, nd;
		public Roll(int id){
			this.id =id;
		}
		public int getSt(){
			return st;
		}
		public int getNd(){
			return nd;
		}
		public int getTot(){
			return st + nd;
		}
		public int getID(){
			return id;
		}
		public void set(int st, int nd){
			if(st != -1){
				this.st = st;
			}else if(nd != -1){
				this.nd = nd;
			}
		}
		@Override
		public int compareTo(Object o) {
			int otherTotal = ((Roll) o).getTot();
			return this.getTot() - otherTotal;
		}
	}
}
