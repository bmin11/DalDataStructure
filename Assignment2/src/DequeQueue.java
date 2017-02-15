
public class DequeQueue implements Queue{
	Deque deque;
	
	public DequeQueue(Deque o) {
		deque = o;
	}

	//return the size of the queue
	public int size() {
		return deque.size();
	}

	//check if the queue is empty
	public boolean isEmpty() {
		return deque.isEmpty();
	}

	//return the first element of the queue
	public Object front() {
		return deque.firstElement();
	}

	//insert at the tail of the queue
	public void enqueue(Object o) {
		deque.insertLast(o);
	}

	//return and remove the first element of the queue
	public Object dequeue() {
		return deque.removeFirst();
	}

}
