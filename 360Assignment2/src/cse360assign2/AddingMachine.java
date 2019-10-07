package cse360assign2;
/**
 * @author Daniel Waltman
 * <p>
 * Class ID: 70641
 * <p>
 * Assignment Number: 2
 * <p>
 * This file contains the AddingMachine class that contains six methods
 * and a private integer variable. These methods are a constructor, getter
 * and setters of the private variable, and methods that will produce or
 * clear a string.
 * <p>
 * AddingMachine is a public class that has one private integer variable
 * <code>total</code>, a constructor method, and three methods that are
 * getter and setters for <code>total</code>. The other two methods will
 * produce or clear a string consisting of all of the operations performed
 * on <code>total</code>.
 */
public class AddingMachine {

	private int total;
	
	/**
	 * This method is a constructor method that initializes the private
	 * integer variable <code>total</code> to zero when an instance of
	 * AddingMachine is created.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method serves the purpose of returning the value of 
	 * <code>total</code>. This method is a getter method for the private
	 * integer variable to show the user the value of <code>total</code>.
	 * @return Integer value of the private integer <code>total</code>.
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method serves the purpose of modifying the value of the private
	 * integer <code>total</code>. This setter method adds to <code>
	 * total</code> the passed integer <code>value</code>.
	 * @param	value - an integer to be added to the private integer <code>
	 * total</code>.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * This method serves the purpose of modifying the value of the private
	 * integer <code>total</code>. This setter method subtracts from <code>
	 * total</code> the passed integer <code>value</code>.
	 * @param	value - an integer to be subtracted from the private integer
	 * <code>total</code>.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * This method serves the purpose of showing the operations that have
	 * been done on the private integer <code>total</code> in the form of
	 * a string.
	 * @return a string listing all of the operations performed on the
	 * private integer <code>total</code>
	 */
	public String toString () {
		return "";
	}

	/**
	 * This method serves the purpose of clearing the history of the
	 * operations performed on the private integer <code>total</code>.
	 */
	public void clear() {
	
	}
}