package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly obj = new RWOnly();

    // obj.name = 10; 
    // Error: 'name' has private access in RWOnly
    
    // System.out.println(obj.name); 
    // Error: 'name' has private access in RWOnly
    
    obj.setName("My Name");
    
    System.out.println(obj.getName());
  }
}
