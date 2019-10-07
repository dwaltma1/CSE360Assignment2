package cse360assign2;
/**
 * @author Daniel Waltman
 * <p>
 * Class ID: 70641
 * <p>
 * Assignment Number: 2
 * <p>
 * This file contains the AddingMachine class that contains six methods
 * and two private variables: an integer and string. These methods are 
 * a constructor and getter and setters of the private variables.
 * <p>
 * AddingMachine is a public class that has one private integer variable
 * <code>total</code>, a private string variable <code>history</code>, a 
 * constructor method, three methods that are getters and setters for 
 * <code>total</code>, and two methods that are getters and setters for
 * <code>history</code>.
 */
public class AddingMachine
{

	private int total;
	private String history;
	
	/**
	 * This method is a constructor method that initializes the private
	 * integer variable <code>total</code> to zero and initializes the
	 * private string <code>history</code> to the string "0" when an 
	 * instance of AddingMachine is created.
	 */
	public AddingMachine ()
	{
		total = 0;
		history = "0";
	}
	
	/**
	 * This method serves the purpose of returning the value of 
	 * <code>total</code>. This method is a getter method for the private
	 * integer variable to show the user the value of <code>total</code>.
	 * @return Integer value of the private integer <code>total</code>.
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * This method serves the purpose of modifying the value of the private
	 * integer <code>total</code>. This setter method adds to <code>
	 * total</code> the passed integer <code>value</code>. This method also
	 * adds to the private string <code>history</code> a string of the
	 * operation performed on <code>total</code>.
	 * @param	value - an integer to be added to the private integer <code>
	 * total</code>.
	 */
	public void add (int value)
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * This method serves the purpose of modifying the value of the private
	 * integer <code>total</code>. This setter method subtracts from <code>
	 * total</code> the passed integer <code>value</code>. This method also
	 * adds to the private string <code>history</code> a string of the
	 * current operation performed on <code>total</code>.
	 * @param	value - an integer to be subtracted from the private integer
	 * <code>total</code>.
	 */
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * This method serves the purpose of showing the operations that have
	 * been performed on the private integer <code>total</code> in the form
	 * of a string.
	 * @return a string listing all of the operations performed on the 
	 * private integer <code>total</code>.
	 */
	public String toString ()
	{
		// Returns the private string history that contains all of the
		// operations performed on the private integer total.
		return history;
	}

	/**
	 * This method serves the purpose of clearing and resetting the string
	 * <code>history</code> containing the list of operations performed 
	 * on the private integer <code>total</code> to "0" and resets the 
	 * value of <code>total</code>.
	 */
	public void clear()
	{
		total = 0;
		history = "" + total;
	}
}
