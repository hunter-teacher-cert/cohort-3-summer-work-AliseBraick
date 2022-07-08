import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {
//I declared and assign ed at the same time
      
      Time t1 = new Time(4, 20, 15);
      System.out.println("t1: "+ t1.toString());
    
      Time t2 = new Time(5, 40, 10);
      System.out.println("t2: "+ t2.toString());

      t1.add(t2);//test add method
      System.out.println("t1 + t2 : " + t1.toString());

      boolean result = t1.equals(t2);
      System.out.println(result);
      
      
    }

}