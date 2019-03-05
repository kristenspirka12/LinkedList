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
		size = elements.length;
	}

	public int size() {
		return size;
	}
	
	public String get(int index) {
		return array[index];
	}

	public String getFirst() {
		return this.get(0);
	}
	
	public String getLast() {
		return this.get(this.size()-1);
	}
	
	public void add(String item) {
		add(size, item);
	}
	
	public void addFirst(String item) {
		add(0, item);
	}
	
	public void add(int index, String item) {
		this.shiftRight(index, size);
		array[index] = item;
		size++;
	}
	
	public void addAll(String... elements) {
		for (String element : elements) {
			add(element);
		}
	}
	
	public void addAll(int index, String... elements) {
		for (String element : elements) {
			add(index, element);
		}
	}
	
	/********************************************/
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyLinkedList [size=" + size + ", array=" + Arrays.toString(array) + "]";
	}
}