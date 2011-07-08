package jbs.pa6.org;

import java.util.HashMap;
import java.util.LinkedList;

public class level_one {
	
	private LinkedList<String> level_questions = new LinkedList<String>();
	private LinkedList<String> level_answers = new LinkedList<String>();
	private HashMap<String,String> level_map = new HashMap<String,String>();
	
	public level_one(){
		
		level_questions.add("MA");
		level_questions.add("NY");
		level_questions.add("OH");
		level_questions.add("CA");
		level_questions.add("TX");
		level_questions.add("NJ");
		level_questions.add("AZ");
		level_questions.add("NV");
		level_questions.add("IL");
		level_answers.add("Boston");
		level_answers.add("Rochestor");
		level_answers.add("Cleveland");
		level_answers.add("San Francisco");
		level_answers.add("Houston");
		level_answers.add("Newark");
		level_answers.add("Phoenix");
		level_answers.add("Las Vegas");
		level_answers.add("Chicago");
		
		for(int i = 0; i<level_questions.size(); i++){
			level_map.put(level_questions.get(i),level_answers.get(i));
		}
	}
	
	public LinkedList<String> getQuestions(){
		return this.level_questions;
	}
	
	public LinkedList<String> getAnswers(){
		return this.level_answers;
	}
	
	public HashMap<String,String> getMap(){
		return this.level_map;
	}
	
	/** returns the reference index of a linked list, given coordinates in a table format, along with table width 
	 * returns minus one if invalid entry*/
	public static int converter(int row, int column, int width){
		int index = width*(row-1)+column-1;
		return index;
	}
	
	/** takes a LinkedList<String> and rearranges its values randomly */
	public static LinkedList<String> randomizer(LinkedList<String> input){
		LinkedList<String> random = new LinkedList<String>();
		random.addAll(input);
		for(int i = 0; i<random.size();i++){
			int j = (int) (Math.random()*(random.size()-1));
			String temp = random.get(i);
			random.remove(i);
			random.add(j,temp);
		}
		return random;
	}
}
