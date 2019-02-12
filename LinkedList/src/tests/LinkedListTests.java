package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import linkedList.MyLinkedList;

public class LinkedListTests {

	@Test
	public void createdListHasNoElements() {
		MyLinkedList list = new MyLinkedList();
		assertEquals(list.size(), 0);
	}
	
	@Test
	public void addIncreaseListSize() {
		MyLinkedList list = new MyLinkedList();
		list.add("hobune");
		assertEquals(list.size(), 1);
	}
	
	@Test
	public void addElementAddedToList() {
		
	}
}
