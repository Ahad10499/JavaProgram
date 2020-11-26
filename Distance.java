import java.math.*;
public class Distance {

   public static void main(String[] args) {
      int x =Integer.parseInt(args[0]);
      int y =Integer.parseInt(args[1]);

          // Calculating distance 
        double dis = Math.sqrt((x-0)*(x-0) + (y-0)*(y-0));	
      
              System.out.println( "distance between  x, origin" + "\t" + dis); 
          
    }
}
