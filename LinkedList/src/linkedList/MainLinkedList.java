package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList<String> llistobj = new LinkedList<String>();
		llistobj.add(0, "tere");
		llistobj.add(0, "teines�na");
		System.out.println(llistobj);
		
		
		//tagurpidi l�bik�imine
		/*for (int i = array.length - 2; i >= 0; i--) {
			System.out.println(array[i]);
			//"nihutamine" paremale
			array[i+1] = array[i];
		}
		System.out.println(Arrays.toString(array)); */
	}
}
