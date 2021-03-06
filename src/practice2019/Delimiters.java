package practice2019;

import java.util.ArrayList;

public class Delimiters {
	/** The open and close delimiters. */
	private String openDel;
	private String closeDel;

	/**
	 * Constructs a Delimiters object where open is the open delimiter and close is
	 * the close delimiter. Precondition: open and close are non-empty strings.
	 */
	public Delimiters(String open, String close) {
		openDel = open;
		closeDel = close;
	}

	/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
	 public ArrayList<String> getDelimetersList(String[] tokens){
		ArrayList<String> delimeters = new ArrayList<String>();
		for (String token : tokens) {
			if (token.equals(openDel) || token.equals(closeDel)) {
				delimeters.add(token);
			}
		}
		return delimeters;
	}

	/**
	 * Returns true if the delimiters are balanced and false otherwise, as described
	 * in part (b). Precondition: delimiters contains only valid open and close
	 * delimiters.
	 */
	 public boolean isBalanced(ArrayList<String> delimeters) {
		 int numOpen = 0;
		 int numClosed = 0;
		 for(String delimeter : delimeters) {
			 if (delimeter.equals(openDel)) {
				 numOpen++;
			 } else {
				 numClosed++;
			 }
			 
			 if(numClosed > numOpen) { 
				 return false; 
			 }
		 }
		 return numOpen == numClosed;
	 }
	// There may be instance variables, constructors, and methods that are not
	// shown.
}
