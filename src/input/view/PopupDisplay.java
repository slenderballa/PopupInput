package input.view;

import javax.swing.JOptionPane;
/** 
 * a popup display class used for showing input and output.
 * @author gswe4645
 *@version 1.0 09/24/5
 */
public class PopupDisplay
{
	/**
	 * Displays the supplied text as a popup window.
	 * @param wordsFromSomewhere
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	/**
	 * Displays a popup with the supplied String parameter with a field to type in a response.
	 * It returns the answer to the supplied question as a String.
	 * @param stuff A question to be displayed in the  popup window.
	 * @return The user's input as a String data type.
	 */
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
