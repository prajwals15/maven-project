package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }


  /**
   *@param someone who si going to use this app
   *@return Say Hello to someone
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
