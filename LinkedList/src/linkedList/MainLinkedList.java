package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		/*LinkedList<String> llistobj = new LinkedList<String>();
		llistobj.add(55, "tere");
		llistobj.add(0, "teinesõna");
		System.out.println(llistobj); */
		int[] array = new int[] {5, 6, 7, 0, 0};
		
		//tagurpidi läbikäimine
		for (int i = array.length - 2; i >= 0; i--) {
			System.out.println(array[i]);
			//"nihutamine" paremale
			array[i+1] = array[i];
		}
		System.out.println(Arrays.toString(array));
	}
}
