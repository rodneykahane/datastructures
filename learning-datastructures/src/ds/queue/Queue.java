package ds.queue;

//queues are FIFO

public class Queue {
	private int maxSize; //initializes the set number of slots 
	private long[] queueArray; //slots to main the data
	private int front; //this will be the index position for the element in the front of the line
	private int rear;  //this will be the index position for the element in the back of the line
	private int nItems;  //counter to maintain the number of items in the queue

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;  //index position of the first slot of the array
		rear = -1;  //set to -1 since there are no items in the array yet
		nItems = 0;  //no items in the array yet
	}
		
	public void insert(long j) {
		if(rear == maxSize-1) {
			rear = -1;
		}//overwriting the contents of the queue creates a "circular queue"
		System.out.println("the value of rear is "+rear);
		rear++;	
		queueArray[rear]=j;
		nItems++;	
	}
		
	public long remove() { //remove item from the front of the queue
		long temp = queueArray[front];
		front++;
		if(front==maxSize) {
			front=0;  //set front back to the 0th index so we can use the whole array again
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}



	public void view() {
		System.out.println("maxSize is "+maxSize);
		System.out.print("[ ");
		for(int i=0;i<queueArray.length;i++) {
			System.out.print(queueArray[i]+" ");		
		}
		System.out.print("]");
	}
}
