package com.bessasparis.mike.sscp;

import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;


public class Randomize {
	
	public static int random(JSONObject qObject) throws JSONException {
		
		int quizLength = qObject.length();
		
		Random rand = new Random();
		
		return rand.nextInt(quizLength);
		
	}

}
