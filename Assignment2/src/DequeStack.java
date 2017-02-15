
public class DequeStack implements Stack{
	Deque deque;
	
	public DequeStack(Deque o) {
		deque = o;
	}

	//Return the size of the stack
	public int size() {
		return deque.size();
	}

	//Check if the stack is empty
	public boolean isEmpty() {
		return deque.isEmpty();
	}

	//return the top element of the stack
	public Object top() {
		return deque.lastElement();
	}

	//return and remove the top element of the stack
	public Object pop() {
		return deque.removeLast();
	}

	//insert an element into the tail of the stack (which is the head really)
	public void push(Object o) {
		deque.insertLast(o);
	}

}
