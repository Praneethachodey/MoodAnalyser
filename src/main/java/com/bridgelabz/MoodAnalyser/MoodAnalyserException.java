package com.bridgelabz.MoodAnalyser;

public class MoodAnalyserException extends Exception {

	
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY;
	}
	
	ExceptionType exceptionType;
	
	public MoodAnalyserException(ExceptionType exceptionType ,String message) {
		super(message);
		this.exceptionType=exceptionType;
	}
	
}
