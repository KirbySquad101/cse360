/*@author Jacob Daher
 * ID: 358
 * Assignment No. : 2
 * This class takes numeric values and applies simple calculations 
 * and operations to those values, such as adding and subtracting.
 * */

package cse360assign2;

public class Calculator {

	private int total; 
	private String history = "0";

	/*This is the constructor; it uses an int value to keep track off 
	 * for calculations.
	 */

	public Calculator() {

		total = 0;  // not needed - included for clarity
	}

	/* This method returns the int total variable's value.
	 * @return the int total.
	 */

	public int getTotal() {

		return total;
	}

	/*Adds the int value given in the parameter to our int total variable.
	 * @parameter the value we want to add to our total.
	 */

	public void add(int value) {

		total = total + value;
		
		//Adds the text "+ the number we want to add to our total" to the history string.
		history =  history + " + " + value;
	}

	/* Subtracts the int value given in the parameter from our int total variable.
	 * @parameter the value we want subtract from our total.
	 */

	public void subtract(int value) {

		total = total - value;
		
		//Adds the text "- the number we want to subtract from our total" to the history string.
		history =  history + " - " + value;
	}

	/*Finds the product of the value given in the parameter and our total int value.
	 * @parameter the value we want to multiply our total value by.
	 */

	public void multiply(int value) {

		total = total * value;
		
		//Adds the text "* the number we want to multiply our total by" to the history string.
		history =  history + " - " + value;
	}

	/*Finds the dividend of the value given in the parameter and our total int value.
	 * @parameter the value we want to multiply our total value by.
	 */

	public void divide(int value) {

		total = total / value;
		
		//Adds the text "/ the number we want to divide our total from" to the history string.
		history =  history + " - " + value;
	}

	/* Prints the history of all the operation methods and results from this class.
	 * @return the string containing the history of all operations we have made.
	 */

	public String getHistory() {
		
		return history;
	}

}