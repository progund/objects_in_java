package org.progund.lists;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class LoopChallengeVersion2 {

  private final static int NO_ARGUMENTS = 1;
  
  public static void main(String[] args) {

    if (args.length == 0) {
      System.err.println("You must provide at least one argument.");
      System.exit(NO_ARGUMENTS);
    }

    List<String> argList = Arrays.asList(args);

    System.out.println("You gave " + args.length + " argument(s)");

    for (String arg : argList) {
      System.out.println(arg);
    }

    System.out.println("Here they are in reverse order:");
    
    Collections.reverse(argList);

    for (String arg : argList) {
      System.out.println(arg);
    }
    
  }
  
}
