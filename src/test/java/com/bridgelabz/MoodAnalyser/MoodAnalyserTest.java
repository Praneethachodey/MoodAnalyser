package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest 
{
   MoodAnalyser mood=null;
    
//   @Before
//    public void initialise()
//    {
//        mood = new MoodAnalyser();
//    }
    
    
    @Test
    public void shouldReturnHappy_whenGivenHappy() throws MoodAnalyserException
    {
    	mood= new MoodAnalyser("i am in happy mood");
    	String mo = mood.analyseMood();
    	Assert.assertEquals("happy", mo);
    	
    }
    
    @Test
    public void shouldReturnSad_whenGivenSad() throws MoodAnalyserException
    {
    	mood = new MoodAnalyser("i am in sad mood");
    	String mo = mood.analyseMood();
    	Assert.assertEquals("sad", mo);
    	
    }
    
    @Test
    public void shouldReturnNull_whenNull() 
    {
    	try {
    	mood = new MoodAnalyser(null);
    	String mo = mood.analyseMood();
    	}catch(MoodAnalyserException e) {
    	Assert.assertEquals("Enter proper mood", e.getMessage());
    	Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    
    @Test
    public void shouldReturnEmpty_whenEmpty() 
    {
    	try {
    	mood = new MoodAnalyser("");
    	String mo = mood.analyseMood();
    	}catch(MoodAnalyserException e) {
    	Assert.assertEquals("entered empty, enter proper mood", e.getMessage());
    	Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    
}
