package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly obj = new RWOnly();

    // obj.variable = 10;
    
    obj.setter(100);
    
    int result = obj.getter();
    
    System.out.println(result);
  }
}
