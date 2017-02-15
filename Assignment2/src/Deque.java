public interface Deque<E> {
	   public int size();
	   public boolean isEmpty();
	   public void insertFirst(E element) throws FullStructureException;
	   public void insertLast(E element) throws FullStructureException;
	   public E removeFirst() throws EmptyStructureException;
	   public E removeLast() throws EmptyStructureException;
	   public E firstElement() throws EmptyStructureException;
	   public E lastElement() throws EmptyStructureException;
}
