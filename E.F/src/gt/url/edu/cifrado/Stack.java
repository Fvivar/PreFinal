package gt.url.edu.cifrado;

public interface Stack<E> {

	/**
	 * Returns stack elements count
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Checks if stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element in the stack
	 * @param e element to be inserted
	 */
	void push(E e);
	
	/**
	 * Retrieves the last element of the stack without remotion
	 * @return Last stack element (null if empty)
	 */
	E top();
	
	/**
	 * Retrieves the last element of the stack removing it
	 * @return Last stack element (null if empty)
	 */
	E pop();
}
