import java.util.Scanner;
class LeapYear {
   public static void main(String[] args){
      int year;
      System.out.println("please Enter 4 digit an Year : ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
      if (year % 4 == 0) 
         System.out.println("Specified year is a leap year" + "\t" + year);
      else
         System.out.println("Specified year is not a leap year" + year);
   }
}