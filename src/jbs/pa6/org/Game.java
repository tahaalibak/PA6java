package jbs.pa6.org;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		level_one state = new level_one();
		LinkedList<String> questions = state.getQuestions();
		LinkedList<String> answers = state.getAnswers();
		HashMap<String, String> map = state.getMap();
		int replay = 1;
		int r;
		int c;
		int q;
		int a;
		int moves = 0;
		int remaining = questions.size();
		
		do{
			
			LinkedList<String> qs = level_one.randomizer(questions);
			LinkedList<String> ans = level_one.randomizer(answers);
			System.out.println("Initializing...");
			System.out.println("3x3  game tables formed.");
			System.out.println();
			
			while(remaining>0){
				
				//System.out.println(qs);
				System.out.println("Please enter a row and a column for the question: ");
				r = in.nextInt();
				c = in.nextInt();
				q = level_one.converter(r,c,3);
				System.out.println("Question: "+qs.get(q));
				System.out.println();
				
				//System.out.println(ans);
				System.out.println("Please enter a row and a column for the answer: ");
				r = in.nextInt();
				c = in.nextInt();
				a = level_one.converter(r,c,3);
				System.out.println("Answer: "+ans.get(a));
				System.out.println();
				
				if ((!(qs.get(q).equals("check"))) && map.get(qs.get(q)).equals(ans.get(a))){
					qs.remove(q);
					qs.add(q,"check");
					ans.remove(a);
					ans.add(a,"check");
					System.out.println("Success!");
					remaining = remaining-1;
				}
				else{
					System.out.println("Mis-match! Sorry, try again.");
				}
				System.out.println();
				moves++;				
			}
			
			remaining = questions.size();
			
			System.out.println("Congratulations, you won in "+moves+" moves!");
			System.out.println("Would you like to play again? (0 = no, 1 = yes) ");
			replay = in.nextInt();			
			System.out.println();
			
		}while (replay == 1);
		
	}
	
}
