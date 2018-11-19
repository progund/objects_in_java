package org.progund.lists;

public class LoopChallengeOOVersion {

  public static void main(String[] args) {
    ArgumentHelper argHelper = new ArgumentHelper(args);

    if (argHelper.hasArguments()) {
      argHelper.start();
    } else {
      System.err.println(argHelper.errorMessage());
    }
    
    System.exit(argHelper.exitCode());
  }
}
