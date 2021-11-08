// This program will provide a loan calculation using input from you! (Jade Park - 5/22/2021)

import java.util.Scanner;

public class LoanCalculation {
   public static void main(String[] args) {
   // Creating a scanner
   Scanner input = new Scanner(System.in);
   
   // Lets the user input an interest rate
   System.out.print("Enter the yearly interest rate as a percentage: ");
   double yearlyInterestRate = input.nextDouble();
   
   // Stores a new variable of the monthly interest rate
   double monthlyInterestRate = yearlyInterestRate / 1200;
   
   // Lets the user input the number of loan years
   System.out.print("Enter the number of loan years as an integer: ");
   int loanYears = input.nextInt();
   
   // Lets the user input a loan amount
   System.out.print("Enter the loan amount: ");
   double loanAmount = input.nextDouble();
   
   // Declaring more variables that'll help with the calculation
   double numberOfPaymentPeriods = loanYears * 12;
   double periodicInterestRate = yearlyInterestRate / 12;
   
   // Calculating the discount factor
   double discountFactor = ((Math.pow((1 + periodicInterestRate), numberOfPaymentPeriods)) - 1) / (periodicInterestRate * (Math.pow(1 + periodicInterestRate, numberOfPaymentPeriods)));
   
   // Declaring the monthly and total payments that'll be outputed
   double monthlyLoanPayment = loanAmount / discountFactor;
   double totalPayment = monthlyLoanPayment * numberOfPaymentPeriods;
   
   // Print statements
   System.out.println("You wrote the yearly interest rate is " + yearlyInterestRate + "%, \nthe number of loan years is " + loanYears + ", \nand the loan amount is $" + loanAmount);
   System.out.println("The monthly payment is $" + monthlyLoanPayment + "\nand the total payment is $" + totalPayment);
}  
}
