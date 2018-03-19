// Exercise4_16v2.java -- Reads 5 numbers between 1-30, and displays the bars of
// asterisk after all 5 numbers are entered.
package exercise4_16v2;

import java.util.Scanner;

public class Exercise4_16v2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // create new scanner
    int bars[] = new int[5]; // array of integers

    for (int x = 0; x < 5; x++) {
      System.out.print("Enter a number between 1-30: ");
      bars[x] = input.nextInt();

      if (bars[x] < 1 || bars[x] > 30) {
        System.out.print("The number must be between 1-30: ");
        bars[x] = input.nextInt();
      } // end if statement

    } // end for loop

    for (int bar : bars) {

      for (int y = 1; y <= bar; y++) {
        System.out.print("*");
      } // end for loop

      System.out.println(); // print each bar on a new line
    } // end for loop

  } // end main

} // end class Exercise4_16v2
