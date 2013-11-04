package Task4;

import java.util.ArrayList;

public class Paper extends Rule{

	ArrayList<String> list = new ArrayList<String>();
	public Paper(int id){
		super("paper", id);
		list.add("lizard");
		list.add("scissors");
		addList(list);
	}
}
