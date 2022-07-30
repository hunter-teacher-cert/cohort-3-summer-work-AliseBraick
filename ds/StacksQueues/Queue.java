import java.io.*;
import java.util.*;

public class Queue{
  
    // private instance variables Arraylist
  private ArrayList<Integer> dataQ;

    // Create constructors/Objects defaut no parameters
  public Queue (){
    dataQ = new ArrayList<Integer> ();
  }

  //toString() - return a string with all the data in the stack
  public String toString(){
    String s = "";
    s = s + dataQ;
    return s;
  }
  //void enqueue(int value) - add value to the end of the queue
  public void enqueue(int num){
    dataQ.add(num);
  }
  
  //int size() - return the number of elements currently in the queue 
  public int size(){
    return dataQ.size();
  }

  //isEmpty() - return true of the queue is empty, false otherwise
  public boolean isEmpty(){
    if (dataQ.size() == 0) {
       return true; 
    } else {
      return false;
    }    
  }

  //int front() - return but do not remove the top value from the front of the queue
  public Integer front(){
     if (dataQ.size() == 0){
        return null;
      } else {
      return dataQ.get(0);   
    }
  }
  
//int dequeue()remove and return the top value from front of the queue
  public Integer dequeue(){
    if (dataQ.size() == 0){
      return null;
    } else {
      dataQ.remove(0);
      return dataQ.get(0);
    }
  }
}

