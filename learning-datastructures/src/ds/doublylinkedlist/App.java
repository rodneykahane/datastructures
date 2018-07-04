package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {		
		
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(9999999);
		
		myList.displayList();
		
		
		
		myList.deleteKey(100);
		myList.displayList();
		

	}

}
