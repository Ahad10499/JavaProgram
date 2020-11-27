import java.text.NumberFormat;
import java.util.*;

public class MonthlyPayment {
    
   public static double calculateMonthlyPayment(
      int loanAmount, int termInYears, double interestRate) {
       
      // Convert interest rate into a decimal
      // eg. 6.5% = 0.065
       
      interestRate /= 100.0;
       
      // Monthly interest rate 
      // is the yearly rate divided by 12
       
      double monthlyRate = interestRate / 12.0;
       
      // The length of the term in months 
      // is the number of years times 12
       
      int termInMonths = termInYears * 12;
       
      // Calculate the monthly payment
      // Typically this formula is provided so 
      // we won't go into the details
       
      // The Math.pow() method is used calculate values raised to a power
       
      double monthlyPayment = 
         (loanAmount*monthlyRate) / 
            (1-Math.pow(1+monthlyRate, -termInMonths));
       
      return monthlyPayment;
   }
    
   public static void main(String[] args) {
    
    // Prompt user for details of loan
    
    int loanAmount = Integer.parseInt(args[0]);
    int termInYears = Integer.parseInt(args[1]);
    double interestRate = Integer.parseInt(args[2]);
       
      // Display details of loan
       
      double monthlyPayment = 
         calculateMonthlyPayment(loanAmount, termInYears, interestRate);
       
 
      // NumberFormat is useful for formatting numbers
      // In our case we'll use it for 
      // formatting currency and percentage values
       
      NumberFormat currencyFormat = 
         NumberFormat.getCurrencyInstance();
      NumberFormat interestFormat = 
         NumberFormat.getPercentInstance();
 
      // Display details of the loan
 
      System.out.println("Loan Amount: "+
         loanAmount);
      System.out.println("Loan Term: "+
         termInYears+" years");
      System.out.println("Interest Rate: "+
         interestFormat.format(interestRate));
      System.out.println("Monthly Payment: "+monthlyPayment);
 
   }
 
}

