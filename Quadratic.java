import java.util.Scanner;
import java.math.*;
public class Quadratic {
   public static void main(String args[]){
      double secondRoot = 0, firstRoot = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextInt();

      System.out.println("Enter the value of b ::");
      double b = sc.nextInt();

      System.out.println("Enter the value of c ::");
      double c = sc.nextInt();

      double delta = (b*b)-(4*a*c);
      double sqr = Math.sqrt(delta);
      System.out.println("value of delta: " + sqr);

      if(delta>0){
         firstRoot = (-b + sqr)/(2*a);
         secondRoot = (-b - sqr)/(2*a);
         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
      }
      else if(delta == 0){
         System.out.println("Root is :: "+(-b + sqr)/(2*a));
      }
   }
}

