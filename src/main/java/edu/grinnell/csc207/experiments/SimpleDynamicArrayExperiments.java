package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.DynamicArray;
import edu.grinnell.csc207.util.SimpleDynamicArray;

import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * Some simple experiments with dynamic arrays.
 */
public class SimpleDynamicArrayExperiments {

  // +----------------+----------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Square a big integer.
   *
   * @param i
   *   The value to square.
   *
   * @return i*i.
   */
  public static BigInteger square(BigInteger i) {
    return i.multiply(i);
  } // square(BigInteger)

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    DynamicArray numbers 
      = new SimpleDynamicArray();

    // Set some values
    for (int i = 0; i < 10; i++) {
      numbers.set(i, BigInteger.valueOf(i));
    } // for i

    // Get some values
    for (int i = 0; i < 10; i++) {
      pen.println("numbers[" + i + "] = " + numbers.get(i));
    } // for i

    // Do some simple computations
    for (int i = 0; i < 10; i++) {
      pen.println(numbers.get(i) + "^2 = " + square((BigInteger)numbers.get(i)));
    } // for i

    // Lab Work:
    
    DynamicArray strings = new SimpleDynamicArray();

    for (int i = 0; i < 10; i++) {
      strings.set(i, "Hello" + i);
    } // code to put values in the array

    for (int i = 0; i < 10; i++) {
      pen.println("strings[" + i + "] = " + strings.get(i));
    } // code to print

    
  } // main(String[])
} // class SimpleDynamicArrayExperiment
