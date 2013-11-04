package Task4;

import java.util.ArrayList;

public class Lizard extends Rule{

	ArrayList<String> list = new ArrayList<String>();
	public Lizard(int id) {
		super("lizard", id);
		list.add("rock");
		list.add("scissors");
		addList(list);
	}
}
