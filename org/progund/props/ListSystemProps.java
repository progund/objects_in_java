package org.progund.props;

import java.util.Properties;

public class ListSystemProps{

  public static void main(String[] args){
    Properties systemProps = System.getProperties();
    systemProps.list(System.out);
  }

}
