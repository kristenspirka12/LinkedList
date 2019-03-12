package linkedList;

import java.util.Arrays;

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
			index++;
		}
		
		/*for (int i = elements.length-1; i >= 0; i--) {
			add(index, elements[i]);
		}*/
	}
	
	public void clear() {
		size = 0;
	}
	
	public boolean conteins(String item) {
		return indexOf(item) > -1;
		/*for (int i = 0; i < size; i++) {
			if(get(i).equals(item)) {
				return true;
			}
		}
		return false;*/
	}
	
	public int indexOf(String item) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(item)) {
				return i;
			}
		}
		return -1;
	}
	
	public String poll() {
		String first = getFirst();
		remove();
		return first;
	}
	
	public String pollLast() {
		String last = getLast();
		removeLast();
		return last;
	}
	
	public void remove() {
		remove(0);
	}
	
	public void removeLast() {
		remove(size-1);
	}
	
	public void removeFirstOccurrence(String item) {
		if(conteins(item)) {
			remove(indexOf(item));			
		}
	}
	
	public void remove(int index) {
		shiftLeft(index+1, size);
		size--;
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