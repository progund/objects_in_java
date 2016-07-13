package org.progund.props;

import java.util.Properties;

public class GettingValues{
  public static void main(String[] args){
    Properties systemProps = System.getProperties();
    String javaVersion = systemProps.getProperty("java.version");
    String operatingSystem = systemProps.getProperty("os.name");

    System.out.print("I'm running Java " + javaVersion);
    System.out.println(" on a " + operatingSystem + " machine.");
  }
}
