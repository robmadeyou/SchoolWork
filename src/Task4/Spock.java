package Task4;

import java.util.ArrayList;

public class Spock extends Rule{
	ArrayList<String> list = new ArrayList<String>();
	public Spock(int id) {
		super("spock", id);
		list.add("lizard");
		list.add("paper");
		addList(list);
	}
}
