/**UC3 : PROBLEM STATEMENT
 *Ability to create a Queue of 56->30->70 - Use LinkedList to do the Queue Operations - Here enqueue will internally call append method on LinkedList.
 *- So 56 will be added first then 30 and
 *then 70 to make 56 on top of the Stac
 */
package stack;

public class Main {
	
	/*
	 * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue");
        Queue queue = new Queue();
        queue.enque(56);
        queue.enque(30);
        queue.enque(70);

	}

}
