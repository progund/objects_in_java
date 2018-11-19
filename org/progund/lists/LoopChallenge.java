package org.progund.lists;

import java.util.ArrayList;

public class LoopChallenge {

  private final static int NO_ARGUMENTS=1;

  public static void main(String[] args) {
    
    if (args.length == 0) {
      System.err.println("You must provide at least one argument.");
      System.exit(NO_ARGUMENTS);
    }

    ArrayList<String> argList = new ArrayList<>();
    for (String arg : args) {
      argList.add(arg);
    }

    System.out.println("You gave " + args.length + " argument(s)");

    for (String arg : argList) {
      System.out.println(arg);
    }

    System.out.println("Here they are in reverse order:");
    
    for (int i = argList.size()-1; i >= 0; i--) {
      System.out.println(argList.get(i));
    }
    
  }
}
