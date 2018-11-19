package org.progund.props;

import java.util.Properties;

public class CustomProperties {

  public static void main(String[] args) {
    
    Properties favorites = new Properties();
    favorites.setProperty("favorite.color", "Pink");
    favorites.setProperty("favorite.programming_language", "Java");
    
    Properties systemProps = System.getProperties();
    favorites.setProperty("favorite.encoding",
                          systemProps.getProperty("file.encoding"));
    System.out.println("These are a few of my favorite things:");
    favorites.list(System.out);
    
  }
}
