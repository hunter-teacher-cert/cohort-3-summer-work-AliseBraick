 import java.io.*;
import java.util.*;

public class StackDriver{

    public static void main(String[] args) {
  
	    Stack s = new Stack();
  // testing push()
      s.push(7);
      s.push(10);
      s.push(8);
      s.push(9);
      System.out.println("The array is " + s);

  // testing pop ()
      s.pop();
    System.out.println("The new array is " + s);

    //testing top()
    System.out.println(s.top());

    //testing isEmpty
      System.out.println("Is the stack empty: " +s.isEmpty());

    // testing size()
      System.out.println("The size of the stack is: " + s.size());
  

}
}