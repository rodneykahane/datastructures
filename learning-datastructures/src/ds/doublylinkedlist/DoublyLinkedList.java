package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public void displayList() {
		System.out.println("Doubly linked List (first --> last) ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

	public boolean isEmpty() {
		return (first==null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			last = newNode;  //if empty, last will refer to the new node being created
		} else {
			first.previous = newNode;
		}

		newNode.next = first; //the new node's next field will point to the old first
		this.first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; //assigning old last to newNode
			newNode.previous = last; //old last will be newNode's previous
		}
		last = newNode; //the linkedlist's last field should point to the new node
	}

	//assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) { //there is only one item in the list
			last = null;
		} else {
			first.next.previous = null;
		}

		first = first.next; //we are assigning the reference of the node following the old first node to the first field in the linked list object
		return temp;//returned the deleted old first node		
	}

	//assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) {
			//last = null; //my answer
			first = null; //correct answer
		} else {
			last.previous.next = null;
		}

		last = last.previous;		
		return temp;
	}

	//lecture 16
	public boolean insertAfter(int key, int data) {
		Node current = first;
		while(current.data != key ) {
			current = current.next;
			if(current == null) {
				return false;
			}//end if
		}//end while

		Node newNode = new Node();
		newNode.data = data;

		if(current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}

		newNode.previous = current;
		current.next = newNode;

		return true;
	}

	//assume non-empty list
	public Node deleteKey(int key) {
		Node current = new Node();

		current = first;
		while(current.data != key) {
			current = current.next;
			if(current==null) {
				System.out.println("key not found");
				System.exit(1);				
			}
		}		

		if(current==last) {
			deleteLast();
		} else if (current==first){ 
			deleteFirst();
		}else if (current.data==key){
			current.previous.next = current.next;
			current.next.previous = current.previous;

		} 

		return current;
	}//end deleteKey
	
}//end class
