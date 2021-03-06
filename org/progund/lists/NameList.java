package org.progund.lists;

import java.util.ArrayList;

public class NameList {

  public static void main(String[] args) {
    
    ArrayList<String> nameList = new ArrayList<String>();
    nameList.add("Adam");
    nameList.add("Ana");
    nameList.add("Bart");
    nameList.add("Lisa");

    System.out.println("We now have " + nameList.size() + " names:");
    System.out.println(nameList);

    if ( nameList.contains("Bart") ) {
      System.out.println("The index of Bart is " + nameList.indexOf("Bart"));
    }

    nameList.remove("Bart");
    System.out.println("We now have " + nameList.size() + " names");

    if ( nameList.contains("Bart") ) {
      System.out.println("Bart is still there!");
    } else {
      System.out.println("There is no Bart in the list any more.");
    }
    
    System.out.println("Let's clear the list!");
    nameList.clear();
    System.out.println("We now have " + nameList.size() + " names");

    if ( nameList.isEmpty() ) {
      System.out.println("The list is now empty.");
    }
    
  }
}
