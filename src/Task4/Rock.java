package Task4;

import java.util.ArrayList;

public class Rock extends Rule{

	ArrayList<String> list = new ArrayList<String>();
	public Rock(int id) {
		super("rock", id);
		list.add("paper");
		list.add("spock");
		addList(list);
	}
}
