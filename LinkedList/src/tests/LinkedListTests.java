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
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.size(), 2);
	}
	
	@Test
	public void getWithIndexReturnRightElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		assertEquals(list.get(1), "kaks");
	}
	
	@Test
	public void getFirstReturnRightElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		assertEquals(list.get(1), "kaks");
	}
	
	@Test
	public void getLastReturnRightElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		assertEquals(list.get(1), "kaks");
	}
	
	@Test
	public void addIncreasedSize() {
		MyLinkedList list = new MyLinkedList();
		list.add("yks");
		assertEquals(list.size(), 1);
	}
	
	@Test
	public void addedElementInList() {
		MyLinkedList list = new MyLinkedList();
		list.add("yks");
		assertEquals(list.getFirst(), "yks");
	}
	
	@Test
	public void addWithIndexIncreasedSize() {
		MyLinkedList list = new MyLinkedList();
		list.add(0, "yks");
		assertEquals(list.size(), 1);
	}
	
	@Test
	public void addedIndexInRightPosition() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		list.add(0, "uusYks");
		assertEquals(list.getFirst(), "uusYks");
	}
	
	@Test
	public void addedWithIndexOthersShifted() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		System.out.println("Enne lisamist");
		list.add(0, "uusYks");
		assertEquals(list.getFirst(), "uusYks");
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
