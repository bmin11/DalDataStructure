import java.util.*;

public class LinkedListDeque<E> implements Deque<E>{
	private LinkedList<E> list;
	
	public LinkedListDeque() {
		list = new LinkedList<E>();
	}

	//Return the size of the list
	public int size() {
		return list.size();
	}

	//Check if the list is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//Insert an element at the head of the list
	public void insertFirst(E element) {
		list.addFirst(element);
	}

	//Insert an element at the tail of the list
	public void insertLast(E element) {
		list.add(element);
	}

	//Remove an element at the head of the list
	public E removeFirst() {
		E obj = list.getFirst();
		list.removeFirst();
		return obj;
	}

	//Remove an element at the tail of the list
	public E removeLast() {
		E obj = list.getLast();
		list.removeLast();
		return obj;
	}

	//Check the first element of the list
	public E firstElement() {
		return list.getFirst();
	}

	//Check the last element of the list
	public E lastElement() {
		return list.getLast();
	}
}
