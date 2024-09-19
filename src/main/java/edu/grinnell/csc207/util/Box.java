package edu.grinnell.csc207.util;

import java.util.Arrays;

public class Box implements DynamicArray<T>{
  // Fields
  T[] types;


  @SuppressWarnings({"unchecked"})
  public SimpleDynamicArray() {
    this.values = (T[]) new Object[4];
  } // SimpleDynamicArray

  public void set(int i, T val) {
    // If the array is not big enough, expand it
    if (this.values.length <= i) {
      int newsize = this.values.length * 2;
      // System.err.println("when newsize = length * 2\n");
      while (newsize <= i) {
        newsize *= 2;
        // System.err.println("inside while loop\n");
      } // while
      this.values = Arrays.copyOf(this.values, newsize);
    } // if the array is no big enough
    // And set the values
    this.values[i] = val;
  } // set(int, T)

  public T get(int i) {
    // If the array is not big enough, just return null
    if (this.values.length <= i) {
      return null;
    } // if the array is not big enough
    // Get the value
    return this.values[i];
  } // get(int)
}
