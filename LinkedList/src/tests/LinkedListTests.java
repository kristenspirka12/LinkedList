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
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.getFirst(), "yks");
	}
	
	@Test
	public void getLastReturnRightElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.getLast(), "kaks");
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
		list.add(0, "uusYks");
		assertEquals(list.getFirst(), "uusYks");
		assertEquals(list.get(1), "yks");
	}
	
	@Test
	public void addAllRightElemsInCorrectPosition() {
		MyLinkedList list = new MyLinkedList("yks");
		list.addAll("kaks", "kolm");
		assertEquals(list.get(1), "kaks");
		assertEquals(list.getLast(), "kolm");
	}
	
	@Test
	public void addAllIncreaseSize() {
		MyLinkedList list = new MyLinkedList("yks");
		list.addAll("kaks", "kolm");
		assertEquals(list.size(), 3);
	}
	
	@Test
	public void addAllWithIncreaseSize() {
		MyLinkedList list = new MyLinkedList("yks");
		list.addAll(0, "kaks", "kolm");
		assertEquals(list.size(), 3);
	}
	
	@Test
	public void addAllWithIndexRightElemsInCorrectPosition() {
		MyLinkedList list = new MyLinkedList("esimene", "neljas");
		list.addAll(1, "teine", "kolmas");
//		System.out.println(list);
		assertEquals(list.getFirst(), "esimene");
		assertEquals(list.get(1), "teine");
		assertEquals(list.get(2), "kolmas");
		assertEquals(list.getLast(), "neljas");		
	}
	
	@Test
	public void addFirstIncreaseSize() {
		MyLinkedList list = new MyLinkedList("yks");
		list.addFirst("uus yks");
		assertEquals(list.size(), 2);
	}
	
	@Test
	public void addFirstRightElemToCorrectPosition() {
		MyLinkedList list = new MyLinkedList("yks");
		list.addFirst("uus yks");
		assertEquals(list.getFirst(), "uus yks");
	}
	
	@Test
	public void elementContainsInList() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.conteins("kaks"), true);
	}
	
	@Test
	public void elementNotContainsInList() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.conteins("kolm"), false);
	}
	
	@Test
	public void indexOfElementInList() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.indexOf("kaks"), 1);
	}
	
	@Test
	public void indexOfElementNotInList() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.indexOf("kolm"), -1);
	}
	
	@Test
	public void pollReturnsFirstElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		assertEquals(list.poll(), "yks");
	}
	
	@Test
	public void pollRemovesFirstElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		list.poll();
		assertEquals(list.size(), 1);
		assertEquals(list.getFirst(), "kaks");
	}
	
	@Test
	public void removeTakesFirstElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks");
		list.remove();
		assertEquals(list.size(), 1);
		assertEquals(list.getFirst(), "kaks");
	}
	
	@Test
	public void removeWithIndexFirstRightPosition() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		list.remove(0);
		assertEquals(list.size(), 2);
		assertEquals(list.getFirst(), "kaks");
		assertEquals(list.getLast(), "kolm");
	}
	
	@Test
	public void removeWithIndexMiddleRightPosition() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		list.remove(1);
		assertEquals(list.size(), 2);
		assertEquals(list.getFirst(), "yks");
		assertEquals(list.getLast(), "kolm");
	}
	
	@Test
	public void removeLastCorrectElement() {
		MyLinkedList list = new MyLinkedList("yks", "kaks", "kolm");
		list.removeLast();
		assertEquals(list.size(), 2);
		assertEquals(list.getFirst(), "yks");
		assertEquals(list.getLast(), "kaks");
	}
	
	@Test
	public void removeFirstOccurrenceCorrectElement() {
		MyLinkedList list = new MyLinkedList("kass", "hiir", "koer", "hiir");
		list.removeFirstOccurrence("hiir");
		assertEquals(list.size(), 3);
		assertEquals(list.getFirst(), "kass");
		assertEquals(list.get(1), "koer");
		assertEquals(list.getLast(), "hiir");
	}
	
	@Test
	public void removeFirstOccurrenceNoSuchElement() {
		MyLinkedList list = new MyLinkedList("kass");
		list.removeFirstOccurrence("hiir");
		assertEquals(list.size(), 1);
		assertEquals(list.getFirst(), "kass");
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