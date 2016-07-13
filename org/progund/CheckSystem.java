package org.progund;

import java.util.Properties;

/**
 * Stand-alone program which prints all system properties to the
 * standard out stream (usually, the console)
 * 
 * To compile, navigate to the directory where the org directory
 * is, and issue the following:
 * javac org/progund/CheckSystem.java
 *
 * To run, in the same directory as above, issue the following:
 * java org.progund.CheckSystem
 */
public class CheckSystem{
  public static void main(String[] args){
    Properties props = System.getProperties();
    props.list(System.out);
  }
}
