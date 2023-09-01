# Loan Amortization Schedule in Java

This Java program demonstrates key programming concepts, including defining variables, using conditional statements, writing loops, obtaining user input, validating input, and displaying output. The program calculates and displays a Loan Amortization Schedule based on user-provided loan details.

## Program Overview

The program performs the following tasks:

1. Calculate the monthly interest rate by dividing the annual interest rate by 1200.
2. Calculate the monthly payment using the formula:
Monthly Payment = loan amount * monthly rate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

3. Calculate the total payment as `(monthly payment * 12) * NumberOfYears`.
4. Display the monthly payment and total payment.
5. Create an amortization schedule showing Payment#, Interest, Principal, and Balance.

## User Input

The program prompts the user for the following inputs:

- Loan Amount
- Number of Years for the Loan
- Annual Interest Rate

Ensure that you enter valid numeric values for these inputs.

## How to Run the Program

1. Ensure you have Java installed on your system.
2. Compile the Java program.
3. Run the compiled program.


