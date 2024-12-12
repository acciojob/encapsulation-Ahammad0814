package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly obj = new RWOnly();

    // obj.variable = 10; 
    // Error: 'name' has private access in RWOnly
    
    // System.out.println(obj.variable); 
    // Error: 'name' has private access in RWOnly
    
    obj.setter(100);
    
    int result = obj.getter();
    
    System.out.println(result);
  }
}
