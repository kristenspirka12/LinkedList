package linkedList;

import java.util.Arrays;
import java.util.List;

public class MyLinkedList {

	private String[] array;
	private int size;

	// Constructor
	public MyLinkedList() {
		array = new String[100];
	}

	// Constructor with parameter
	public MyLinkedList(List<String> list) {
		
	}

	public int size() {
		return size;
	}

	public void add(String string) {
		size++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyLinkedList [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}
	
	
}
