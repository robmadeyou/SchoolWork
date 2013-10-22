package Task4;

import java.util.ArrayList;

public class Scissors extends Rule{

	ArrayList<String> list = new ArrayList<String>();
	public Scissors(int id) {
		super("scissors", id);
		list.add("spock");
		list.add("rock");
		addList(list);
	}
}