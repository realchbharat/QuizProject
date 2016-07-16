package com.quiz.proj1;

import java.util.ArrayList;


public class QuestionScreen {
	public static ArrayList<Question> getQuestions(String topic){
		ArrayList<Question> questions  = new ArrayList<Question>();
	
	ArrayList<String> ops = new ArrayList<String>();
	ops.add("star");ops.add("planet");ops.add("tree");
	Question q1 = new Question("what is earth?","planet","1",ops);
	questions.add(q1);
	
	ops.add("Australia");ops.add("SriLanka");ops.add("NewZeland");
	Question q2 = new Question("for which country sachin is playing?","INDIA","1",ops);
	questions.add(q1);
	

	ops.add("france");ops.add("germany");ops.add("spain");
	Question q3 = new Question("for which country messi was playing ?","Argentina","1",ops);
	questions.add(q1);
	
	ops.add("indian pepsi league");ops.add("International premier league");ops.add("iran premier league");
	Question q4 = new Question("what is the full form of ipl?","Indian Premier League","1",ops);
	questions.add(q1);
	
	ops.add("shewag");ops.add("rohit sharma");ops.add("virat kohli");
	Question q5 = new Question("who is the first international player to hit double hundred?","sachin","1",ops);
	questions.add(q1);
	
	ops.add("sharukhan");ops.add("salmankhan");ops.add("amirkhan");
	Question q6 = new Question("who is the hero of agneepath movie?","amitha bacchan","1",ops);
	questions.add(q1);
	
	ops.add("Lion");ops.add("Tiger");ops.add("kangroo");
	Question q7 = new Question("which animal runs faster ?","cheetha","1",ops);
	questions.add(q1);
	
	return questions;

}
}
