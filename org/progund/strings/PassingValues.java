package org.progund.strings;

public class PassingValues{
  public static void main(String[] args){
    /* Standard version:
    String firstArgument = "";
    System.out.println("You gave " + args.length + " arguments.");
    if( args.length!=0 ){
      firstArgument = args[0];
      System.out.println("The first argument was: " + firstArgument);
    }
    */
    /* Challenge version:
     */
    String firstArgument = "";
    String argumentString = " argument";
    if( args.length > 1 ){
      argumentString += "s";
    }
    System.out.println("You gave " + args.length + argumentString + ".");
    if( args.length!=0 ){
      firstArgument = args[0];
      System.out.println("The first argument was: " + firstArgument);
    }    
  }
}
