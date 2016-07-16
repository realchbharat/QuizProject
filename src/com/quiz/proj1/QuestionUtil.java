package com.quiz.proj1;

import java.util.ArrayList;

public class QuestionUtil {
	public static void main(String[] args) {
	}
	public static ArrayList<Question> getQuestions(String topic){
		ArrayList<Question> questions = new ArrayList<Question>();
		
		ArrayList<String> ops = new ArrayList<String>();
		ops.add("star");ops.add("planet");ops.add("tree");
		Question q = new Question("what is earth?","planet","1",ops);
		
		ops.add("Australia");ops.add("SriLanka");ops.add("NewZeland");
		Question q1 = new Question("for which country sachin is playing?","INDIA","1",ops);


		ops.add("france");ops.add("germany");ops.add("spain");
		Question q2 = new Question("for which country messi was playing ?","Argentina","1",ops);
		
		ops.add("indian pepsi league");ops.add("International premier league");ops.add("iran premier league");
		Question q3 = new Question("what is the full form of ipl?","Indian Premier League","1",ops);

		ops.add("shewag");ops.add("rohit sharma");ops.add("virat kohli");
		Question q4 = new Question("who is the first international player to hit double hundred?","sachin","1",ops);

		
		ops.add("sharukhan");ops.add("salmankhan");ops.add("amirkhan");
		Question q5 = new Question("who is the hero of agneepath movie?","amitha bacchan","1",ops);

		ops.add("Lion");ops.add("Tiger");ops.add("kangroo");
		Question q6 = new Question("which animal runs faster ?","cheetha","1",ops);
		
	
		return questions;
	}

}
