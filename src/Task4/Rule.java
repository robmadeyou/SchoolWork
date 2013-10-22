package Task4;

import java.util.ArrayList;

public abstract class Rule{
	
	private String name;
	ArrayList<String> list;
	int id;
	public Rule(String name, int id){
		this.name = name;
		this.id = id;
	}
	public void addList(ArrayList<String> list){
		this.list = list;
	}
	
	public String getName(){
		return name;
	}
	public int getID(){
		return id;
	}
	public boolean checkIfBreaksFrom(String name){
		for(String s : list){
			if(s.toLowerCase().equals(name.toLowerCase())){
				return true;
			}
		}
		return false;
	}
}
