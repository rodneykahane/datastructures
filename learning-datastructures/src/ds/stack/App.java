package ds.stack;

public class App {

	public static void main(String[] args) {
		//Stack theStack = new Stack(10);
	      
	 	
	 	//theStack.push(20);
        //theStack.push(40);
        //theStack.push(60);
        //theStack.push(80);   
        
        /*while(!theStack.isEmpty()){
            long value = theStack.pop();	        	
            System.out.println(value);
            
        }*/        
	
	 System.out.println(reverseString("hello"));

}//end main


public static String reverseString(String str) {
	 Stack theStack = new Stack(str.length());
	 String assembler="";
	 
	 for(int i=0;i<str.length();i++) {
		 theStack.push((str.charAt(i)));
	 }
	
	 while(!theStack.isEmpty()){	           
        	char value = theStack.pop();	          
            assembler = assembler+value;
        }		
	return assembler;
}//end reverser

	

}
