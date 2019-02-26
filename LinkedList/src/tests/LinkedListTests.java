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
	public void createdListWithParameterHasElements() {
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
		MyLinkedList list = new MyLinkedList();
		list.add("rebane");
		System.out.println(list);
		assertEquals(list.getFirst(), "rebane");
	}
	
//	@Test
//	public void shiftRightCorrectElements() {
//		MyLinkedList list = new MyLinkedList();
//		list.add("esimene");
//		list.add("teine");
//		list.add("kolmas");
//		list.shiftRight(1, 2);
//		//assertEquals(list.get(2), "teine");
//		//assertEquals(list.get(3), "kolmas");
//	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shiftRightCorrectElements() {
		MyLinkedList list = new MyLinkedList();
		list.shiftRight(1, 0);
	}
}
