public class LinkedList {
    private int maxSize;
    private int[] listArray;
    private int top;
    
    public LinkedList (int s) {
       maxSize = s;
       listArray = new int[maxSize];
       top = -1;
    }
    public void add(int j) {
       listArray[++top] = j;
    }
    
    public long remove() {
       return listArray[1];
    }
    public long getFirst() {
       return listArray[0];
    }
    public boolean isEmpty() {
       return (top == -1);
    }
    public boolean isFull() {
       return (top == maxSize - 1);
    }
   public static void main(String[] args) {
    LinkedList list = new LinkedList(5); 
    list.add(10);
    list.add(20);
    list.add(30);

    if(!list.isEmpty()){
      long first = list.getFirst();
      System.out.println(first);
    }

if(!list.isEmpty()) {
       long value = list.remove();
       System.out.print("remove\t"+value);
       System.out.print(" ");
    }
    System.out.println("");
 }
   }

