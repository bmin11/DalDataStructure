
public class source {
	private static final int arraySize = 5;

	public static void main(String[] args) {
		testArrayDeque();
	}
	
	//method to test arrayDeque's functionality and exceptions
	private static void testArrayDeque() {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>(arraySize);
		
		//test if adding and removing works as intended
		//adding elements to the tail
		System.out.println("Attempting to add 0 to 4");
		for (int i=0; i<arraySize;i++) {
			a.insertLast(i);
			System.out.println("Added " + a.lastElement());
		}
		
		//removing elements from the head
		System.out.println("\nAttempting to remove 0 to 4");
		for (int i=arraySize-1;i>=0;i--) {
			System.out.println("Removed " + a.removeFirst());
		}
		
		//triggering FullStructureException
		//the exception should not quit the program for further testing
		System.out.println("\nAdding and removal testing is done.\n");
		a = new ArrayDeque<Integer>(arraySize);
		for (int i=0; i<arraySize+1;i++) {
			a.insertLast(i);
			System.out.println(a.lastElement());
		}
		System.out.println();
		
		//triggering EmptyStructureException by removing head and tail from empty array
		a = new ArrayDeque<Integer>(arraySize);
		a.removeFirst();
		System.out.println();
		a = new ArrayDeque<Integer>(arraySize);
		a.removeLast();
		System.out.println();
		
		//triggering EmptyStructureException by removing the head twice from an array size of 1
		//should only trigger at the last line of removal
		a = new ArrayDeque<Integer>(arraySize);
		a.insertLast(0);
		a.removeFirst();
		a.removeFirst();
		
		System.out.println("\narrayDequeTesting is done.");
	}
}
