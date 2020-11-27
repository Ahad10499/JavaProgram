import java.util.*;
public class DecimalToBinary{    
public static void toBinary(int decimal){    
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();//new line  
}    
public static void main(String args[]){     
Scanner d = new Scanner(System.in);
System.out.println("Enter Decimal number");
int dec= d.nextInt();
System.out.println("Enter Decimal number");
int dec1= d.nextInt();

System.out.println("Decimal of "+dec+"  is: ");  
toBinary(dec);    
System.out.println("Decimal of "+dec1+" is: ");  
toBinary(dec1);     
}}   