import java.util.*; 
import java.io.*; 
  
public class StackOperation { 

  
      // Main Method 
    public static void main(String args[]) 
    { 
        // Creating an empty Stack 
        Stack<String> mystack = new Stack<String>(); 
  
        // Use push() to add elements into the Stack 
        mystack.push("Welcome"); 
        mystack.push("To"); 
        mystack.push("my"); 
        mystack.push("stack"); 
        mystack.push("program"); 
        
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + mystack); 
  
   System.out.println("Popped element: "
                           + mystack.pop());  

        // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the"
                           + " stack is: " + mystack.peek()); 
  
        // Displaying the Stack after the Operation 
        System.out.println("Final Stack: " + mystack); 
       
    } 
}