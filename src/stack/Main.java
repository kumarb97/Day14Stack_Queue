/**UC1 : PROBLEM STATEMENT
 * Ability to create a Stack of 56->30->70 - Use LinkedList to do the Stack Operations - Here push will internally call add method on LinkedList. - So 70 will be added first then 30 and
then 56 to make 56 on top of the Stack.
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


	}

}
