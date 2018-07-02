package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;
	public int cnt=0;
	
	//constructor
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	
	//used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = first;
	
		first = newNode;
		if(cnt==0) {
			System.out.println("inside last checker");
			last = first;
			displayLast();
			cnt++;
			
		}
	}//end insertFirst
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayLast() {
		System.out.println("node last contains : ");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void insertLast(int data) {
		/*Node current = first;
		while(current.next != null) {
			current=current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;*/
	
		Node current = last;
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
	}

}
