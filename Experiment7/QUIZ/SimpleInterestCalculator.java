package QUIZ;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input: Annual interest rate in percentage
        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        // Input: Number of months
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        // Convert annual interest rate to decimal
        double rate = annualInterestRate / 100;

        // Calculate total interest
        double years = months / 12.0; // Convert months to years
        double totalInterest = principal * rate * years;

        // Calculate final balance
        double finalBalance = principal + totalInterest;

        // Output the results
        System.out.printf("\nTotal interest: %.2f\n", totalInterest);
        System.out.printf("Final balance: %.2f\n", finalBalance);

        scanner.close();
    }
}
