package linkedList;

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
		return 0;
	}

	public void add(String string) {
		array[size] = string;
		size++;
	}
	
	
}
