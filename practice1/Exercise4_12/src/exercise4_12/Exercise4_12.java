//Exercise412.java -- Calculate the product of the odd integers from 1 to 15
package exercise4_12;

public class Exercise4_12 {

  public static void main(String[] args) {
    int product = 1; // the product to add to

    // iterate through all odd integers from 3 to 15
    for (int x = 3; x <= 15; x += 2) {
      product *= x;
    } // end for loop

    System.out.printf("Product is %d\n", product);
  } // end main

} // end Exercise4_12
