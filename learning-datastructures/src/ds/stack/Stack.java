package ds.stack;

public class Stack {
	private int maxSize;
    //private long[] stackArray;
	private char[] stackArray;
    private int top;
    
    public Stack(int size){
        this.maxSize = size;
        //this.stackArray = new long[maxSize];
        this.stackArray = new char[maxSize];
        this.top = -1;
        
    }
    
    
    public void push(char j){
        if(isFull()) {
        	System.out.println("The stack is full");
        } else {       
	    	top++;        
	        stackArray[top]=j;
        }
    }
        
    public char pop(){
        if(isEmpty()) {
        	System.out.println("The stack is empty");
        	return 'X';
        }
    	int old_top = top;       
        top--;
        return stackArray[old_top];
    }
        
/*    public long peak(){
        return stackArray[top];
    }    */
    
    public char peak(){
        return stackArray[top];
    }        
    
    public boolean isEmpty(){
        return (top ==-1);
    }
    
    public boolean isFull(){
        return (maxSize-1 == top);
    }


}
