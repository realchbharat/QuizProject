package com.quiz.proj1;

import java.util.ArrayList;

public class Question {
	public String desc, rightAnswer, questionId;
	ArrayList<String > options = new ArrayList<String>();
	public Question(String desc, String rightAnswer, String questionId,
			ArrayList<String> options) {
		this.desc = desc;
		this.rightAnswer = rightAnswer;
		this.questionId = questionId;
		this.options = options;
	}

}
