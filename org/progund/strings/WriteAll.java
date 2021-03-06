package org.progund.strings;

public class WriteAll {

  public static void main(String[] args) {
    /* Classic for loop with printing of index */
    System.out.println("Using classic for loop");
    for (int i = 0; i < args.length; i++) {
      System.out.println("Argument #" + i + ": " + args[i]);
    }

    /* For-each loop with printing of custom index */
    System.out.println("Using for-each loop");
    int index = 0;
    for (String arg : args) {
      System.out.println("Argument #" + index + ": " + arg);
      index++;
    }

    /* Classic for loop without printing of the index */
    System.out.println("Using classic for loop without index");
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    /* For-each loop without printing of index */
    System.out.println("Using for-each loop without index");
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
