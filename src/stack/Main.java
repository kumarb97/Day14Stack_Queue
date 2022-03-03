/**UC2 : PROBLEM STATEMENT
 * Ability to peak and pop from the Stack till it is empty 56 ->30 ->70 -
 * Use LinkedList to do the Stack Operations.
 * 
 */
package stack;

public class Main {
	
	/*
	 * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and queue");
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.displayStack();
		stack.pop();
		stack.displayStack();


	}

}
