import java.util.*;
;public class Temprature {
      public static void main (String args[])  
       { 
           double Fahrenheit, Celsius;  
           Scanner s1 = new Scanner(System.in);

          System.out.println("enter Temperatur in celsius : ");

             Celsius = s1.nextDouble();

             Fahrenheit =((Celsius*9)/5)+32;  
             System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
             double celsius, fahrenheit;

             Scanner s = new Scanner(System.in);
     
             System.out.print("Enter temperature in Fahrenheit:");
     
             fahrenheit = s.nextDouble();
     
             celsius = (fahrenheit-32)*(0.5556);
     
             System.out.println("Temperature in Celsius:"+celsius);        
       }
    }  


