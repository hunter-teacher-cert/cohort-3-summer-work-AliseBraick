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

      System.out.print(ss);
      System.out.println("index = " + ss.binarySearch(4));
	


	      

    }
}