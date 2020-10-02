package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {
	
	
	String message=null;
	
	
	public MoodAnalyser()
	{
		
	}
	
	public MoodAnalyser(String message)
	{
		this.message=message;
	}

	
	public String analyseMood() throws MoodAnalyserException
	{
		try {
			if(this.message.length()==0) throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "entered empty, enter proper mood");
		if(this.message.contains("sad"))
				return "sad";
		
			return "happy";
		}
		catch(NullPointerException e)
		{
			//System.out.println("given null");
			//return "happy";
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter proper mood");
		}
	}
}

