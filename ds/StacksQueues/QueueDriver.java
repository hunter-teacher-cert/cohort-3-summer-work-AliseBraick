import java.io.*;
import java.util.*;

public class QueueDriver{

    public static void main(String[] args) {
      Queue q = new Queue(); //create an object named q
      for(int i=0; i<10; i++){
        q.enqueue(i);
      }
    // testing enqueue()method  
      System.out.println("The array is "  + q);

    //tersting size()method
      System.out.println("The size of the array is " + q.size());

    //testing isEmpty()
      System.out.println("Is the array emply?" + q.isEmpty());

    //testing front()method
      System.out.println("the front value is " + q.front());

    //testing dequeue() and return front value 
      System.out.println("the new front value after removing the first value is " + q.dequeue());
      System.out.println("the updated array is" + q);

    }
}