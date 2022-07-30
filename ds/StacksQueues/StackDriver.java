import java.io.*;
import java.util.*;

public class StackDriver{

    public static void main(String[] args) {
  // create the object -s-  type stack
	    Stack s = new Stack();
  // testing push()
      s.push(7);
      s.push(10);
      s.push(8);
      s.push(9);
      System.out.println("The stack array is " + s);

  // testing pop ()
      int top = s.pop();  
      System.out.println("The top value that was removed is " + top);
      System.out.println ("The updated stack array is " + s);

    //testing top()
    System.out.println("the top value now is " + s.top());

    //testing isEmpty
      System.out.println("Is the stack empty: " +s.isEmpty());

    // testing size()
      System.out.println("The size of the stack is: " + s.size());
  

}
}