public class GenericStack {
   private int maxSize;
   private int[] stackArray;
   private int top;
   
   public GenericStack(int s) {
      maxSize = s;
      stackArray = new int[maxSize];
      top = -1;
   }
   public void push(int j) {
      stackArray[++top] = j;
   }
   
   public long pop() {
      return stackArray[top--];
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
    GenericStack theStack = new GenericStack(5); 
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
     
  if(!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print("the value\t"+value);
         System.out.print(" ");
      }
      System.out.println("\n value");
   }
}