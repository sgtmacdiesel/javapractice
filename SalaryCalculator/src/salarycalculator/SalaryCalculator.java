// SalaryCalculator.java -- Calculate the the salary for each employee
package salarycalculator;

import java.util.Scanner;

public class SalaryCalculator {

  public static void main(String[] args) {
    // create a new instance of a Scanner
    Scanner input = new Scanner(System.in);

    // array of employees
    String[] employees = new String[]{"employee1", "employee2", "employee3"};
    double hours; // local variable hours
    double pay; // local variable pay
    double overtime; // local variable overtime

    for (String employee : employees) {

      // prompt for user input
      System.out.printf("Enter the hourly rate for %s: ", employee);
      pay = input.nextDouble();

      // prompt for user input
      System.out.printf("Enter the amount of hours %s worked: ", employee);
      hours = input.nextDouble();

      if (hours > 40) {
        overtime = hours - 40;
        System.out.printf("Pay for %s is %.2f\n", employee, (hours * pay) + (overtime * (pay * 1.5)));
      } else {
        System.out.printf("Pay for %s is %.2f\n", employee, hours * pay);
      } // end if statement

    } // end for loop

  } // end method main

} // end class SalaryCalculator
