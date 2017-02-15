
public class ArrayDeque<E> implements Deque<E> {
	private E[] array;
	private int size;
	private int firstIndex;
	private int lastIndex;
	
	@SuppressWarnings("unchecked")
	public ArrayDeque(int maxSize) {
		array = (E[]) new Object[maxSize];
		size = 0;
		firstIndex = -1;
		lastIndex = -1;
	}
	
	//return the size of the queue
	public int size() {
		return size;
	}
	
	//check if the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
	//insert at the head of the queue
	public void insertFirst(E element) {
		try {
			//trying to locate one index less then the minimum head index
			if (firstIndex<=0) {
				throw new FullStructureException("Array is full to the front. Could not add another element to the front.");
			}
			firstIndex--;
			array[firstIndex] = element;
			size++;
		}
		catch (FullStructureException e) {
			System.out.println("Array is full to the front. Could not add another element to the front.");
			System.out.println(e);
		}
	}
	
	//insert at the tail of the queue
	public void insertLast(E element) {
		try {
			//trying to locate one index more then the maximum tail index
			if (lastIndex+1 >= array.length) {
				throw new FullStructureException("Array is full to the front. Could not add another element to the front.");
			}
			lastIndex++;
			array[lastIndex] = element;
			size++;
			//when the array use to be empty
			if (firstIndex == -1) {
				firstIndex = 0;
			}
		}
		catch (FullStructureException e) {
			System.out.println(e);
		}
	}
	
	//return and remove the first element of the array
	public E removeFirst() {
		E obj = null;
		try {
			//trying to locate one index less then the minimum head index
			if (size == 0) {
				throw new EmptyStructureException("Array is empty. Could not remove the first element.");
			}
			obj = array[firstIndex];
			array[firstIndex] = null;
			firstIndex++;
			size--;
		}
		catch (EmptyStructureException e){
			System.out.println(e);
		}
		finally {
			return obj;
		}
	}
	
	//return and remove the last element of the array
	public E removeLast() {
		E obj = null;
		try {
			//trying to locate one index more then the maximum tail index
			if (size == 0) {
				throw new EmptyStructureException("Array is empty. Could not remove the last element.");
			}
			obj = array[lastIndex];
			array[lastIndex] = null;
			lastIndex--;
			size--;
		}
		catch (EmptyStructureException e){
			System.out.println(e);
		}
		finally {
			return obj;
		}
	}
	
	//return the first element of the array
	public E firstElement() {
		//trying to locate one index less then the minimum head index
		if (size == 0) {
			throw new EmptyStructureException("Array is empty. Could not check the first element.");
		}
		return array[firstIndex];
	}
	
	//return the last element of the array
	public E lastElement() {
		//trying to locate one index more then the maximum tail index
		if (size == 0) {
			throw new EmptyStructureException("Array is empty. Could not check the last element.");
		}
		return array[lastIndex];
		
	}
}
