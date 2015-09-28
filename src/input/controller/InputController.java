package input.controller;

import input.model.Thingy;
import input.view.PopupDisplay;

public class InputController
{
	private PopupDisplay myPopups;
	private Thingy myTestThingy;
	public InputController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in: " + myName);
		
		
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -99999;
		}
		
		myPopups.showResponse("You typed " + myAge);
		
		String tempW=myPopups.grabAnswer("Type in your weight");
		
		double myWeight;
		if(isDouble(temp))
		{
			myWeight = Double.parseDouble(tempW);
		}
		else
		{
			myWeight = -9999;
		}
		
		
		
		
		
		
		myPopups.showResponse("You typed" + myWeight);
		
		
		myTestThingy = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		 
		try
		//Only return true if it can convert what you typed in into a number
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		
		return isDouble;
	}
}
