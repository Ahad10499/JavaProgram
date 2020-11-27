import java.util.*;  
    
public class UnorderedLinked {  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
        LinkedList<Integer> stack = new LinkedList<>(); 
    
        ll.add("abc");  
        ll.add("abc"); 
        ll.add(1, "For");  
        stack.push(10); 
        ll.add("20"); 

        
        // Pop an element from stack 
        Integer ele = stack.pop();

        // Printing the popped element. 
        System.out.println(ele); 
  
        System.out.println(  
            "Initial LinkedList " + ll);  
    
        ll.remove(1);  
    
        System.out.println(  
            "After the Index Removal " + ll);  

            System.out.println("The size of the linked list is: " 
            + ll.size()); 

            System.out.println("The first occurrence of abc is at index:" 
        + ll.indexOf("abc"));

        ll.remove("abc");  
    
        System.out.println(  
            "After the Object Removal " + ll);  

            for(int i=0; i < ll.size(); i++){
                System.out.println("Element at index "+i+" is: "+ll.get(i));
              } 
    }  
}  