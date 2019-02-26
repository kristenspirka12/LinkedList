package linkedList;

import java.util.Arrays;
import java.util.List;

public class MyLinkedList {

	public static final int ARRAY_LENGTH = 100;
	private String[] array = new String[ARRAY_LENGTH];
	private int size = 0;

	// Constructor
	public MyLinkedList() {}

	// Constructor with parameter
	public MyLinkedList(String... elements) {
		for (int i = 0; i < Math.min(elements.length, ARRAY_LENGTH); i++) {
			array[i] = elements[i];
		}
	}

	public int size() {
		return size;
	}

	public void add(String string) {
		size++;
	}

	public String getFirst() {
		return null;
	}
	
	public void addElementTo(String element, int index ) {
		array[index] = element;
	}
	
	public void shiftRight(int beg, int end) {
		if (beg > end) 
			throw new IllegalArgumentException("Alguse indeks " + beg + "on suurem kui lõpp " + end);
		
		for (int i = end; i >= beg; i--) {
			array[i+1] = array[i];
		}
	}
	
	public void shiftLeft(int beg, int end) {
		if (beg > end) 
			throw new IllegalArgumentException("Alguse indeks " + beg + "on suurem kui lõpp " + end);
		
		for (int i = beg; i <= end; i++) {
			array[i-1] = array[i];
		}
	}
	
	public String get(int i) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyLinkedList [size=" + size + ", array=" + Arrays.toString(array) + "]";
	}
}
