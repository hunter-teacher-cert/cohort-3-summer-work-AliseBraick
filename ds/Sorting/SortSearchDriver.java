import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {
    
	    SortSearch ss = new SortSearch(20);
	    System.out.println(ss);
	
      SortSearch sd2 = new SortSearch(10);
	    System.out.println(sd2);
      
	    int i;
	     i = ss.findSmallestIndex(5);
	     System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
	    i = sd2.findSmallestIndex(3);
	     System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);
	
  
	    ss.sort(); //testing sort
	    System.out.println(ss);

  
      System.out.print(ss);//testing linearSearch
      System.out.println("value found at index " + ss.linearSearch(10));

      System.out.print(ss); //testing BinarySearch
      System.out.println("index = " + ss.binarySearch(4));

      System.out.print(ss);//testing recursive Search
      System.out.println(" recursive Search found value at index " + ss.binarySearchRecursive(6 ,0, 19));

  // TestingbuildIncrease 
  ArrayList<Integer> a = ss.buildIncreasingList(5);
	System.out.println(a);

	// build a second Arralist 
	ArrayList<Integer> b = ss.buildIncreasingList(7);
	System.out.println(b);

	// test your merge routine here
      ArrayList<Integer> merged = ss.merge(a, b);
      System.out.println(merged);

  // testing the recursive sortmerge
      SortSearch test = new SortSearch(15);
      test.msort(); 
     System.out.println(test); 

      
  /*    
  int size = 40000;
    long start,elapsed;
	  start = System.currentTimeMillis();
	    //  test below
    SortSearch test = new SortSearch(size);
    // System.out.println(test); 
    // System.out.println("sorting"); 
    test.sort();
    // System.out.println(test); 
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);
      

    start = System.currentTimeMillis();
	    // put what you want to test here!
    test = new SortSearch(size);
    //System.out.println(test); 
   // System.out.println("sorting"); 
    test.msort(); 
    // System.out.println(test); // testing the recursive sortmerge
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);
      */
          
      
    }
}
	