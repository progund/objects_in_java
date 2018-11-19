package org.progund.lists;

import java.util.ArrayList;

public class ArgumentHelper {

  private static final int NO_ARGUMENTS = 1;

  private String[] args;
  private ArrayList<String> argList;

  public ArgumentHelper(String[] args) {
    this.args = args;
    init();
  }
  
  private void init() {
    if ( hasArguments() ) {
      argList = new ArrayList<String>();
      for (String arg : args) {
        argList.add(arg);
      }
    }
  }

  public boolean hasArguments() {
    return args.length != 0;
  }
  
  public void start() {
    if ( hasArguments() ) {
      System.out.println("You gave " + argList.size() + " arguments");
      printArgs();
      printReverse();
    }
  }

  private void printArgs() {
    System.out.println("These were the arguments:");
    for (String arg : argList) {
      System.out.println(arg);
    }
  }

  private void printReverse() {
    System.out.println("Here they are in reverse order:");
    for (int i = argList.size()-1; i >= 0; i--) {
      System.out.println(argList.get(i));
    }
  }
  
  public int exitCode() {
    if ( hasArguments() ){
      return 0;
    } else {
      return NO_ARGUMENTS;
    }
  }

  public String errorMessage() {
    if ( !hasArguments() ) {
      return "You must provide at least one argument!";
    }
    return "";
  }
}
